package vn.com.vtd.framework.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.model.service.INewService;
import vn.com.vtd.framework.utils.HttpUtil;
import vn.com.vtd.framework.utils.SessionUtil;

@WebServlet(urlPatterns = { "/api-admin-new" })
public class NewAPI extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private INewService newSerive;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8"); 
		response.setContentType("application/json");
		NewModel newModel = HttpUtil.of(request.getReader()).toModel(NewModel.class);
		newModel.setCreatedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		newModel = newSerive.save(newModel);
		mapper.writeValue(response.getOutputStream(), newModel);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		NewModel newModel = HttpUtil.of(request.getReader()).toModel(NewModel.class);
		newModel.setModifiedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		newModel = newSerive.update(newModel);
		mapper.writeValue(response.getOutputStream(), newModel);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		// => để chi client có data json có chuỗi tiếng việt, để tính trạng không bị lỗi
		// font
		response.setContentType("application/json");
		// => server trả kết quả về cho client là kiểu dữ liệu json
		NewModel newModel = HttpUtil.of(request.getReader()).toModel(NewModel.class);
		newSerive.delete(newModel.getIds());
		// Chuyển từ object thành json
		mapper.writeValue(response.getOutputStream(), "{}");
	}

}
