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
		out.print("��й�ȣ =" +pass+"<br>");
		out.print("�ֹι�ȣ = "+jumin1+"-"+jumin2+"<br>");
	
		if(sel.equals(""))
			out.print("email = "+email + "@" + domain +"<br>");
		else
			out.print("email = "+email + "@" + sel +"<br>");
		
		if(gender.equals("m"))
			out.print("���� = ����"+"<br>");
		else 
			out.print("���� = ����"+"<br>");
			
		for(int i= 0 ; i < hobby.length;i++)
			out.print("��� = "+hobby[i]+"<br>");
		out.print("�����ȣ = "+post1+"-"+post2+"<br>");
		out.print("�ּ� = "+address+"<br>");
		out.print("�ڱ�Ұ� = "+intro+"<br>");
		 %>
</body>
</html>