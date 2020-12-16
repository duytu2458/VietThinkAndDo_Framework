package vn.com.vtd.framework.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		if (SystemConstant.LIST.equals(type)) {
			List<UserModel> userList = userService.findAll(new PageRequest());

			request.setAttribute("userList", userList);

			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/jsp/home.jsp");
			rd.forward(request, response);
		} else if (SystemConstant.CREATE.equals(type)) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/jsp/create-user-basic.jsp");
			rd.forward(request, response);
		}else if (SystemConstant.CREATE_FILE.equals(type)) {
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
		UserModel user = FormUtil.toModel(UserModel.class, request);
		userService.save(user);
		response.sendRedirect(request.getContextPath() + "/admin-user?type=list");
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

}
