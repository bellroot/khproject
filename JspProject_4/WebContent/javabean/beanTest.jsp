<%@page import="javabean.BeanTest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>�ڹٺ���</h1>
	<%
		BeanTest bt = new BeanTest();
		String a = bt.getName();
		bt.setName("���Դϴ�.");
	%>
	<%= a %>
	<%= bt.getName() %>
</body>
</html>