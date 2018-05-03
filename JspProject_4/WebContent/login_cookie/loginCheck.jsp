<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>ID"<%=session.getAttribute("id")%>"로 로그인한 상태입니다.</h1>
	<a href= "logout.jsp">로그아웃</a>
</body>
</html>