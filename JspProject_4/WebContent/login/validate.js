/**
 * 
 */
$(document).ready(function(){
	//email domain ����
	$('#sel').change(function(){
		var domain = $(this).val();
		alert(domain);
		
		if(domain == ""){
			$('#domain').attr('readonly',false)
						.val("")
						.foucs();
		}
		else{
			$('#domain').val(domain)
						.attr('readonly',true);
		}
	});
	//id�ߺ��˻� ��ư
	$('#idcheck').on('click',function(){
		var data =$('#id').val();
		if(data == ""){	
			alert("ID�� �Է��ϼ���");
			$('#id').focus();
		}else
		 window.open('idcheck.html',"idcheck","width=300, height=250")

		//�Է½� id�� �Ѱ���
	});
	
	// ���� �˻�
	$('#postcode').on('click',function(){
		window.open("post.html","post","width=400, height=300");

	});
	
	
	
	//�ֹι�ȣ ���ڸ� �˻�
	$('#jumin1').on('keyup', function(){
	    var jumin1_length = $('#jumin1').val().length;
	    
	    if(jumin1_length == 6){
	    	if(!isNaN($('#jumin1').val())) //6�ڸ��� ������ ���
	    	   $('#jumin2').focus();
	    	else{                     //6�ڸ��� ���ڰ� �ƴ� ���
   	    	   alert("���ڷ� �Է��ϼ���"); 
   	    	   $('#jumin1').val('');  //���ڸ� ��� �ʱ�ȭ
   	    	   $('#jumin1').focus();   //���ڸ��� ��Ŀ�� �ش�.
   	          }
	    }
	});
	
	//�ֹι�ȣ ���ڸ� �˻�
	$('#jumin2').on('keyup', function(){
	    var jumin2_length = $('#jumin2').val().length;
	    if(jumin2_length == 7){
	    	if(isNaN($('#jumin2').val())){ //7�ڸ��� ������ ���              
   	    	   alert("���ڷ� �Է��ϼ���"); 
   	    	   $('#jumin2').val('');  //���ڸ� ��� �ʱ�ȭ
   	    	   $('#jumin2').focus();   //���ڸ��� ��Ŀ�� �ش�.
   	          }
	    }
	    
	});
	
	
	
	
	//��ȿ�� �˻�
	
	$('form').submit(function(event){
		//id ���� ��ȿ�� �˻�
		var id =$('#id').val();
		if(id == ""){	
			alert("ID�� �Է��ϼ���");
			$('#id').focus();
			return false;
		}
		
		//��й�ȣ ���� ��ȿ�� �˻�
		var pass =$('#pass').val();
		if(pass == ""){	
			alert("��й�ȣ�� �Է��ϼ���");
			$('#pass').focus();
			return false;
		}
		
		//�ֹι�ȣ ���ڸ� ���� ��ȿ�� �˻�
		var jumin1 =$('#jumin1').val();
		if(jumin1 == ""){	
			alert("�ֹι�ȣ ���ڸ� �Է��ϼ���");
			$('#jumin1').focus();
			return false;
		}
		//�ֹι�ȣ ���ڸ� 6�ڸ� ��ȿ�� �˻�
		var jumin1_length = $('#jumin1').val().length;
		if(jumin1_length !=6){
			alert('�ֹι�ȣ ���ڸ� 6�ڸ��� �Է��ϼ���');
			$('#jumin1').focus();
			return false;
		}
		
		//�ֹι�ȣ ���ڸ� ���� ��ȿ�� �˻�
		var jumin1_isNaN =$('#jumin1').val();
		if(isNaN(jumin1_isNaN)){
			alert("�ֹι�ȣ ���ڸ��� ���ڸ� �Է� �����մϴ�.");
			$('#jumin1').focus()
						.val("");
			return false;
		}
		
		//�ֹι�ȣ ���ڸ� ���� ��ȿ�� �˻�
		var jumin2 =$('#jumin2').val();
		if(jumin2 == ""){	
			alert("�ֹι�ȣ ���ڸ� �Է��ϼ���");
			$('#jumin2').focus();
			return false;
		}
		//�ֹι�ȣ ���ڸ� 6�ڸ� ��ȿ�� �˻�
		var jumin2_length = $('#jumin2').val().length;
		if(jumin2_length !=7){
			alert('�ֹι�ȣ ���ڸ� 7�ڸ��� �Է��ϼ���');
			$('#jumin2').focus();
			return false;
		}
		
		//�ֹι�ȣ ���ڸ� ���� ��ȿ�� �˻�
		var jumin2_isNaN =$('#jumin2').val();
		if(isNaN(jumin2_isNaN)){
			alert("�ֹι�ȣ ���ڸ��� ���ڸ� �Է� �����մϴ�.");
			$('#jumin2').focus()
						.val("");
			return false;
		}
		
		//email ���� ��ȿ�� �˻�
		var email = $('#email').val();
		if(email == ""){	
			alert("Email ID�� �Է��ϼ���");
			$('#email').focus();
			return false;
		}
		
		//domain ���� ��ȿ�� �˻�
		var domain = $('#domain').val();
		if(domain == ""){	
			alert("domain �ּҸ� �Է��ϼ���");
			$('#domain').focus();
			return false;
		}
		
		//���� ��ư ���� ��ȿ�� �˻�
		if( $('#gender1').is(":checked")==false &&
			$('#gender2').is(":checked")==false){ 
			alert("��, �� �߿��� 1���� �����ϼ���");
			return false;
		}
		
		//��̸� 2�� �̻� üũ�ϵ��� �ϴ� ��ȿ�� �˻�     
		var cnt = 0;
		if($('#hobby1').is(":checked")==true) cnt++;
		if($('#hobby2').is(":checked")==true) cnt++;
		if($('#hobby3').is(":checked")==true) cnt++;
		if($('#hobby4').is(":checked")==true) cnt++;
		if($('#hobby5').is(":checked")==true) cnt++;
		
		if(cnt < 2){
			 alert("2���̻� ��̸� �����ϼ���")
	         return false;

		}
		
		
		//�����ȣ ���ڸ� ���� ��ȿ�� �˻�
		var post1 = $('#post1').val();
		if(post1 == ""){	
			alert("�����ȣ ���ڸ��� �Է��ϼ���");
			$('#post1').focus();
			return false;
		}
		
		//�����ȣ ���ڸ� ���� ��ȿ�� �˻�
		var post2 = $('#post2').val();
		if(post2 == ""){	
			alert("�����ȣ ���ڸ��� �Է��ϼ���");
			$('#post2').focus();
			return false;
		}
		
		
		
		//�ּ� ���� ��ȿ�� �˻�
		var address = $('#address').val();
		if(address == ""){	
			alert("�ּҸ� �Է��ϼ���");
			$('#address').focus();
			return false;
		}
		
		//�ڱ�Ұ� ���� ��ȿ�� �˻�
		var intro = $('#intro').val();
		if(intro == ""){	
			alert("�ڱ� �Ұ��� �Է��ϼ���");
			$('#intro').focus();
			return false;
		}
		
		
	});
});