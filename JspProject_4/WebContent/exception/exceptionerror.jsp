<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- �Ķ���� name���� ��û�� ���� ���� ������
	     request.getParameter("name")�� NullPointerException �߻��մϴ�. -->
	     
	  name �Ķ���� ��: <%= request.getParameter("name").toUpperCase() %>
</body>
</html>