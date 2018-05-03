<%--
		WebContent 폴더아래 "upload"폴더 생성 후 실행하세요
		일반 파라미터를 전송할 때 사용하는 인코딩과 파일을 업로드 할 때 사용하응 인코딩은 다릅니다
		스트립 기반의 전송방식인 POST방식은 다음의 두 가지 인코딩 방식에 따라서 전송하는 데이터 형식이 달라집니다.
		1. application/x-www.form-urlencoded
		2. mltipart/form-data
		
		지금까지의 예제들을 1번 인코딩 사용해서 데이터를 전송했습ㄴ디ㅏ.
		파일 업로드 하기 위해서 2번 인코딩을 사용해야합니다.
		form태그의 ectpye 속성값을"multipart/form-data"로 지정해주면 됩니다
		met
 --%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action ="fileUpload2.jsp" method="post"
			enctype="multipart/form-data">
	<table>
		<tr class = "yellow">
			<td colspan=2 class = "center pad">
			<h3>파일 업로드 폼</h3>
			</td>
		</tr>
		<tr>
			<td>올린 사람</td>
			<td><input type="text" name="name"></td>
		</tr>
		
		<tr>
			<td>제목</td>
			<td><input type="text" name="subject"></td>
		</tr>
		<tr>
			<td>파일명1 </td>
			<td>
				<input type="file" name="fileName1">
				<!-- 파일을 선택하여 전송할 수 있도록 type속성을 file로 설정합니다 -->
			</td>
		</tr>
		<tr>
			<td>파일명2 </td>
			<td>
				<input type="file" name="fileName2">
			</td>
		</tr>
		<tr>
			<td colspan="2" class = "center green">
			<input type="submit" value="전송" ></td>
		</tr>
				
		</table>
	
	</form>

</body>
</html>