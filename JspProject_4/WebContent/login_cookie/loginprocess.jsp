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
		alert("�α��ο� �����Ͽ����ϴ�.");
	</script>
	<h1> �α��ο� �����Ͽ����ϴ�.</h1>
		<a href = "loginCheck.jsp">�α��� üũ</a>
	<%
		String IDStore = request.getParameter("idstore");
		Cookie cookie = new Cookie("idcookie",request.getParameter("id"));
		// ID ����ϱ⸦ üũ�� ���
		if(IDStore != null && IDStore.equals("store")){
			//cookie.setMaxAge(60*60*24); ��Ű�� ��ȿ�ð��� 24�ð����� ����
			cookie.setMaxAge(2*60);
			response.addCookie(cookie);
			out.println("<a href = 'login.jsp'>�α��� ȭ�� �ٽ� ����</a>");
		}else{
			cookie.setMaxAge(0);		//��Ű ����
			response.addCookie(cookie);
		}
	%>
		
		
	<%}else{ %>
	<script>
		alert("�α��ο� �����Ͽ����ϴ�.");
		history.back();
	</script>
	<%} %> 
	

</body>
</html>