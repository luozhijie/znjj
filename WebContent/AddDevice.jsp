<%@page import="java.util.ArrayList"%>
<%@page import="lzj.DAO.DeviceTypeDao"%>
<%@page import="lzj.DaoImpl.DeviceTypeDaoImpl"%>
<%@page import="lzj.entity.DeviceType"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (session.getAttribute("userObj") == null) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加设备</title>
</head>
<body>
	<form action="ActionServlet?stat=addDevice" method="post">
		设备名称:<input type="text" name="deviceName"><br> 设备类型: <select
			name="deviceTypeId">
			<%
				DeviceTypeDao deviceTypeDao = new DeviceTypeDaoImpl();
				ArrayList<DeviceType> deviceTypeList = deviceTypeDao.findAllDevicetype();
				for (DeviceType deviceType : deviceTypeList) {
			%>
			<option value="<%=deviceType.getDeviceTypeId()%>"><%=deviceType.getDeviceTypeName()%></option>
			<%
				}
			%>
		</select><br> GIPO:<input name="gpio"><br> <input
			type="submit">
	</form>
</body>
</html>