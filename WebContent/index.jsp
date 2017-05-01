<%@page import="com.google.gson.Gson"%>
<%@page import="lzj.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	User user = (User) session.getAttribute("userObj");
	Gson gson = new Gson();
	String info = gson.toJson(user);
	out.print(info);
%>
