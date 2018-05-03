<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
	body{text-align: center}
</style>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		if(email != null && addr!=null && tel!=null){
			session.setAttribute("email", email);
			session.setAttribute("addr", addr);
			session.setAttribute("tel", tel);
		}
	%>
	<h1>영역과 속성 테스트</h1>
	<h2>홍길동님의 정보가 모두 저장되었습니다.</h2>
	<h2><a href ="attributeTest3.jsp">확인하러가기</a></h2>
</body>
</html>