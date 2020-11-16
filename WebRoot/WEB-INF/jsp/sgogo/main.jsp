<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<title>Welcome to Sgogo</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<jsp:include page="link.jsp" flush="true"/>
</head>
  
<body class="audioIndexTheme">
	<div id="profile" style="height:70px;background-color:black;display:blcok;"></div>
	<div id="logoandmainlink" style="height:180px;background-color:#fafbfc;border-bottom:1px solid #e1e4e8"><img alt="" src="">
		<!-- <div id="logo" style="height:134px;"></div> -->
		<div id="logo" style="height:105px;"></div>
		<div id="mainlink" style="margin-left:180px;">
			<span id="mainlink_status" class="mainlink mainlinkhover"><!-- <br> -->
				<img src="/sgogo/Image/sgogo/statusicon.svg" style="height:25px;weight:25px"/>
				<a style="color:#586069;text-decoration:none;">Status</a>
			</span>
			<span id="mainlink_schedule" class="mainlink"><!-- <br> -->
				<img src="/sgogo/Image/sgogo/calendaricon.svg" style="height:20px;weight:20px"/>
				<a style="color:#586069;text-decoration:none;">Schedule</a>
			</span>
			<span id="mainlink_profile" class="mainlink"><!-- <br> -->
				<img src="/sgogo/Image/sgogo/profileicon.svg" style="height:20px;weight:20px"/>
				<a style="color:#586069;text-decoration:none;">Profile</a>
			</span>
			<span id="mainlink_history" class="mainlink"><!-- <br> -->
				<img src="/sgogo/Image/sgogo/historyicon.svg" style="height:20px;weight:20px"/>
				<a style="color:#586069;text-decoration:none;">History|Graphs</a>
			</span>
		</div>
	</div>
	
	<!-- main pane -->
	<div id="main_panediv" style="text-align:center">
	
		<!-- main_status_topestcontainer -->
		<div id="main_status_topestcontainer" class="topestcontainer" style="">
			<jsp:include page="status.jsp" flush="true" />
		</div>
		
		<!-- main_schedule_topestcontainer -->
		<div id="main_schedule_topestcontainer" class="topestcontainer" style="display:none;overflow:hidden;">
			<jsp:include page="schedule.jsp" flush="true" />
		</div>
		<!-- main_profile_topestcontainer -->
		<div id="main_profile_topestcontainer" class="topestcontainer" style="display:none">
			<jsp:include page="profile.jsp" flush="true" />
		</div>
		
		<!-- main_history_topestcontainer -->
		<div id="main_history_topestcontainer" class="topestcontainer" style="display:none">
			<jsp:include page="history.jsp" flush="true" />
		</div>
	
	</div>
	
	<!-- footer -->
	<div id="footerdiv" class="footer" style="">
	
	</div>
</body>
</html>
