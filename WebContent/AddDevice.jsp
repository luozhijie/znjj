<%@page import="java.util.ArrayList"%>
<%@page import="lzj.DAO.DeviceTypeDao"%>
<%@page import="lzj.DaoImpl.DeviceTypeDaoImpl"%>
<%@page import="lzj.entity.DeviceType"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${userObj == null }">
	<script language='javascript' type='text/javascript'>
		window.location.href = 'login.jsp'
	</script>
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加设备</title>
</head>
<body>
	<form action="ActionServlet?stat=addDeviceAction" method="post">
		设备名称:<input type="text" name="deviceName"><br> 设备类型: <select
			name="deviceTypeId">
			<c:forEach items="${deviceTypeList }" var="deviceType">
				<option value="${deviceType.deviceTypeId }">${deviceType.deviceTypeName }</option>
			</c:forEach>
		</select><br> GIPO:<input name="gpio"><br> <input
			type="submit">
	</form>
	
</body>
</html>