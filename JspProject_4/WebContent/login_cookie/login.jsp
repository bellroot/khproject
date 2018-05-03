<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	String cookie = request.getHeader("Cookie");
	String storeid ="";
	boolean check = false;
	//쿠키가 존재하는지 확인 합니다.
	if(cookie != null){
		//존재하는 쿠키들을 배열로 가져옵니다.
		Cookie cookies[] = request.getCookies();
		
		//쿠키 이름이 "language1"인 값을 찾기 위해 쿠키 배열들을 모두 확인합니다.
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
			alert("쿠키 삭제");
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
			<input type="checkbox" name = "idstore" value ="store" id ="idcheck">ID 기억하기
			</div>
			<div>
			password : 
			<input type="text" name = "password" id = "password" >
			</div>
			<div>
				<input type="submit" value="전송" >
				
			</div>
		</form>
	</fieldset>
</body>
</html>