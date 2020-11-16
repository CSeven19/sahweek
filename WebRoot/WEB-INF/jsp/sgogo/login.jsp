<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="cn.javareview.ssm.controller.audioIndexController" %>
<%@ page import="cn.javareview.ssm.po.UserParams" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>">
	<title>Login</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<jsp:include page="link.jsp" flush="true"/>
	<link rel="stylesheet" href="/sgogo/CSS/sgogo/reset.css" type="text/css"/>
	<link rel="stylesheet" href="/sgogo/CSS/sgogo/style.css" type="text/css"/>
	<link rel="stylesheet" href="/sgogo/CSS/sgogo/supersized.css" type="text/css"/>
	<script type="text/javascript" src="/sgogo/JS/sgogo/supersized-init.js"></script>
	<script type="text/javascript" src="/sgogo/JS/sgogo/supersized.3.2.7.min.js"></script>
</head>

<body>
	<div class="page-container">
		<h1>Sgogo Login</h1>
		<form id="loginform" action="${pageContext.request.contextPath}/login/validateUser.action" method="post">
			<table>
				<tr>
					<td>
						<input type="text" name="username" class="username" placeholder="Username" autocomplete="off" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="password" name="password" class="password" placeholder="Password" oncontextmenu="return false"/>
					</td>
				</tr>
				<tr>
					<td>
						<button id="login_submit" type="button" onclick="loginFormSubmit()">Sign in</button>
					</td>
				</tr>
			</table>
		</form>
		<script type="text/javascript">
			var loginFormSubmit = function(){
				$("#loginform").submit();
			}
		</script>
		<div style="margin-top:200px;">
			<p>If we can only encounter each other rather than stay with each
				other,then I wish we had never encountered.</p>
			<p style="margin-top: 20px;">如果只是遇见，不能停留，不如不遇见。</p>
		</div>
	</div>
</body>
</html>
