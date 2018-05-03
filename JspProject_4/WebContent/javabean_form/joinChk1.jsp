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
			out.print("남자");
		}else{
			out.print("여자");
		}
	
	%>
	아이디    :<jsp:getProperty name = "beanform" property = "id" /><br>
	비밀번호 :<jsp:getProperty name = "beanform" property = "pass" /><br>
	이름      :<jsp:getProperty name = "beanform" property = "name" /><br>
	성별      :<jsp:getProperty name = "beanform" property = "gender" /><br>
	나이      :<jsp:getProperty name = "beanform" property = "age" /><br>
	이메일   :<jsp:getProperty name = "beanform" property = "email" /><br>
	이메일   :<jsp:getProperty name = "beanform" property = "email" /><br>
</body>
</html>