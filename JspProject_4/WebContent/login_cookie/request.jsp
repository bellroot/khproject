<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
	table{margin: 0 auto}
	h1{text-align : center}
</style>
</head>
<body>
		<fieldset>
		<form action="loginprocess.jsp" method="get" >
			<div>
			ID : 
			<input type="text" name = " id"  id ="id">
			<input type="checkbox" name = "idcheck">ID ����ϱ�
			</div>
			<div>
			password : 
			<input type="text" name = " password"  id ="password">
			</div>
			<div>
				<input type="submit" value="����" >
				
			</div>
		</form>
	</fieldset>
	
</body>
</html>