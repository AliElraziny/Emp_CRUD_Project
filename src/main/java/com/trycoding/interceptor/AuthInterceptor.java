package com.trycoding.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.trycoding.entity.User;

public class AuthInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		User usr = (User) request.getSession().getAttribute("usrObj");
		if(usr == null) {
			request.getSession().setAttribute("msg", "Please Login");
			response.sendRedirect("/login");
			return false ;
		}
	    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0
        response.setDateHeader("Expires", 0);
		return true ; 
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
