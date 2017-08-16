<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link href="resource/css/home.css" rel="stylesheet" type="text/css">
<script src="resource/common/js/jquery.js" type="text/javascript"></script>
<script src="resource/common/js/bootstrap.js" type="text/javascript"></script>
<script src="resource/common/icheck/icheck.min.js"
	type="text/javascript"></script>
<title>密码信息管理系统-个人信息</title>
</head>
<body>
<div class="menu">
	<div class="container">
	<div class="menu-nav">
		<ul class="nav nav-pills navbar-fixed-top container">
			<li class="home"><a  href="home.jsp">首页</a></li>
			<li><a href="javascript:ajaxLoad('userInfo.jsp')">个人信息</a></li>
			<li><a href="#">密码管理</a></li>
			<li><a href="#">修改信息</a></li>
			<li><a href="#">安全管理</a></li>
			<div class="exit">
				<a href="exit.jsp">退出</a>
			</div>
			
		</ul>
	</div>
	</div>
</div>
<div id="main" class="main">
	<div class="container">
		<div id="maincontent" class="row maincontent">
	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">个人信息</h3>
		</div>
		<div class="panel-body">
			<div class="headimage">
				<img src="resource/image/userHead/userDefault.jpg" alt="">
			</div>
			<div class="info">
				<table>
					<tr><td>姓名</td><td>张炎峰</td></tr>
					<tr><td>账号</td><td>zhangyanfeng</td></tr>
					<tr><td>性别</td><td>男</td></tr>
					<tr><td>电子邮箱</td><td>111111111@qq.com</td></tr>
					<tr><td>联系方式</td><td>11111111111</td></tr>
					<tr><td>QQ</td><td>111111111</td></tr>
				</table>
			</div>
		</div>
	</div>
			</div>
	</div>
	
</div>
</body>
</html>