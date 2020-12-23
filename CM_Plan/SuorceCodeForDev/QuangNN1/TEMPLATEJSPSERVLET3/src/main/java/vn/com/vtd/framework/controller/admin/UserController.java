package vn.com.vtd.framework.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.model.service.IUserService;
import vn.com.vtd.framework.paging.PageRequest;
import vn.com.vtd.framework.utils.FormUtil;

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
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        UserModel user = FormUtil.toModel(UserModel.class, request);
//        userService.save(user);
//        
        for (Part part : request.getParts()) {
            String fileName = extractFileName(part);
            if(fileName.trim().isEmpty()) {
                break;
            }
            // refines the fileName in case it is an absolute path
            fileName = new File(fileName).getName();

            part.write(this.getFolderUpload().getAbsolutePath() + File.separator + fileName);
        }
        response.sendRedirect(request.getContextPath() + "/admin-user?type=list&status=ok&message=Upload file success!");

        
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

}
