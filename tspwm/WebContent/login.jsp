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
<link href="resource/css/login.css" rel="stylesheet" type="text/css">
<script src="resource/common/js/jquery.js" type="text/javascript"></script>
<script src="resource/common/js/bootstrap.js" type="text/javascript"></script>
<script src="resource/common/icheck/icheck.min.js" type="text/javascript"></script>
<title>密码管理系统-登录</title>
</head>
<body>
	<div class="main">
		<div class="container-fluid">
			<div class="login_left"></div>
			<div class="login animated bounceInLeft">
				<div class="login_right">
					<form action="loginServlet.action" method="post">
						<div class="form-group">
							<label class="login_title">用户登录</label>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="phone"
								placeholder="请输入手机号">
						</div>
						<div class="form-group">
							<input type="password" class="form-control login_right_password"
								name="password" placeholder="请输入登录密码">
						</div>
						<div class="skin skin-square">
							<input class="login_check" tabindex="9" type="checkbox"
								id="square-checkbox-1"> <label>记住我？</label>

						</div>
						<div class="login_buttons">
							<button type="submit"
								class="button button-highlight button-rounded button-large login_button">登录</button>

						</div>
					</form>
					<div class="reglink">
						<a href="" data-toggle="modal" data-target="#myModal">新用户注册</a>

					</div>
					<div class="forlink">
						<a href="">忘记密码？</a>
					</div>
				</div>

			</div>

		</div>


	</div>
	<!-- 新用户注册模态框 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title register_title" id="myModalLabel">新用户注册</h4>
					<div class="login_message" style="padding-left: 150px">
						<label id="maseeage"></label>
					</div>
					
				</div>
				<form action="addUserInfoServlet.action" method="get">
					<div class="modal-body reginput">
					<div class="form-group">
					<div> 
						<label>账号：</label>
					</div>
							<input id="regisPhone" type="text" class="form-control" name="phone"
								placeholder="请输入手机号">
						</div>
					<div class="form-group">
					<div> 
						<label>密码：</label>
					</div>
							<input type="password" class="form-control"
								name="password" placeholder="密码为字母或数字，不少于8位">
						</div>
						<div class="form-group">
						<div> 
						<label>再次输入密码：</label>
					</div>
							<input type="password" class="form-control"
								name="password1" placeholder="与上一次输入相同">
						</div>
					
					</div>
					<div class="modal-footer">
						<button type="reset" class="button button-highlight button-rounded  button-large quxiao_button" data-dismiss="modal">取消</button>
						<button type="submit" class="button button-highlight button-rounded button-large register_button">注册</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
<script>
	$(document).ready(function() {
		$('.skin-square input').iCheck({
			checkboxClass : 'icheckbox_flat-red',
		});
		$("#regisPhone").focus(function() {
			$("#regisPhone").css("background-color", "#FFFFCC");
		});
		$("#regisPhone").blur(function() {
			var regphone = /^(13[0-9]|15[0-9]|17[0-9]|18[0-9]|16[0-9])\d{8}$/;
			var uphone = $("#regisPhone").val();
			$("#regisPhone").css("background-color", "white");
			if (uphone.length <= 0 || !regphone.test(uphone)) {
				document.getElementById("maseeage").innerText= "手机号输入有误";
				$("#maseeage").show();
			} else {
				$("#maseeage").hide();
			}
		});
	});
</script>
</html>