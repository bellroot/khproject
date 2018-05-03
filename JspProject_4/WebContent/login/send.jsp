<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String jumin1 = request.getParameter("jumin1");
		String jumin2 = request.getParameter("jumin2");
		String email = request.getParameter("email");
		String domain = request.getParameter("domain");
		String sel = request.getParameter("sel");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
			
		String post1 = request.getParameter("post1");
		String post2 = request.getParameter("post2");
		String address = request.getParameter("address");
		String intro = request.getParameter("intro");
		
		out.print("iD = "+id+"<br>");
		out.print("비밀번호 =" +pass+"<br>");
		out.print("주민번호 = "+jumin1+"-"+jumin2+"<br>");
	
		if(sel.equals(""))
			out.print("email = "+email + "@" + domain +"<br>");
		else
			out.print("email = "+email + "@" + sel +"<br>");
		
		if(gender.equals("m"))
			out.print("성별 = 남자"+"<br>");
		else 
			out.print("성별 = 여자"+"<br>");
			
		for(int i= 0 ; i < hobby.length;i++)
			out.print("취미 = "+hobby[i]+"<br>");
		out.print("우편번호 = "+post1+"-"+post2+"<br>");
		out.print("주소 = "+address+"<br>");
		out.print("자기소개 = "+intro+"<br>");
		 %>
</body>
</html>