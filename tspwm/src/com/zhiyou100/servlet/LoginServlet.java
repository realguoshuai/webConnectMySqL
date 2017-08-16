package com.zhiyou100.servlet;

import java.io.IOException;
import java.net.ResponseCache;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhiyou100.bean.User;
import com.zhiyou100.service.IUserService;
import com.zhiyou100.service.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("执行loginServlet的doGet方法");
		String phone = request.getParameter("phone");//getParameter()得到参数
		String password = request.getParameter("password");
		IUserService userService = new UserServiceImpl();//
		//boolean loginStatus = userService.login(phone, password);
		User user = userService.login(phone, password);
		//System.out.println("test: "+loginStatus);
//		if (loginStatus) {
//			response.sendRedirect("home.jsp");//无数据重定向
//			//System.out.println("test:1"+loginStatus);
//		}else{
//			response.sendRedirect("login.jsp");
//			//response.sendRedirect("login.jsp");
//			//System.out.println("test:2"+loginStatus);
//		}
		if (user==null) {
			response.sendRedirect("login.jsp");
		}else{//登陆成功-->
			//1.获取session对象
			HttpSession session = request.getSession();
			session.setAttribute("uId", user.getId());
			session.setAttribute("userPhone", user.getPhone());
			session.setAttribute("userName", user.getName());
			response.sendRedirect("home.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	@Override
	public void init() throws ServletException {
		System.out.println("该servlet初始化");
	}
	

}
