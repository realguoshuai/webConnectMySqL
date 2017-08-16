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
import com.zhiyou100.util.PageResult;

/**
 * Servlet implementation class SavePasswordInfoServlet
 */
@WebServlet("/SavePasswordInfo.action")
public class SavePasswordInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SavePasswordInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		int uId= (int) session.getAttribute("uId");
		long pId= Long.parseLong(request.getParameter("pId"));
		String url = request.getParameter("url");
		String urlName = request.getParameter("urlName");
		String loginAcc = request.getParameter("loginAcc");
		String loginPassword = request.getParameter("loginPassword");
		boolean qq = Boolean.parseBoolean(request.getParameter("qq"));
		boolean wechat = Boolean.parseBoolean(request.getParameter("wechat"));
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		Password p = new Password(pId, uId,url, urlName, loginAcc, loginPassword, qq, wechat, phone, email);
		IPasswordService passwordService = new PasswordServiceImpl();
		PageResult<Password> pageResult = passwordService.update(1,10,p);
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
