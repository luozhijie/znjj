<%@page import="lzj.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>恋家</title>
</head>
<jsp:useBean id="user" class="lzj.entity.User" scope="session"></jsp:useBean>
<body>
	<%
		user = (User) request.getSession().getAttribute("userObj");
	%>
	<p>
		欢迎<%=user.getUserName()%></p>
	<a href="AddDevice.jsp">添加设备</a>
	<br>
	<a href="DelDevice.jsp">删除设备</a>
	<br>
	<a href="ManagerDevice.jsp">管理设备</a>
	<br>

</body>
</html>