<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Cookie cookie = new Cookie("language1",request.getParameter("language"));

	cookie.setMaxAge(60*60*24);
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script>
	location.href="cookieExample_jquery.jsp"
</script>
</head>
<body>

</body>
</html>