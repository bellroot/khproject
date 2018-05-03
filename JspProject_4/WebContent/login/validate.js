/**
 * 
 */
$(document).ready(function(){
	//email domain 선택
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
	//id중복검사 버튼
	$('#idcheck').on('click',function(){
		var data =$('#id').val();
		if(data == ""){	
			alert("ID를 입력하세요");
			$('#id').focus();
		}else
		 window.open('idcheck.html',"idcheck","width=300, height=250")

		//입력시 id값 넘겨줌
	});
	
	// 우편 검색
	$('#postcode').on('click',function(){
		window.open("post.html","post","width=400, height=300");

	});
	
	
	
	//주민번호 앞자리 검사
	$('#jumin1').on('keyup', function(){
	    var jumin1_length = $('#jumin1').val().length;
	    
	    if(jumin1_length == 6){
	    	if(!isNaN($('#jumin1').val())) //6자리가 숫자인 경우
	    	   $('#jumin2').focus();
	    	else{                     //6자리가 숫자가 아닌 경우
   	    	   alert("숫자로 입력하세요"); 
   	    	   $('#jumin1').val('');  //앞자리 모두 초기화
   	    	   $('#jumin1').focus();   //앞자리에 포커스 준다.
   	          }
	    }
	});
	
	//주민번호 뒷자리 검사
	$('#jumin2').on('keyup', function(){
	    var jumin2_length = $('#jumin2').val().length;
	    if(jumin2_length == 7){
	    	if(isNaN($('#jumin2').val())){ //7자리가 숫자인 경우              
   	    	   alert("숫자로 입력하세요"); 
   	    	   $('#jumin2').val('');  //뒷자리 모두 초기화
   	    	   $('#jumin2').focus();   //뒷자리에 포커스 준다.
   	          }
	    }
	    
	});
	
	
	
	
	//유효성 검사
	
	$('form').submit(function(event){
		//id 공백 유효성 검사
		var id =$('#id').val();
		if(id == ""){	
			alert("ID를 입력하세요");
			$('#id').focus();
			return false;
		}
		
		//비밀번호 공백 유효성 검사
		var pass =$('#pass').val();
		if(pass == ""){	
			alert("비밀번호를 입력하세요");
			$('#pass').focus();
			return false;
		}
		
		//주민번호 앞자리 공백 유효성 검사
		var jumin1 =$('#jumin1').val();
		if(jumin1 == ""){	
			alert("주민번호 앞자리 입력하세요");
			$('#jumin1').focus();
			return false;
		}
		//주민번호 앞자리 6자리 유효성 검사
		var jumin1_length = $('#jumin1').val().length;
		if(jumin1_length !=6){
			alert('주민번호 앞자리 6자리를 입력하세요');
			$('#jumin1').focus();
			return false;
		}
		
		//주민번호 앞자리 숫자 유효성 검사
		var jumin1_isNaN =$('#jumin1').val();
		if(isNaN(jumin1_isNaN)){
			alert("주민번호 앞자리는 숫자만 입력 가능합니다.");
			$('#jumin1').focus()
						.val("");
			return false;
		}
		
		//주민번호 뒷자리 공백 유효성 검사
		var jumin2 =$('#jumin2').val();
		if(jumin2 == ""){	
			alert("주민번호 앞자리 입력하세요");
			$('#jumin2').focus();
			return false;
		}
		//주민번호 뒷자리 6자리 유효성 검사
		var jumin2_length = $('#jumin2').val().length;
		if(jumin2_length !=7){
			alert('주민번호 앞자리 7자리를 입력하세요');
			$('#jumin2').focus();
			return false;
		}
		
		//주민번호 뒷자리 숫자 유효성 검사
		var jumin2_isNaN =$('#jumin2').val();
		if(isNaN(jumin2_isNaN)){
			alert("주민번호 뒷자리는 숫자만 입력 가능합니다.");
			$('#jumin2').focus()
						.val("");
			return false;
		}
		
		//email 공백 유효성 검사
		var email = $('#email').val();
		if(email == ""){	
			alert("Email ID를 입력하세요");
			$('#email').focus();
			return false;
		}
		
		//domain 공백 유효성 검사
		var domain = $('#domain').val();
		if(domain == ""){	
			alert("domain 주소를 입력하세요");
			$('#domain').focus();
			return false;
		}
		
		//라디오 버튼 선택 유효성 검사
		if( $('#gender1').is(":checked")==false &&
			$('#gender2').is(":checked")==false){ 
			alert("남, 여 중에서 1개를 선택하세요");
			return false;
		}
		
		//취미를 2개 이상 체크하도록 하는 유효성 검사     
		var cnt = 0;
		if($('#hobby1').is(":checked")==true) cnt++;
		if($('#hobby2').is(":checked")==true) cnt++;
		if($('#hobby3').is(":checked")==true) cnt++;
		if($('#hobby4').is(":checked")==true) cnt++;
		if($('#hobby5').is(":checked")==true) cnt++;
		
		if(cnt < 2){
			 alert("2개이상 취미를 선택하세요")
	         return false;

		}
		
		
		//우편번호 앞자리 공백 유효성 검사
		var post1 = $('#post1').val();
		if(post1 == ""){	
			alert("우편번호 앞자리를 입력하세요");
			$('#post1').focus();
			return false;
		}
		
		//우편번호 뒷자리 공백 유효성 검사
		var post2 = $('#post2').val();
		if(post2 == ""){	
			alert("우편번호 뒷자리를 입력하세요");
			$('#post2').focus();
			return false;
		}
		
		
		
		//주소 공백 유효성 검사
		var address = $('#address').val();
		if(address == ""){	
			alert("주소를 입력하세요");
			$('#address').focus();
			return false;
		}
		
		//자기소개 공백 유효성 검사
		var intro = $('#intro').val();
		if(intro == ""){	
			alert("자기 소개를 입력하세요");
			$('#intro').focus();
			return false;
		}
		
		
	});
});