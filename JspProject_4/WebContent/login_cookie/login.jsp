<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	String cookie = request.getHeader("Cookie");
	String storeid ="";
	boolean check = false;
	//��Ű�� �����ϴ��� Ȯ�� �մϴ�.
	if(cookie != null){
		//�����ϴ� ��Ű���� �迭�� �����ɴϴ�.
		Cookie cookies[] = request.getCookies();
		
		//��Ű �̸��� "language1"�� ���� ã�� ���� ��Ű �迭���� ��� Ȯ���մϴ�.
		for(int i = 0 ; i < cookies.length;i++){
			if(cookies[i].getName().equals("idcookie")){
			check = true;
			storeid = cookies[i].getValue();
			}
		}
}%>    
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script src = "http://code.jquery.com/jquery-latest.js"></script>
	<script src = "writecheck.js"></script>
	<script>
	$(function(){
		alert('aa');
		var check = <%=check%>
		if(check){
			$('#id').val('<%=storeid%>');
			$('#idcheck').attr('checked','checked');
		}
		else{
			alert("��Ű ����");
		}
	});
	</script>
</head>
<body>
	<fieldset>
		<form action="loginprocess.jsp" method="post" >
			<div>
			ID : 
			<input type="text" name = "id"  id = "id">
			<input type="checkbox" name = "idstore" value ="store" id ="idcheck">ID ����ϱ�
			</div>
			<div>
			password : 
			<input type="text" name = "password" id = "password" >
			</div>
			<div>
				<input type="submit" value="����" >
				
			</div>
		</form>
	</fieldset>
</body>
</html>