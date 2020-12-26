package vn.com.vtd.framework.controller.admin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import vn.com.vtd.framework.constant.SystemConstant;
import vn.com.vtd.framework.excel.AutoExcel;
import vn.com.vtd.framework.excel.imports.DataSet;
import vn.com.vtd.framework.excel.parameters.FieldSetting;
import vn.com.vtd.framework.excel.parameters.ImportPara;
import vn.com.vtd.framework.model.bean.Product;
import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.model.dao.impl.ProductDAO;
import vn.com.vtd.framework.model.service.IUserService;
import vn.com.vtd.framework.paging.PageRequest;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/admin-user")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private IUserService userService;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        String status = request.getParameter("status");
        String message = request.getParameter("message");
        if (SystemConstant.LIST.equals(type)) {
            List<UserModel> userList = userService.findAll(new PageRequest());
            request.setAttribute("userList", userList);
            request.setAttribute("status", status);
            request.setAttribute("message", message);

            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/jsp/home.jsp");
            rd.forward(request, response);
        } else if (SystemConstant.CREATE.equals(type)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/jsp/create-user-basic.jsp");
            rd.forward(request, response);
        } else if (SystemConstant.CREATE_FILE.equals(type)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/jsp/create-user-file-view.jsp");
            rd.forward(request, response);
        } else if (SystemConstant.RUN.equals(type)) {
            //insert without batch
            importExcel();
            System.out.println("---------------------------------------------------------------");
            //insert with batch
            try {
                importExcelWithBatch();
            } catch (ClassNotFoundException | IOException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        for (Part part : request.getParts()) {
            String fileName = extractFileName(part);
            if (fileName.trim().isEmpty()) {
                break;
            }
            // refines the fileName in case it is an absolute path
            fileName = new File(fileName).getName();

            part.write(this.getFolderUpload().getAbsolutePath() + File.separator + fileName);
        }
        response.sendRedirect(
                request.getContextPath() + "/admin-user?type=list&status=ok&message=Upload file success!");

    }

    /**
     * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
     */
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
     */
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * Extracts file name from HTTP header content-disposition
     */
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

    public File getFolderUpload() {
        File folderUpload = new File(System.getProperty("user.home") + "/Uploads");
        if (!folderUpload.exists()) {
            folderUpload.mkdirs();
        }
        return folderUpload;
    }

    public static List<Path> findByFileName(Path path) throws IOException {

        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory!");
        }
        String regex = "^(Import)[-]\\d{1,3}(.xlsx)$";
        List<Path> result;
        // walk file tree, no more recursive loop
        try (Stream<Path> walk = Files.walk(path, 1)) {
            result = walk.filter(Files::isReadable) // read permission
                    .filter(Files::isRegularFile) // is a file
                    .filter(p -> p.getFileName().toString().matches(regex)).collect(Collectors.toList());
        }
        return result;
    }
    
    public void importExcelWithBatch() throws IOException, ClassNotFoundException, SQLException {
        List<ImportPara> importParas = new ArrayList<ImportPara>() {
            {
                add(new ImportPara(0, genProductFieldSettings()));
            }
        };
        String folderPath = "D:\\html";
        Path path = Paths.get(folderPath);
        List<Path> listPath = findByFileName(path);
        DataSet dataSet2 = null;
        for (Path path2 : listPath) {
            dataSet2 = AutoExcel.read(folderPath + "\\" + path2.getFileName().toString(), importParas);
        }
        List<Product> products = dataSet2.get(0, Product.class);
        ProductDAO productDAO = new ProductDAO();
        productDAO.insertWithBatch(200, products);
    }

    public void importExcel() throws IOException {
        List<ImportPara> importParas = new ArrayList<ImportPara>() {
            {
                add(new ImportPara(0, genProductFieldSettings()));
            }
        };
        String folderPath = "D:\\html";
        Path path = Paths.get(folderPath);
        List<Path> listPath = findByFileName(path);
        DataSet dataSet2 = null;
        for (Path path2 : listPath) {
            dataSet2 = AutoExcel.read(folderPath + "\\" + path2.getFileName().toString(), importParas);
        }
        List<Product> products = dataSet2.get(0, Product.class);
        ProductDAO productDAO = new ProductDAO();
        long startTime = System.currentTimeMillis();
        for (Product product : products) {
            productDAO.save(product);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Done.");
        System.out.println("Total time: " + (endTime - startTime));
        
//        DataSet dataSet = AutoExcel.read(fileName, importParas);
        // Method 1: Obtain the original data without type conversion, you can
        // check whether the data meets the requirements in this way
//        List<Map<String, Object>> products = dataSet.get("Product");
//        List<Map<String, Object>> projects = dataSet.get("Project");
        // Method 2: Obtain the data of the specified class through the sheet index, the
        // type is
        // automatically converted, and an exception will be thrown if the conversion
        // fails
        // List<Product> products = dataSet.get(0, Product.class);
        // List<Project> projects= dataSet.get(1, Project.class);
        // Method 3: Obtain the data of the specified class through the sheet name, the
        // type is
        // automatically converted, and an exception will be thrown if the conversion
        // fails
        // List<Product> products = dataSet.get("Product", Product.class);
        // List<Project> projects = dataSet.get("Project", Project.class);
    }

    public static List<FieldSetting> genProductFieldSettings() {
        List<FieldSetting> fieldSettings = new ArrayList<FieldSetting>() {
            private static final long serialVersionUID = 1L;

            {
                add(new FieldSetting("productName", "Product Name"));
                add(new FieldSetting("basalArea", "Basal Area"));
                add(new FieldSetting("availableArea", "Available Area"));
                add(new FieldSetting("buildingArea", "Building Area"));
                add(new FieldSetting("buildingsNumber", "Buildings Number"));
            }
        };
        return fieldSettings;
    }

}
