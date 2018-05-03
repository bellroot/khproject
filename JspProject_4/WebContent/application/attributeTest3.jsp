<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ page import = "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
 h1{text-align:center}      
 table{width:400px;margin:0 auto;}
 tr{height:50px;text-align:center}
 td:nth-child(2n){background:yellow; width:75%}
 td:nth-child(2n+1){background:orange;}
 input[type="text"]{width:96%;margin:0 1%;height:30px}
 tr:first-child > td  {background:#ef6b81}
</style>
</head>
<body>
	<% request.setCharacterEncoding("euc-kr"); %>
	<h1>영역과 속성 테스트</h1>
	<table>
			<tr><td colspan = 2>Application 영역에 저장할 내용들</td></tr>
			<%-- <tr>
				<td>이름</td>
				<td><%= application.getAttribute("name") %></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%= application.getAttribute("id") %></td>
			</tr> --%>
		<%-- 	<%
			Enumeration<String> a = application.getAttributeNames();
			while(a.hasMoreElements()){
				String attributeNameApp = (String)a.nextElement();
				Object attributeValueApp = application.getAttribute(attributeNameApp);
			%>
			<%if(instanceof (attributeValueApp)  == 'string') %>
			<tr>
				<td><%= attributeNameApp %></td>
				<td><%= attributeValueApp %></td>
			</tr>
			<%} %> --%>
			
	</table>
	<br><br>	
	<table>
			<tr><td colspan = 2>Session 영역에 저장할 내용들</td></tr>
				<%
					Enumeration<String> e = session.getAttributeNames();
					while(e.hasMoreElements()){
						String attributeName = e.nextElement();
						String attributeValue = (String)session.getAttribute(attributeName);
				%>
			<tr>
				<td><%= attributeName %></td>
				<td><%= attributeValue %></td>
			</tr>
			<%} %>
			
	</table>
	
</body>
</html>