package vn.com.vtd.framework.controller.user;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.com.vtd.framework.constant.SystemConstant;
import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.model.service.ICategoryService;
import vn.com.vtd.framework.model.service.INewService;
import vn.com.vtd.framework.model.service.IUserService;
import vn.com.vtd.framework.utils.FormUtil;
import vn.com.vtd.framework.utils.SessionUtil;

/**
 * Servlet implementation class HomeController
 */
//@WebServlet(value = "/trang-chu")
@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap", "/thoat" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private ICategoryService categoryService;

	@Inject
	IUserService userService;

	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (SystemConstant.LOGIN.equals(action)) {
			String alert = request.getParameter("alert");
			String message = request.getParameter("message");
			if (message != null && alert != null) {
				request.setAttribute("message", resourceBundle.getString(message));
				request.setAttribute("alert", alert);
			}
			RequestDispatcher rd = request.getRequestDispatcher(SystemConstant.VIEW_LOGIN);
			rd.forward(request, response);
		} else if (SystemConstant.LOGOUT.equals(action)) {
			SessionUtil.getInstance().removeValue(request, SystemConstant.SESSION_USERNAME);
			response.sendRedirect(request.getContextPath() + "/trang-chu");
		} else {
			request.setAttribute("categories", categoryService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher(SystemConstant.VIEW_WEB_HOME);
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (SystemConstant.LOGIN.equals(action)) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = userService.findByUserNameAndPasswordAndStatus(model.getUserName(), model.getPassword(), 1);
			if (model != null) {
				SessionUtil.getInstance().putValue(request, SystemConstant.SESSION_USERNAME, model);
				if (SystemConstant.USER.equals(model.getRole().getCode())) {
					response.sendRedirect(request.getContextPath() + "/trang-chu");
				} else if (SystemConstant.ADMIN.equals(model.getRole().getCode())) {
					response.sendRedirect(request.getContextPath() + "/admin-home");
				}
			} else {
				response.sendRedirect(request.getContextPath()
						+ "/dang-nhap?action=login&message=username_password_invalid&alert=danger");
			}
		}
	}

}
