<%@page import="javabean.BeanTest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>자바빈예제</h1>
	<%
		BeanTest bt = new BeanTest();
		String a = bt.getName();
		bt.setName("봄입니다.");
	%>
	<%= a %>
	<%= bt.getName() %>
</body>
</html>