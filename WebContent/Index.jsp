<%@page import="lzj.entity.Device"%>
<%@page import="lzj.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>恋家</title>
</head>
<jsp:useBean id="user" class="lzj.entity.User" scope="session"></jsp:useBean>
<body>
	<c:if test="${userObj == null }">
		<script language='javascript' type='text/javascript'>
			window.location.href = 'login.jsp'
		</script>
	</c:if>

	<p>欢迎${userObj.userName }</p>
	<a href="AddDevice.jsp">添加设备</a>
	<br>
	<a href="DelDevice.jsp">删除设备</a>
	<br>
	<a href="ManagerDevice.jsp">管理设备</a>
	<a href="ActionServlet?stat=flash">刷新信息</a>
	<br> 设备信息：
	<br>
	<table>
		<tr>
			<th>设备ID</th>
			<th>设备名称</th>
			<th>设备类型</th>
			<th>设备最后在线时间</th>
			<th>gpio</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${userObj.deviceList }" var="device">
			<tr>
				<td>${device.deviceId }</td>
				<td>${device.deviceName }</td>
				<td>${device.deviceType.deviceTypeName }</td>
				<td>${device.device_onLine }</td>
				<td>${device.device_gpio }</td>
				<td><c:if test="${device.deviceType.deviceTypeId == 1 }">
						<a href="">管理遥控器</a>
					</c:if> <c:if test="${device.deviceType.deviceTypeId == 2 }">
						<a
							href="ActionServlet?stat=onoff&deviceId=${device.deviceId }&isoff=${device.deviceStat==0?'1':'0' }">${device.deviceStat==0?'开':'关' }</a>
					</c:if> <c:if test="${device.deviceType.deviceTypeId == 3 }">
						<a href="ActionServlet?stat=looktemp&deviceId=${device.deviceId }">查看温湿度</a>
					</c:if></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>