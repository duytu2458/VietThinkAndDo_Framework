package vn.com.vtd.framework.controller.user;

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
import vn.com.vtd.framework.dto.NewDto;
import vn.com.vtd.framework.model.bean.CommentModel;
import vn.com.vtd.framework.model.service.ICommentService;
import vn.com.vtd.framework.model.service.INewService;
import vn.com.vtd.framework.paging.PageRequest;
import vn.com.vtd.framework.paging.Pageble;

/**
 * Servlet implementation class NewsController
 */
@WebServlet("/user-new")
public class NewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private INewService newService;

	@Inject
	private ICommentService commentService;

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
		String type = request.getParameter("type");

		if (SystemConstant.LIST.equals(type)) {

//			Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(), model.getSortName(),
//					model.getSortBy());

//			Integer offset = (model.getPage() - 1) * model.getMaxPageItem();
//			model.setListResult(newService.findAll(pageble));
//			model.setListResult(newService.findAll(pageble));
//			model.setTotalItem(newService.getTotalItem());
//			model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));

//			request.setAttribute(SystemConstant.MODEL, model);
//			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/new/list.jsp");

			List<NewDto> newDtoList = newService.findAllTitleAndCreateBy(new PageRequest());

			request.setAttribute("newDtoList", newDtoList);

			RequestDispatcher rd = request.getRequestDispatcher("/views/user/jsp/home.jsp");
			rd.forward(request, response);

		} else if (SystemConstant.DETAIL.equals(type)) {
			String id = request.getParameter("id");
			String createdBy = request.getParameter("createdBy");
			request.setAttribute("news", newService.findOne(Long.parseLong(id)));
			List<CommentModel> commentList = commentService.findByNewId(Long.parseLong(id));
			request.setAttribute("commentList", commentList);
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/jsp/article-view.jsp");
			rd.forward(request, response);

		}
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
