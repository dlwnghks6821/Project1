<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginform</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
.login-form{
	width:800px;
	margin:0 auto;
	margin-top:100px;
	
	display:flex;
	flex-direction:column;
	align-items:center;
	justify-contents:center;
}
.image-items{
	text-align:center;
	margin-top:300px;
	
}

.image-items img{
  	width:30%;
}
.button-items{
	margin-top:60px;
}
</style>
</head>
<body>
<header class="header-items">
<div class="image-items">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Naver_Logotype.svg/1280px-Naver_Logotype.svg.png">
</div>


</header>

<div class="login-form">
<div class="input-group mb-3">
  <input type="text" id="id" name="id" class="form-control" placeholder="���̵� �Է����ּ���." aria-label="Recipient's username" aria-describedby="basic-addon2">
  <input type="text" id="hidden_id" name="hidden_id"  >
  <div class="input-group-append">
    <span class="input-group-text" id="basic-addon2">���̵�</span>
  
  </div>
</div>

<div class="input-group mb-3">
  <input type="password" id="password" name="password" class="form-control" placeholder="��й�ȣ�� �Է����ּ���." aria-label="Recipient's username" aria-describedby="basic-addon2">
  <input type="text" id="hidden_pwd" name="hidden_pwd">
  <div class="input-group-append">
    <span class="input-group-text" id="basic-addon2">��й�ȣ</span>
  </div>
</div>



<div class="button-items">
<button type="button" id="login" name="login"class="btn btn-success">�α���</button>
<button type="button" id="signin" name="signin"class="btn btn-success">ȸ������</button>
</div>

</div>

</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">

$(document).ready(function() {
	
	$.get('loginform',{},function(txt){
			ar = txt.split(',');
			for(i=0;i<ar.length;i++){
			id = ar[i];
			$('#hidden_id').val(id);
		}
	},'text');
	$.get('password',{},function(txt){
		
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
		
			password = ar[i];
			
		$('#hidden_pwd').val(password);
	}
	
	},'text');
	console.log($('#hidden_id').val())
	console.log($('#hidden_pwd').val())
		return false;
	});
$(document)
.on('click','#login',function(){
	//����Ǽ�//
	//1)���̵� �������� ������//
	if($('#id').val()==""){
		alert("���̵� �������� �صθ�ȵ˴ϴ�.")
		return false
		//2)��й�ȣ�� �������� ������//
	}else if($('#password').val()=="")
		alert("��й�ȣ�� �������� �صθ�ȵ˴ϴ�.")
		
		//3)���̵�� ��й�ȣ�� ��� ��ġ�ϴ� ���//
		if($('#password').val()==$('#hidden_pwd').val() && $('#id').val()==$('#hidden_id').val()){
			alert("�α��μ���")
			//������������ ������//
			page_href();
		}else{
			//�ƴҰ�� ����//
			alert("�α��ν���")
		}
		//4)���̵� ��ġ�����ʰ� ��й�ȣ�� ��ġ�� ���//
		if($('#id').val()!=$('#hidden_id').val()){
			alert("���̵� ��ġ�����ʽ��ϴ�.")
			//5)���̵� �°� ��й�ȣ�� ��ġ�����ʴ°��//
		} if($('#password').val()!=$('#hidden_pwd').val()){
			alert("��й�ȣ�� ��ġ�����ʽ��ϴ�.")
		}
		//�α��� ����/���н� �������� ���ش�//	
		$('#id').val('');
		$('#password').val('');
		//�α��� ������������  ������ �κп���  ȣ�̽����� ���־ �������� �̵��ϴ� �Լ��� ȣ���Ѵ�.//
		function page_href() {
			location.href = "https://www.naver.com/";

			}

})





</script>
</html>