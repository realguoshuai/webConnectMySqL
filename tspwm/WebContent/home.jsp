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
<title>密码管理系统-主页</title>
</head>
<body>
<div class="menu">
	<div class="container">
	<div class="menu-nav">
		<ul class="nav nav-pills navbar-fixed-top container">
			<li class="home"><a  href="home.jsp">首页</a></li>
			<li><a href="javascript:ajaxLoad('userInfo.jsp')">个人信息</a></li>
			<li><a href="javascript:ajaxLoad('listPasswordServlet.action?uId=<%=session.getAttribute("uId") %>')">密码管理</a></li>
			<li><a href="javascript:ajaxLoad('updateUserInfo.jsp')">修改信息</a></li>
			<li><a href="javascript:ajaxLoad('updatePassword.jsp')">安全管理</a></li>
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
			<table  class="table table-bordered recommend">
				<tr>
					<td>
						<a href="http://www.pcsky.wang/" class="hot">【今日推荐】&nbsp;&nbsp;&nbsp;</a>
						<a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a>
					</td>
				</tr>
				<tr>
					<td class="hot-content">
						链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	
					</td>
				</tr>
			</table>
			<div class="main-title">
				<h4>最新发布</h4>
			</div>
			
			<table  class="table table-bordered table-hover recommend-main">
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
				<tr>
					<td>
						<h2><a href="http://www.pcsky.wang/" class="hot-name">哈哈哈Hadoop视频</a></h2><br>
						<p class="main-p">链接:https://pan.baidu.com/s/1cEGqvG 密码:48s4	</p>
					</td>
				</tr>
			</table>
		</div>
	</div>
	
</div>	
</body>
<script>

function theBox(url){
	$.ajax({
		type:"post",
		url:url,
		success:function(data){
			$("#myModal").html(data).modal("show");
		},
	});
}

/*使用ajax */
function ajaxLoad(url){
	$.ajax({
		type:"post",
		url:url,
		success:function(data){
			$("#maincontent").html(data);
		}
	});
}
</script>
</html>