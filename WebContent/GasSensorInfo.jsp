<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>可燃气体传感器</title>
</head>
<body>
	<table>
		<tr>
			<th>触发时间</th>
			<th>是否确认</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${gasSensorList }" var="gasSensor">
			<tr>
				<td>${gasSensor.time }</td>
				<td>${gasSensor.ischeck == 0 ? '未确认':'已确认'  }</td>
				<td>
					<c:if test="${gasSensor.ischeck == 0 }">
						<a href="ActionServlet?stat=gasCheck&gid=${gasSensor.gid }">确认</a>
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>