/**
 * 
 */
$(document).ready(function(){
var pattern = /^[1-9][0-9]{1,2}#/;

if(!pattern.test(age)){
	alert("2-3자리의 숫자를 입력하세요[0으로 시작하지마세요");
	$("#age").val('');
	$("#age").focus();
	return false;
}

var email = $.trim($("#eamil").val());
if(email == ""){
	alert("이메일주소를 입력하세요");
}

});