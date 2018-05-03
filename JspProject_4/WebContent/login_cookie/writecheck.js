/**
 * 
 */
$(document).ready(function(){
	$('form').submit(function(event){
		//id 공백 유효성 검사
		var id =$('#id').val();
		if(id == ""){	
			alert("ID를 입력하세요");
			$('#id').focus();
			return false;
		}
		//password 공백 유효성 검사
		var password =$('#password').val();
		if(password == ""){	
			alert("password를 입력하세요");
			$('#password').focus();
			return false;
		}
		
	});
});