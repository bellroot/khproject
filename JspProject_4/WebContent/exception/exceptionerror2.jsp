<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%-- ������ �߻��� ��� errorPage �Ӽ��� ������ �������� �����ݴϴ�. --%>
<%@ page errorPage = "/exception/viewErrorMessage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	  name �Ķ���� ��: <%= request.getParameter("name").toUpperCase() %>
</body>
</html>