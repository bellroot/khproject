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
	<jsp:useBean id="beantest" class = "javabean.BeanTest" scope="page"/>
	<jsp:setProperty name="beantest" property = "name" value = "봄입니다!" />
	
	<h3><jsp:getProperty name = "beantest" property = "name" /></h3>
</body>
</html>