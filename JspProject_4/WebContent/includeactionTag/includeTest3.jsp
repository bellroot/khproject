<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Enumeration" %>
<% request.setCharacterEncoding("euc-kr"); %>

<!DOCTYPE html>
<html>
<head>
<title>include 된 페이지(includeTest3.jsp)</title>
<style>
	h2{text-align: center}
	td:nth-child(2n+1) {background-color: orange}
	td:nth-child(2n) {background-color: yellow}
	table{margin : 0 auto}
	
</style>
</head>
<body>
	<h2>include 된 페이지(includeTest3.jsp)</h2>
	<table>
		<%-- <%
			Enumeration<String> e =request.getParameterNames();
			while(e.hasMoreElements()){
				String attributeName = e.nextElement();
				String attributeValue = request.getParameter(attributeName);
			
		%>
		<tr>
			<td><%= attributeName %></td>
			<td><%= attributeValue %></td>
		</tr>
		<%} %>  --%>
		
		 <tr>
			<td>이름</td>
			<td><%=request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=request.getParameter("age") %></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=request.getParameter("address") %></td>
		</tr> 
		
		<tr>
			<td>전화번호</td>
			<td><%=request.getParameter("tel") %></td>
		</tr> 
		
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("alias") %></td>
		</tr> 
	</table>
</body>
</html>