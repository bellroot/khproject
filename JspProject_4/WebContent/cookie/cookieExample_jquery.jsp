<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String language = "korea";
	//header�� �̸� �߿��� cookie �� ���� �����ɴϴ�.
	String cookie = request.getHeader("Cookie");
	
	//��Ű�� �����ϴ��� Ȯ�� �մϴ�.
	if(cookie != null){
		//�����ϴ� ��Ű���� �迭�� �����ɴϴ�.
		Cookie cookies[] = request.getCookies();
		
		//��Ű �̸��� "language1"�� ���� ã�� ���� ��Ű �迭���� ��� Ȯ���մϴ�.
		for(int i = 0 ; i < cookies.length;i++){
			if(cookies[i].getName().equals("language1")){
				language = cookies[i].getValue();
			}
		}
		out.println(language);
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
	<script src = "http://code.jquery.com/jquery-latest.js"></script>
	<script>
		$(function(){
			<%-- var id = "#<%=language%>" --%>
			var id = "input[value ='<%=language%>']"
			$(id).attr('checked','checked');
		});
	</script>
</head>
<body>
	<%
		if(language.equals("korea")){
	%>
	<h3>�ȳ��ϼ���. �̰��� ��Ű �����Դϴ�.</h3>
	<%
		}else{
	%>
	<h3>Hello . This is Cookie example.</h3>
	<%
		}
	%>
	<fieldset>
		<form action="cookieExample_jquery2.jsp" method="post">
			<input type="radio" name = "language" value="korea"
					id="korea">�ѱ��� ������ ����
			<input type="radio" name = "language" value="english"
					id = "english">���� ������ ����
			<input type="submit" value="����">
		</form>
	</fieldset>
</body>
</html>