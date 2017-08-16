package com.zhiyou100.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class CommonFilter
 */
public class CommonFilter implements Filter {

    /**
     * filter先于Servlet执行
     * 每一个Servlet执行之前都要先调用doFilter方法
     */
    public CommonFilter() {
    	System.out.println("Filter 被创建");
    }

	public void destroy() {
		System.out.println("Filter 被销毁");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletRequest req =(HttpServletRequest) request;//先对强制转换
		HttpServletResponse res =(HttpServletResponse)response;
		HttpSession session = req.getSession();//获取session
		//Object uId = session.getAttribute("u_id");
		String path =req.getRequestURI();
		System.out.println(path);
		//做一个判断,包含login时不过滤 或者是/tspwm/下的不过滤
		//处理空指针异常
		//if (path.contains("login") || path.equals("/tspwm/")) {
//		if ( path.equals("/tspwm/")|| path.contains("login")||path.contains("addUserInfoServlet")) {
//			chain.doFilter(request, response);//请求转发给过滤器链上下一个对象
//			return ;
//		}
//		
//		if (uId==null) {//如果session中没有数据,说明没有登录,重定向到登录页面
//			System.out.println("正在过滤");
//			res.sendRedirect("login.jsp");
//			return;
//		}else{
//			chain.doFilter(request, response);
//			return ;
//		}
		//System.out.println("执行doFilter方法");
		if(path.equals("/tspwm/")/*||path.contains("action")*/) {
			chain.doFilter(request, response);
			return;
		}
		if(!(path.contains("login")||path.contains("addUserInfoServlet"))){
			Object uId =session.getAttribute("uId");
			if(uId == null) {
				//说明未登录，则返回至登录页面
				res.sendRedirect("login.jsp");
				return;
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("初始化Filter");
	}

}
