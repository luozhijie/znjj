<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SendInfoServlet?stat=temp" method="post">
		温度：<input name="temperature"><br> 湿度：<input
			name="humidity"><br> 设备ID:<input name="deviceId">
		<input type="submit">
	</form>
</body>
</html>