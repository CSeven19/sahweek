<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="cn.javareview.ssm.controller.audioIndexController" %>
<%@ page import="cn.javareview.ssm.po.UserParams" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>softRB</title>
    <jsp:include page="link.jsp" flush="true"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  <body>
  	<jsp:include page="header.jsp" flush="true"></jsp:include>
	<div class="row softRBpanemainTheme" style="height:400px;margin-left:5px;margin-top:50px;">
		<div style="margin-top: 50px; margin-left:50px;width:100px;height:300px;display:block;float:left;">
			<a href="SkillList/jumpSoftRBpane.action">
				<img alt="navigate_SoftBRList" src="/Java_Review2016/Image/navigate_SoftBRList.png" style="width:100px;height:100px;margin-left:10px;">
			</a>
			<a href="SkillList/GraphicPane.action">
			<img alt="navigategraphic" src="/Java_Review2016/Image/navigategraphic.png" style="width:100px;height:100px;margin-top:50px;margin-left:10px;">
			</a>
		</div>
		<div id="listOfSoftBRDiv" style="margin-left:50px;display:inline-block;">
			<table id="listOfSoftBRList">
			</table>
		</div>
	</div>
	<jsp:include page="footer.jsp" flush="true"></jsp:include>
  </body>
  <script>
  	initListOfSoftBRList();
  </script>
</html>
