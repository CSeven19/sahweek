<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

        <script type="text/javascript">  
        $(function() {  
            $('#projectfile').uploadify({  
                'swf'      : 'lib/uploadify/uploadify.swf',  
                'uploader' : '${pageContext.request.contextPath}/SkillList/ProjectfileAdd.action',  
                'formData': {'projectid': '${project.id}'},  
                'fileObjName' : 'file',  
                'fileSizeLimit' : '0',  
                'onQueueComplete' : function(queueData) {  
                    alert(queueData.uploadsSuccessful + ' files were successfully uploaded.');  
                    }  
                  
            });  
        });  
		</script>  

  </head>
  
  <body>
  <jsp:include page="header.jsp" flush="true"></jsp:include>
    <div id="projectfile">
    <input name="uploadfile" type="file" />
    </div>
  <jsp:include page="footer.jsp" flush="true"></jsp:include>
  </body>
</html>
