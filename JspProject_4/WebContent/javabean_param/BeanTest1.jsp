<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("euc-kr"); %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beantest" class = "javabean.BeanTest" scope="page" />
	<jsp:setProperty property="name" name="beantest" param="name"/>
	<%-- 
		Ŭ���̾�Ʈ���� 'name'�̶�� �̸��� �Ķ���� ���� name ������Ƽ�� �Ҵ�(����)�ϰڴٴ� �ǹ��Դϴ�.
		property�� param �Ӽ��� ���� ���� ��� param �Ӽ��� ���� ����
		<jsp:setProperty name = "beantest" property = "name"/>
		
		property�� �Ӽ� ���� "*"�� �����ϸ� ������
		������Ƽ�� ���� ���� �̸��� ���� �Ķ������ ������ �����մϴ�.
		<jsp:setProperty name="beantest" property="*"/>
	
	 --%>
	 <h1>�ں����</h1>
	<jsp:getProperty property="name" name="beantest"/>
</body>
</html>