<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <% request.setCharacterEncoding("euc-kr"); %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id = "beanform" class ="javabean.BeanForm" scope = "page"/>
	<jsp:setProperty name = "beanform" property="*"/>
	<% String a = beanform.getGender();
		if(a.equals("1"))
		{
			out.print("����");
		}else{
			out.print("����");
		}
	
	%>
	���̵�    :<jsp:getProperty name = "beanform" property = "id" /><br>
	��й�ȣ :<jsp:getProperty name = "beanform" property = "pass" /><br>
	�̸�      :<jsp:getProperty name = "beanform" property = "name" /><br>
	����      :<jsp:getProperty name = "beanform" property = "gender" /><br>
	����      :<jsp:getProperty name = "beanform" property = "age" /><br>
	�̸���   :<jsp:getProperty name = "beanform" property = "email" /><br>
	�̸���   :<jsp:getProperty name = "beanform" property = "email" /><br>
</body>
</html>