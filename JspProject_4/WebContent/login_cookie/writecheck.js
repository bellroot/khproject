/**
 * 
 */
$(document).ready(function(){
	$('form').submit(function(event){
		//id ���� ��ȿ�� �˻�
		var id =$('#id').val();
		if(id == ""){	
			alert("ID�� �Է��ϼ���");
			$('#id').focus();
			return false;
		}
		//password ���� ��ȿ�� �˻�
		var password =$('#password').val();
		if(password == ""){	
			alert("password�� �Է��ϼ���");
			$('#password').focus();
			return false;
		}
		
	});
});