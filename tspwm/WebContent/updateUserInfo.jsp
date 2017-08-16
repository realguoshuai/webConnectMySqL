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
<link href="resource/css/userInfo.css" rel="stylesheet" type="text/css">
<script src="resource/common/js/jquery.js" type="text/javascript"></script>
<script src="resource/common/js/bootstrap.js" type="text/javascript"></script>
<script src="resource/common/icheck/icheck.min.js"
	type="text/javascript"></script>
<title>密码信息管理系统-个人信息</title>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">编辑个人信息</h3>
		</div>
		<div class="edit_button">
			<button type="button" class="btn btn-primary" onclick="javascript:ajaxLoad('updateUserInfo.jsp')">保存</button>
		</div>
		<div class="panel-body">
			<div class="headimage">
				<img src="resource/image/userHead/userDefault.jpg" alt="">
			</div>
			<div class="info">
				<table>
					<tr>
						<td>姓名</td>
						<td class="info_right">
							<input name="name" class="input_edit" type="text" value="张炎峰"/>
						</td></tr>
					<tr>
						<td>性别</td>
						<td class="info_right">
						<select name="sex" class="input_edit" >
							<option value="true">男</option>
							<option value="false">女</option>
						</select>
						</td>
					</tr>
					<tr>
						<td>毕业院校</td>
						<td class="info_right">
							<input name="name" class="input_edit" type="text" value="河南大学"/>
						</td>
					</tr>
					<tr><td>电子邮箱</td>
						<td class="info_right">
							<input name="name" class="input_edit" type="text" value="111111111@qq.com"/>
						</td>
					</tr>
					<tr><td>联系方式</td>
						<td class="info_right">
							<input name="name" class="input_edit" type="text" value="11111111111"/>
						</td>
					</tr>
					<tr><td>QQ</td>
						<td class="info_right">
							<input name="name" class="input_edit" type="text" value="11111111"/>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>