<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
 a,h2,h3{text-align:center}      
 table{width:400px;margin:0 auto;}
 tr{height:50px;text-align:center}
 td:nth-child(2n){background:yellow; width:75%}
 td:nth-child(2n+1){background:orange;}
 tr:last-child > td {text-align:center;background:#5eba5e}
 input[type="text"]{width:96%;margin:0 1%;height:30px}
 tr:first-child > td  {background:#ef6b81}
</style>
</head>
<body>
	<form action="arrtibuteTest1.jsp"method="post">
		<table>
			<tr><td colspan = 2>Application 영역에 저장할 내용들</td></tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" required></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="전송"></td>
			</tr>
		</table>
	
	</form>

</body>
</html>