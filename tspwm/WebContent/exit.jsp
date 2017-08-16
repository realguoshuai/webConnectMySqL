<%@ page pageEncoding="UTF-8"%>
<%
	//注销session
	session.invalidate();
	//跳转
	response.sendRedirect("login.jsp");
%>