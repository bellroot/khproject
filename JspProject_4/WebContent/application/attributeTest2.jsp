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
	<h1>������ �Ӽ� �׽�Ʈ</h1>
	<h2>ȫ�浿���� ������ ��� ����Ǿ����ϴ�.</h2>
	<h2><a href ="attributeTest3.jsp">Ȯ���Ϸ�����</a></h2>
</body>
</html>