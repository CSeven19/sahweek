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
	<script type="text/javascript">
        $(document).ready(function () {
		
            var  sampleData = [
                    { Day:'Monday', Keith:30, Erica:15, George: 25},
                    { Day:'Tuesday', Keith:25, Erica:25, George: 30},
                    { Day:'Wednesday', Keith:30, Erica:20, George: 25},
                    { Day:'Thursday', Keith:35, Erica:25, George: 45},
                    { Day:'Friday', Keith:20, Erica:20, George: 25},
                    { Day:'Saturday', Keith:30, Erica:20, George: 30},
                    { Day:'Sunday', Keith:60, Erica:45, George: 90}
                ];
				
            // prepare jqxChart settings
            var settings = {
                title: "Fitness & exercise weekly scorecard",
                description: "Time spent in vigorous exercise",
                padding: { left: 5, top: 5, right: 50, bottom: 5 },
                titlePadding: { left: 90, top: 0, right: 0, bottom: 10 },
                source: sampleData,
                xAxis:
                {
                    dataField: 'Day',
                    valuesOnTicks: false
                },
                valueAxis:
                {
                    minValue: 0,
                    maxValue: 100,
                    unitInterval: 10,
                    title: {text: 'Time in minutes'}
                },
                colorScheme: 'scheme01',
                seriesGroups:
                    [
                        {
                            type: 'bubble',
                            series: [
                                    { dataField: 'George', displayText: 'George'}
                                ]
                        },
                        {
                            type: 'line',
                            series: [
                                    { dataField: 'Keith', displayText: 'Keith'},
                                    { dataField: 'Erica', displayText: 'Erica'},
                                ]
                        }
                    ]
            };
            
            // select the chartContainer DIV element and render the chart.
            $('#chartContainer').jqxChart(settings);
        });
    </script>
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
		<div id='chartContainer' style="width:982px; height:400px;margin-left:50px;display:inline-block"></div>
	</div>
	<jsp:include page="footer.jsp" flush="true"></jsp:include>
  </body>
</html>
