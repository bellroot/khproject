<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<% String setpage = request.getParameter("sel");
		String url = setpage+"page.jsp";
	%>
	
	 <jsp:forward page='<%=url %>'></jsp:forward> 
</body>
</html>