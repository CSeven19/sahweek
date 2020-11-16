<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta charset="UTF-8" />
<meta name="viewport" content="width=1200">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="content-style-type" content="text/css"/>
<meta http-equiv="content-script-type" content="text/javascript"/>
<link rel="stylesheet" type="text/css" href="/sgogo/Plugin/bootstrap-2.3.2/docs/assets/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="/sgogo/Plugin/jqgrid/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" href="/sgogo/Plugin/jquery-ui/themes/base/jquery-ui.css?2016627173244" />
<link rel="stylesheet" href="/sgogo/Plugin/jqwidgets/styles/jqx.base.css" type="text/css" />
<link rel="stylesheet" href="/sgogo/Plugin/jQueryWbPl/css/style.css" type="text/css" />
<link rel="stylesheet" href="/sgogo/Plugin/jQueryWbPl/css/comment.css" type="text/css" />
<link rel="stylesheet" href="/sgogo/CSS/sgogo/login.css" type="text/css"/>
<link rel="stylesheet" href="/sgogo/CSS/sgogo/main.css" type="text/css"/>
<link rel="stylesheet" href="/sgogo/Plugin/jqplot/jquery.jqplot.min.css" type="text/css"/>

<script type="text/javascript" src="/sgogo/JS/jquery/jquery.js"></script>
<script type="text/javascript" src="/sgogo/JS/jquery/jquery.libs.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jQueryRotate.2.2.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jquery-ui/themes/base/jquery-ui.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqgrid/js/i18n/grid.locale-ja.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqgrid/js/jquery.jqGrid.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqwidgets/jqxchart.core.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqwidgets/jqxdraw.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqwidgets/jqxdata.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqwidgets/jqxbuttons.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqwidgets/jqxfileupload.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/jquery.jqplot.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.barRenderer.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.canvasOverlay.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.canvasTextRenderer.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.canvasTextRenderer.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.canvasAxisTickRenderer.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.dateAxisRenderer.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.highlighter.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.enhancedLegendRenderer.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/jqplot/plugins/jqplot.pointLabels.min.js"></script>
<script type="text/javascript" src="/sgogo/Plugin/bootstrap-2.3.2/docs/assets/js/bootstrap.js"></script>

<!-- 自己的JS -->
<script type="text/javascript" src="/sgogo/JS/sgogo/sgogoapi.js"></script>
<script type="text/javascript" src="/sgogo/JS/sgogo/common.js"></script>
<script type="text/javascript" src="/sgogo/JS/sgogo/schedule.js"></script>
<script type="text/javascript" src="/sgogo/JS/sgogo/main.js"></script>
<script type="text/javascript" src="/sgogo/JS/sgogo/history.js"></script>
<script type="text/javascript" src="/sgogo/JS/sgogo/status.js"></script>
