<%@page import="lzj.entity.Device"%>
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
		if (user == null) {
			out.print(
					"<script language='javascript' type='text/javascript'>window.location.href='login.jsp'</script>");
			return;
		}
	%>
	<p>
		欢迎<%=user.getUserName()%>
	</p>
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
		<%
			for (Device device : user.getDeviceList()) {
		%>
		<tr>
			<td><%=device.getDeviceId()%></td>
			<td><%=device.getDeviceName()%></td>
			<td><%=device.getDeviceType().getDeviceTypeName()%></td>
			<td><%=device.getDevice_onLine()%></td>
			<td><%=device.getDevice_gpio()%></td>
			<td>
				<%
					if (device.getDeviceType().getDeviceTypeId() == 1) {
							out.print("<a href=''>管理遥控器</a>");
						}

						if (device.getDeviceType().getDeviceTypeId() == 2) {
							out.print("<a href='ActionServlet?stat=onoff&deviceId=" + device.getDeviceId() + "&isoff="
									+ (device.getDeviceStat().equals("0") ? "1" : "0") + "'>"
									+ (device.getDeviceStat().equals("0") ? "开" : "关") + "</a>");
						}
				%>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>