package com.zhiyou100.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.service.IUserService;
import com.zhiyou100.service.UserServiceImpl;
public class AddUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddUserInfoServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String phone =request.getParameter("phone");
	String password=request.getParameter("password");
    IUserService userService = new UserServiceImpl();
    boolean regStatus =userService.register(phone, password);
    if (regStatus) {
    	//TODO boolean类型转化为用户User类型
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
