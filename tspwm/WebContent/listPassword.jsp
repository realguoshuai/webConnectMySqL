<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resource/common/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<link href="resource/common/css/animate.css" rel="stylesheet"
	type="text/css">
<link href="resource/common/css/buttons.css" rel="stylesheet"
	type="text/css">
<link href="resource/common/icheck/css/custom.css" rel="stylesheet">
<link href="resource/common/icheck/skins/all.css" rel="stylesheet">
<link href="resource/css/listPw.css" rel="stylesheet" type="text/css">
<script src="resource/common/js/jquery.js" type="text/javascript"></script>
<script src="resource/common/js/bootstrap.js" type="text/javascript"></script>
<script src="resource/common/icheck/icheck.min.js"
	type="text/javascript"></script>
<title>密码信息管理系统-密码管理</title>
</head>
<body>
	<div class="main-title">
		<h4>你所拥有的密码</h4>
	</div>
	<table
		class="table table-bordered table-hover recommend-main list-table">
		<tr>
			<td>序号</td>
			<td>网址</td>
			<td>网站名字</td>
			<td>是否绑定QQ</td>
			<td>是否绑定微信</td>
			<td>登录账号</td>
			<td>操作</td>
		</tr>
		<%
						int i = 1;
					
					%>
		<c:forEach var="password" items="${pageResult.listData}">
			<tr>
				<td><%= i++ %></td>
				<td><a href="http://${password.url}>">${password.url}</a></td>
				<td>${password.urlName}</td>
				<c:if test="${password.qq}">
					<td>是</td>
				</c:if>
				<c:if test="${!(password.qq)}">
					<td>否</td>
				</c:if>
				<c:if test="${password.wechat}">
					<td>是</td>
				</c:if>
				<c:if test="${!(password.wechat)}">
					<td>否</td>
				</c:if>
				<td>${password.loginAcc}</td>
				<td><a
					href="javascript:theBox('queryPassword.action?pId=${password.pId }')">查看</a>
					<a
					href="javascript:theBox('UpdatePasswordInfo.action?pId=${password.pId }')">修改</a>
					<a
					href="javascript:ajaxLoad('DeletePasswordInfo.action?pId=${password.pId }')">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<nav aria-label="Page navigation" class="navigation">
			<ul class="pagination">
				<li ${pageResult.currentPage == 1 ? "class='disabled'":"" }><a
					href="javascript:ajaxLoad('listPasswordServlet.action?currentPage=1')"
					aria-label="Previous"> <span aria-hidden="true">首页</span>
				</a></li>
				<li ${pageResult.currentPage == 1 ? "class='disabled'":"" }><a
					href="javascript:ajaxLoad('listPasswordServlet.action?currentPage=${pageResult.prevPage }')"
					aria-label="Previous"> <span aria-hidden="true">上一页</span>
				</a></li>
				<c:forEach begin="${pageResult.beginPage }"
					end="${pageResult.totalPage }" var="num">
					<li ${pageResult.currentPage == num ? "class='active'":"" }><a
						href="javascript:ajaxLoad('listPasswordServlet.action?currentPage=${num }')">${num }</a></li>
				</c:forEach>

				<li
					${pageResult.currentPage == pageResult.totalPage ? "class='disabled'":"" }>
					<a
					href="javascript:ajaxLoad('listPasswordServlet.action?currentPage=${pageResult.nextPage }')"
					aria-label="Next"> <span aria-hidden="true">下一页</span>
				</a>
				</li>
				<li
					${pageResult.currentPage == pageResult.totalPage ? "class='disabled'":"" }>
					<a
					href="javascript:ajaxLoad('listPasswordServlet.action?currentPage=${pageResult.totalPage }')"
					aria-label="Next"> <span aria-hidden="true">末页</span>
				</a>
				</li>
			</ul>
		</nav>
	</div>
</body>
</body>
</html>