package com.zhiyou100.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhiyou100.bean.Password;
import com.zhiyou100.dao.impl.PasswordDaoImpl;
import com.zhiyou100.service.IPasswordService;
import com.zhiyou100.service.PasswordServiceImpl;
import com.zhiyou100.util.PageResult;

/**
 * Servlet implementation class DeletePasswordInfoServlet
 */
@WebServlet("/DeletePasswordInfo.action")
public class DeletePasswordInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePasswordInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		IPasswordService passwordService = new PasswordServiceImpl();
		int uId =(int) session.getAttribute("uId");
		String str  =request.getParameter("pId");
		long pId =Long.parseLong(str);
		PageResult<Password> pageResult =passwordService.delete(1, 10, pId, uId);
		request.setAttribute("pageResult", pageResult);
		request.getRequestDispatcher("listPassword.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
