<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
	* {box-sizing: border-box}
body {font-family: "Lato", sans-serif;}
#header{text-align:center}

/* Style the tab */
#aside {
    float: left;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
    width: 25%;
    height: 300px;
}

/* Style the buttons inside the tab */
#aside a {
    display: block;   
    color: black;
    padding: 22px 16px;
    width: 100%;
    border: none;
    outline: none;
    text-align: left;
    cursor: pointer;
    transition: 0.3s;
    font-size: 17px;
    text-decoration:none;
}

/* Change background color of buttons on hover */
#aside a:hover {
    background-color: #ddd;
}

/* Create an active/current "tab button" class */
#aside a.active {
    background-color: #ccc;
}

/* Style the tab content */
#section {
    float: left;
    padding: 20px 12px;
    border: 1px solid #ccc;
    width: 75%;
    border-left: none;
    height: 300px;
}

#wrap { overflow: hidden;} 
	
</style>
</head>
<%
	String pagefile = request.getParameter("page");
	if(pagefile == null){		//초기화면 값 설정
		pagefile = "newitem";
	}
%>
<body>
	<div id = "header">
		<h1>상품 목록입니다.</h1>
	</div>
	<div id = "navigation">
		<jsp:include page="top.jsp"/><br><br>
	</div>
	<div id="wrap">
		<div id="aside">
			<jsp:include page="left.jsp"/>
		</div>
		<div id="section">
			<jsp:include page='<%=pagefile+".jsp" %>'/>
		</div>
	</div>
	<div id="footer">
		<jsp:include page="bottom.jsp"/>
	</div>
	
	
	
	
</body>
</html>