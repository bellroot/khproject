<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
	<script>
	
	</script>
</head>
<body>
	<%
		String id = 	  request.getParameter("id");
		String password = request.getParameter("password");
		String id_web =  application.getInitParameter("ID");
		String password_web = application.getInitParameter("Pass");
	%>
	
	 <%
		if(id.equals(id_web) && password.equals(password_web)){
			session.setAttribute("id", id);
	%>
	<script>
		alert("로그인에 성공하였습니다.");
	</script>
	<h1> 로그인에 성공하였습니다.</h1>
		<a href = "loginCheck.jsp">로그인 체크</a>
	<%
		String IDStore = request.getParameter("idstore");
		Cookie cookie = new Cookie("idcookie",request.getParameter("id"));
		// ID 기억하기를 체크한 경우
		if(IDStore != null && IDStore.equals("store")){
			//cookie.setMaxAge(60*60*24); 쿠키의 유효시간을 24시간으로 설정
			cookie.setMaxAge(2*60);
			response.addCookie(cookie);
			out.println("<a href = 'login.jsp'>로그인 화면 다시 보기</a>");
		}else{
			cookie.setMaxAge(0);		//쿠키 삭제
			response.addCookie(cookie);
		}
	%>
		
		
	<%}else{ %>
	<script>
		alert("로그인에 실패하였습니다.");
		history.back();
	</script>
	<%} %> 
	

</body>
</html>