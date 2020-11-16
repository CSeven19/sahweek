<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
    
    <title>Welcome to this 2016Review of java</title>
    <jsp:include page="link.jsp" flush="true"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body class="audioIndexTheme">
  <div name="div1" style="display:blcok;">
   <audio id="divAudio" controls>
   <source src="http://localhost:8080/Java_Review2016/Materials/gandamu.mp3">
   </audio>
   <script>
   // Grab a handle to the video
   // Turn off the default controls
   $("#divAudio")[0].controls = false;
   </script>
   <div id="divAudiocontrols" style="width:45px;height:45px;float:left;">
   <img id="divAudioplaypause" name="audioPlayImg" src="/Java_Review2016/Image/audioplayNobackground.png" alt="audio" onclick="togglePlayPause()"/>
   </div>
   <script type="text/javascript">
   function togglePlayPause() {
	   var playpause = $("#divAudioplaypause");
	   if ($("#divAudio")[0].paused || $("#divAudio")[0].ended) {
	      playpause[0].title = "pause";
	      playpause[0].innerHTML = "pause";
	      $("#divAudio")[0].play();
	      rotation();
	   }
	   else {
	      playpause[0].title = "play";
	      playpause[0].innerHTML = "play";
	      $("#divAudio")[0].pause();
	      stopRotation();
	   }
   }
   function rotation() {
		   $("img[name=audioPlayImg]").rotate({
	 		  angle:0,
		      animateTo:-360,
		      callback: rotation,
		      easing: function (x,t,b,c,d){
		          return c*(t/d)+b;
		      }
		   });
		}
	function stopRotation(){
		    $("img[name=audioPlayImg]").stopRotate();
	}
	togglePlayPause();
   </script>
   <img alt="submit" src="/Java_Review2016/Image/userParamsSubmit.png" style="margin-top:2px;margin-left:10px;width:45px;height:45px;" title="submit" onclick="userParamsSubmit();"/>
   <img alt="profilevedio" src="/Java_Review2016/Image/profilevedio.png" style="margin-left:10px;width:45px;height:45px;" title="profileVedio" onclick="showProfileVedio();">
   </div><!--  div1  -->
   <%	audioIndexController audioindexcontroller = new audioIndexController();
   		UserParams userParams = audioindexcontroller.getUserParamsFromXML();
   %>
   <div name="div2" style="display:block;">
   	<form id="userParamsForm" action="${pageContext.request.contextPath}/Index/addUserParams.action" method="post">
   		<div style="width:250px;height:650px;margin-left:25px;float:left">
	   		<div class="audioIndexDivAnt" style="">
	   			<ul class="audioIndexUl" style="margin-top:40px;margin-left:130px">
		   				<li><%=userParams.getHP()%></li>
		   				<li><%=userParams.getEP()%></li>
		   		</ul>
	   		</div>
	   		<div class="audioIndexDivMoney" style="margin-top:366px">
	   			<table style="border-collapse: separate; border-spacing: 30px;margin-top:25px;margin-left:26px;">
		   				<tr><td><input name="RMB" type="text" class="audinIndexInput" value="<%=userParams.getRMB()%>" style="font-size: 10px;width:100px;"></input></td></tr>
		   				<tr><td><input name="playtime" type="text" class="audinIndexInput" value="<%=userParams.getPlaytime()%>" style="font-size: 10px;width:100px;"></input></td></tr>
		   		</table>
	  		</div>
  		</div>
  		<div style="width:580px;height:650px;margin-top: 55px; margin-left: 700px;">
	   		<div class="audioIndexDivParams" style="float:left;">
	   			<input name="name" type="text" class="audinIndexInput" style="width: 100px;margin-top: 47px; margin-left: 60px;display:block;" value="<%=userParams.getName()%>">
	   			<ul class="audioIndexUl"  style="margin-top:17px;margin-left:150px;">
	   				<li><input name="Level" type="text" class="audinIndexInput" value="<%=userParams.getLevel()%>" style="font-size: 10px;height:18px"></li>
	   				<li><input name="HP" type="text" class="audinIndexInput" value="<%=userParams.getHP()%>" style="font-size: 10px;height:18px"></li>
	   				<li><input name="EP" type="text" class="audinIndexInput" value="<%=userParams.getEP()%>" style="font-size: 10px;height:18px"></li>
	   				<li><input name="CP" type="text" class="audinIndexInput" value="<%=userParams.getCP()%>" style="font-size: 10px;height:18px"></li>
	   			</ul>
	   			<ul class="audioIndexUl" style="margin-top:30px;margin-left:150px;">
	   				<li><input name="tairixyoku" type="text" class="audinIndexInput" value="<%=userParams.getTairixyoku()%>"></li>
	   				<li style="margin-top:10px;"><input name="koudourixyoku" type="text" class="audinIndexInput" value="<%=userParams.getKoudourixyoku()%>"></li>
	   				<li style="margin-top:10px;"><input name="kannsokurixyoku" type="text" class="audinIndexInput" value="<%=userParams.getKannsokurixyoku()%>"></li>
	   				<li style="margin-top:10px;"><input name="balance" type="text" class="audinIndexInput" value="<%=userParams.getBalance()%>"></li>
	   			</ul>
	   			<ul class="audioIndexUl" style="margin-top:232px;margin-left:150px;">
	   				<li><input name="exp" type="text" class="audinIndexInput" value="<%=userParams.getExp()%>"></li>
	   				<li style="margin-top:10px;"><input name="next" type="text" class="audinIndexInput" value="<%=userParams.getNext()%>"></li>
	   			</ul>
	   		</div>
	   		<div>
		   		<div class="audioIndexDivEquips" style="">
		   			<table style="margin-top: 50px;margin-left: 100px; border-collapse: separate; border-spacing: 10px;">
		   				<tr><td><input name="jacket" type="text" class="audinIndexInput" value="<%=userParams.getJacket()%>" style="font-size: 12px;width:150px;"></input></td></tr>
		   				<tr><td><input name="trousers" type="text" class="audinIndexInput" value="<%=userParams.getTrousers()%>" style="font-size: 12px;width:150px;"></input></td></tr>
		   				<tr><td><input name="mood" type="text" class="audinIndexInput" value="<%=userParams.getMood()%>" style="font-size: 12px;width:150px;"></input></td></tr>
		   			</table>
		   		</div>
		   		<div id="SkillListDiv" class="audioIndexDivSkills" style="margin-top:10px;">
		   			<ul style="margin-top:90px;">
			   			<li style="float:left;">
				   			<a id="softDevelopeList" href="SkillList/jumpSoftRBpane.action" style="display:inline-block;margin-left: 20px;">
				   				<img name="normalStyle" alt="soft" src="/Java_Review2016/Image/softdevelope1.png">
				   				<img name="exampleStyle" alt="soft" src="/Java_Review2016/Image/softdevelope2.png" hidden="hidden">
			   				</a>
				   		</li>
			   			<li>
				   			<a id="japaneseList" href="#" style="display:inline-block;margin-left: 20px;">
				   				<img name="normalStyle" alt="soft" src="/Java_Review2016/Image/softdevelopeB1.png">
				   				<img name="exampleStyle" alt="soft" src="/Java_Review2016/Image/softdevelopeB2.png" hidden="hidden">
			   				</a>
			   			</li>
		   			</ul>
		   		</div>
	   		</div>
   		</div>
   	 </form>
   </div><!--  div2  -->
   <script>
   function userParamsSubmit(){
   		$("#userParamsForm").submit();
   }
   </script>
   <script>
   	javaReview_initSkillListDiv();
   </script>
  </body>
</html>
