package com.zhiyou100.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhiyou100.bean.Password;
import com.zhiyou100.service.IPasswordService;
import com.zhiyou100.service.PasswordServiceImpl;
import com.zhiyou100.util.PageResult;

/**
 * Servlet implementation class ListPasswordServlet
 */
@WebServlet("/listPasswordServlet.action")
public class ListPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListPasswordServlet() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//根据登录的用户查询所属的密码列表,得到UID
//		HttpSession session =request.getSession();
//		int uId =(int) session.getAttribute("uId");
//		List<Password> list = new PasswordServiceImpl().listAllByUId(uId);
//		request.setAttribute("listpassword", list);
//		request.getRequestDispatcher("listPassword.jsp").forward(request, response);
		HttpSession session = request.getSession();
		IPasswordService passwordService = new PasswordServiceImpl();
		//不分页
		//List<Password> list = passwordService.listAllByUId(uId);
		//request.setAttribute("listPassword", list);
		//分页
		int uId = (int) session.getAttribute("uId");
		int currentPage = 1;
		int pageSize = 10;//目前设置为定值10
		String cp = request.getParameter("currentPage");
		if(cp != null) currentPage = Integer.parseInt(cp);
		PageResult<Password> pageResult = passwordService.pageResultByUId(currentPage, pageSize, 1);
		request.setAttribute("pageResult", pageResult);
		request.getRequestDispatcher("listPassword.jsp").forward(request, response);}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
