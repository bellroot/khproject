<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
1���� 100������ ����
<%
	int sum= 0;
	for(int i = 1 ; i <= 100;i++){
		sum+=i;
	}
	out.print("<h2>" + sum+" �Դϴ�.</h2>");
	System.out.print("<h2>" + sum+" �Դϴ�.</h2>");
	%>