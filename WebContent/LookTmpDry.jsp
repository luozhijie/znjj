<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>温湿度详情信息</title>
</head>
<body>
	<table>
		<tr>
			<th>时间</th>
			<th>温度</th>
			<th>湿度</th>
		</tr>
		<c:forEach items="${tempList }" var="temp">
			<tr>
				<td>${temp.time }</td>
				<td>${temp.temperature }</td>
				<td>${temp.humidity }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>