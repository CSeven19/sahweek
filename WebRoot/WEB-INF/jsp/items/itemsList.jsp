<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'itemsList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form action="${pageContext.request.contextPath}/items/queryItems.action" method="post">
   查询条件:
   <table width="100%" border=1>
   <tr>
   <td><input type="submit" value="查询 " /></td>
   </tr>
   </table>
   商品列表
   <table width="100%" border=1>
   <tr>
   		<td>商品牌子</td>
   		<td>价格</td>
   		<td>描述</td>
   </tr>
   <c:forEach items="${itemsList}" var="item">
   <tr>
   		<td>${item.name}</td>
   		<td>${item.price}</td>
   		<td>${item.detail }</td>
   		<td><a href="${pageContext.request.contextPath}/item/editItems.action?id=${item.id}">修改</a></td>
   </tr>
   </c:forEach>
   </table>
   </form>
  </body>
</html>
