<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Enumeration" %>
<% request.setCharacterEncoding("euc-kr"); %>

<!DOCTYPE html>
<html>
<head>
<title>������ �� ������(forwarTest3.jsp)</title>
</head>
<body>
	<h2>������ �� ������(forwardTest3.jsp)</h2>
	<table>
		<%
			Enumeration<String> e =request.getParameterNames();
			while(e.hasMoreElements()){
				String attributeName = e.nextElement();
				String attributeValue = request.getParameter(attributeName);
			
		%>
		<tr>
			<td><%= attributeName %></td>
			<td><%= attributeValue %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>