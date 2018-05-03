<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%-- 에러가 발생할 경우 errorPage 속성에 지정한 페이지를 보여줍니다. --%>
<%@ page errorPage = "/exception/viewErrorMessage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	  name 파라미터 값: <%= request.getParameter("name").toUpperCase() %>
</body>
</html>