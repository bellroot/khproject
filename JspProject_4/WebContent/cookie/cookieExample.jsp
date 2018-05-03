<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String language = "korea";
	//header의 이름 중에서 cookie 의 값을 가져옵니다.
	String cookie = request.getHeader("Cookie");
	
	//쿠키가 존재하는지 확인 합니다.
	if(cookie != null){
		//존재하는 쿠키들을 배열로 가져옵니다.
		Cookie cookies[] = request.getCookies();
		
		//쿠키 이름이 "language1"인 값을 찾기 위해 쿠키 배열들을 모두 확인합니다.
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
</head>
<body>
	<%
		if(language.equals("korea")){
	%>
	<h3>안녕하세요. 이것은 쿠키 예제입니다.</h3>
	<%
		}else{
	%>
	<h3>Hello . This is Cookie example.</h3>
	<%
		}
	%>
	<fieldset>
		<form action="cookieExample2.jsp" method="post">
			<input type="radio" name = "language" value="korea"
				<%
					if(language.equals("korea")){%>
					checked
				<% }%>
			>한국어 페이지 보기
			<input type="radio" name = "language" value="english"
				<%
					if(language.equals("english")){%>
					checked
				<% }%>
			>영어 페이지 보기
			<input type="submit" value="설정">
		</form>
	</fieldset>
</body>
</html>