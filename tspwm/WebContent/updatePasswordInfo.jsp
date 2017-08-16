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
<link href="resource/css/upPw.css" rel="stylesheet" type="text/css">
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
				<h5 class="modal-title register_title" id="myModalLabel">编辑密码记录</h5>
			</div>
				
			<div class="modal-body reginput">
			<form class="form-horizontal" id="savePasswordForm">
				<input type="text" hidden="hidden" name="pId" value="${result.pId }">
				<input type="text" hidden="hidden" name="url" value="${result.url }">
				<div class="form-group">
					<div class="label-left">
						<label class="control-label">登录网址：<a>${result.url }</a></label>
					</div>
				</div>
				<div class="form-group">
				<div class="label-left">
					<label class="control-label">网站名称：</label></div>
					<input type="text" name="urlName" class="form-control" value="${result.urlName }">
				</div>
				<div class="form-group">
				<div class="label-left">
					<label class="control-label">登录账号：</label></div>
					<input type="text" name="loginAcc" class="form-control" value="${result.loginAcc }">
				</div>
				<div class="form-group">
				<div class="label-left">
					<label class="control-label">登录密码：</label></div>
					<input type="text" name="loginPassword" class="form-control" value="${result.loginPassword }">
				</div>
				<div class="form-group">
				<div class="label-left">
					<label class="control-label">绑定QQ:</label></div>
					  <input type="radio" class="icheckbox" name="qq" value="true" ${result.qq?"checked='checked'":"" }> 是
					  <input type="radio" name="qq" value="false" ${result.qq?"":"checked='checked'"}> 否
				</div>
				<div class="form-group">
				<div class="label-left">
					<label class="control-label">绑定微信:</label>
				</div>
				<div class="wechat">
					<input type="radio" name="wechat" class="wechat1"  value="true" ${result.wechat?"checked='checked'":"" }> 是
				</div>
				<div class="wechat">
					<input type="radio" class="wechat2" name="wechat" value="false" ${result.wechat?"":"checked='checked'"}> 否
				</div>
				</div>
				<div class="form-group">
				<div class="label-left">
					<label class="control-label">注册手机:</label>
					</div>
					<input type="text" class="form-control" name="phone" value="${result.phone }">
				</div>
				<div class="form-group">
				<div class="label-left">
					<label class="control-label">注册邮箱:</label>
					</div>
					<input type="text" class="form-control" name="email" value="${result.email }">
				</div>
				<div class="modal-footer">
					<button type="submit"
						class="button button-highlight button-rounded  button-large quxiao_button"
						data-dismiss="modal" id="savePasswordInfo">保存</button>
				</div>
		</form>
			</div>
		</div>
	</div>
	<script>
	$(function() {
		$("#savePasswordInfo").click(function() {
			$.ajax({
				url : "savePasswordInfo.action",
				type : "post",
				data : $("#savePasswordForm").serialize(),
				success : function(data) {
					$("#myModal").modal("hide");
					$("#maincontent").html(data);
				}
			});
		});
	});
</script>
</body>
</html>