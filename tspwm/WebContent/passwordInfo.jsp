<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="com.zhiyou100.bean.Password" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link href="resource/css/pwInfo.css" rel="stylesheet" type="text/css">
<script src="resource/common/js/jquery.js" type="text/javascript"></script>
<script src="resource/common/js/bootstrap.js" type="text/javascript"></script>
<script src="resource/common/icheck/icheck.min.js"
	type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
	<%
	Password p = (Password) request.getAttribute("result");
	Object obj = request.getAttribute("message");

%>
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
				</button>
				<h5 class="modal-title register_title" id="myModalLabel">查看账号密码</h5>
			</div>
		
		<div class="modal-body reginput">
		<div class="form-group">
				<div>
					<label>登录网址：</label>
				</div>
				<label><a><%= p.getUrl() %></a></label>
			</div>
			<div class="form-group">
				<div>
					<label>登录账号：</label>
				</div>
				<input type="text" class="form-control" readonly="readonly"
					value="<%= p.getLoginAcc() %>">
			</div>
			<div class="form-group">
				<div>
					<label>登录密码：</label>
				</div>
				<input type="text" class="form-control" readonly="readonly"
					value="<%=p.getLoginPassword() %>">
			</div>
			<div class="modal-footer">
				<button type="button"
					class="button button-highlight button-rounded  button-large quxiao_button"
					data-dismiss="modal">返回</button>
			</div>

		</div>
	</div>
</div>
</body>
</html>