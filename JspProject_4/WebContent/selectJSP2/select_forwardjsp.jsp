<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<% String setpage = request.getParameter("code");
		String url = setpage+".jsp";
	%>
	
	 <jsp:forward page='<%=url %>'></jsp:forward> 
</body>
</html>