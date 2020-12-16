package vn.com.vtd.framework.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.com.vtd.framework.constant.SystemConstant;
import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.utils.SessionUtil;

public class AuthorizationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String url = request.getRequestURI();
		if (url.startsWith(SystemConstant.ROOT_ADMIN)) {
			UserModel model = (UserModel) SessionUtil.getInstance().getValue(request, SystemConstant.SESSION_USERNAME);
			if (model != null) {
				if (SystemConstant.ADMIN.equals(model.getRole().getCode())) {
					filterChain.doFilter(servletRequest, servletResponse);
				} else if (SystemConstant.USER.equals(model.getRole().getCode())) {
					response.sendRedirect(request.getContextPath() + SystemConstant.VIEW_NOT_PERMISSION);
				}
			} else {
				response.sendRedirect(request.getContextPath() + SystemConstant.VIEW_NOT_LOGGED);

			}
		} else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
	}

	@Override
	public void destroy() {

	}
}
