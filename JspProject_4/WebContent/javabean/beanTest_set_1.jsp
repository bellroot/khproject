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
		javabean.BeanTest beantest = new javabean.BeanTest();
		pageContext.setAttribute("beantest", beantest);
		beantest.setName("���Դϴ�");
	%>	 	
	 <%=beantest.getName() %>
	
</body>
</html>