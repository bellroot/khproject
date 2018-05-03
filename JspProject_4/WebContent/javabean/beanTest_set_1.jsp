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
		javabean.BeanTest beantest = new javabean.BeanTest();
		pageContext.setAttribute("beantest", beantest);
		beantest.setName("봄입니다");
	%>	 	
	 <%=beantest.getName() %>
	
</body>
</html>