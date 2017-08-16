package com.zhiyou100.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhiyou100.bean.Password;
import com.zhiyou100.service.IPasswordService;
import com.zhiyou100.service.PasswordServiceImpl;

/**
 * Servlet implementation class QueryPasswordServlet
 */
@WebServlet("/queryPassword.action")
public class QueryPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		IPasswordService passwordService = new PasswordServiceImpl();
		int uId = (int) session.getAttribute("uId");
		String str = request.getParameter("pId");
		long pId = Long.parseLong(str);
		Password p = passwordService.query(pId, uId);
		request.setAttribute("result", p);
		request.getRequestDispatcher("passwordInfo.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
