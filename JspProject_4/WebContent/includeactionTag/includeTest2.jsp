<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("euc-kr"); %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
	h1{text-align: center}
</style>
</head>
<body>
	<h1>��Ŭ��� �׼� �׽�Ʈ ����</h1>
	<!-- 
		include �׼� �±�
		include �׼��� �ӽ÷� ������� page �Ӽ��� �������� �ѱ�� �� �������� ó���� ������ ó�� �����
		���� �������� �����ϰ� �ٽ� ������ �������� ������� ��ȯ�ϴ� ����Դϴ�.
		
		include ��Ƽ��� ������
		include ��Ƽ��� ���� ������ ������ include ���þ�� ������ �������� �ҽ� �ڵ尡 �״��
		���� �Ǿ� ��������� include �׼� �±״� page �Ӽ��� �������� ���� ����� ���� ��ġ�� ���Խ�ŵ�ϴ�.
	 -->
	<jsp:include page='<%=request.getParameter("forwardPage") %>'>
		<jsp:param name="tel" value="010-1234-4567" />
		<jsp:param name="alias" value="�����" />
	</jsp:include>
	
	<h1>��Ŭ��� �׼� �׽�Ʈ ��</h1>
</body>
</html>