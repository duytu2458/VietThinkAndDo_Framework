package vn.com.vtd.framework.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.com.vtd.framework.constant.SystemConstant;
import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.model.service.ICategoryService;
import vn.com.vtd.framework.model.service.INewService;
import vn.com.vtd.framework.paging.PageRequest;
import vn.com.vtd.framework.paging.Pageble;
import vn.com.vtd.framework.paging.Sorter;
import vn.com.vtd.framework.utils.FormUtil;

/**
 * Servlet implementation class HomeController
 */
//@WebServlet(value = "/trang-chu")
@WebServlet(urlPatterns = { "/admin-new" })
public class NewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private INewService newService;

	@Inject
	private ICategoryService categoryService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		NewModel model = new NewModel();
//		String pageStr = request.getParameter("page");
//		String maxPageItemStr = request.getParameter("maxPageItem");
//		if(pageStr != null) {
//			model.setPage(Integer.parseInt(pageStr));
//		}else {
//			model.setPage(1);
//		}
//		
//		if(maxPageItemStr != null) {
//			model.setMaxPageItem(Integer.parseInt(maxPageItemStr));
//		}else {
//			model.setMaxPageItem(10);
//		}

		NewModel model = FormUtil.toModel(NewModel.class, request);

		String view = null;

		if (SystemConstant.LIST.equals(model.getType())) {
			Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(), model.getSortName(),
					model.getSortBy());

//			Integer offset = (model.getPage() - 1) * model.getMaxPageItem();
			model.setListResult(newService.findAll(pageble));
//			model.setListResult(newService.findAll(pageble));
			model.setTotalItem(newService.getTotalItem());
			model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));

//			request.setAttribute(SystemConstant.MODEL, model);
//			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/new/list.jsp");
			view = "/views/admin/new/list.jsp";
//			rd.forward(request, response);
		} else if (SystemConstant.EDIT.equals(model.getType())) {
			if (model.getId() != null) {
				model = newService.findOne(model.getId());
			}
			request.setAttribute("categories", categoryService.findAll());
			view = "/views/admin/new/edit.jsp";
		}

//		MessageUtil.showMessage(request);
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
