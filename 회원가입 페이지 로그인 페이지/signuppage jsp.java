<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ȸ������</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
.title{
	text-align:center;
	font-size:100px;
	font-weight:bold;
	margin-top:100px;
	
}

.signup-forms{
 width: 500px;
 margin:0 auto;
 margin-top:100px;
 

}



</style>
</head>
<body>
<p class="title">ȸ������</p>
<div class="signup-forms">
<div class="items">
<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">���̵�</span>
  </div>
  <input type="text" id="id" name="id" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
  <button type="button" id="check_id"name="check_id" class="btn btn-primary">�ߺ��˻�</button>
</div>


<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">��й�ȣ</span>
  </div>
  <input type="password" id="password" name="password" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">


</div>


<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">��ȭ��ȣ</span>
  </div>
  <input type="text" id="mobile" name="mobile" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">�̸�</span>
  </div>
  <input type="text" id="name" name="name" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">�̸����ּ�</span>
  </div>
  <input type="text" id="email" name="email" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>

  <input type="text" id="check_hidden1" name="check_hidden1">
 



</div>
<button type="button" id="insert" name="insert" class="btn btn-success">���</button>
<button type="button" id="clear" name="clear" class="btn btn-danger">����</button>


</div>

</body>
</html>

<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">

$( document ).ready(function() {
	$.get('loginform',{},function(txt){//txt="john, smith ,...,jane"//
		
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
			//<tr><td>John</td></tr>�̷������� �ְԵȴ�.//
			check1 = ar[i];
			$('#check_hidden1').val(check1);
			console.log(check1)
		}
		
	},'text');
	
	return false;
    
});

$(document)
.on('click','#check_id',function(){
	if($('#id').val()==""){
		alert("�Է��ʵ带 �������� �Ѽ� �����ϴ�.");
		return false;
	}
	if($('#id').val()==$('#check_hidden1').val()){
		alert("���̵� �ߺ��˴ϴ�.")
		return false;
	}else{
		alert("��밡���� ���̵��Դϴ�.")
	}
	return false;
})





$(document)
.on('click','#insert',function(){
	//===>insert<===//
	if($('#id').val()==""){
		alert("���̵���� �������� �Է��Ҽ������ϴ�.")
		return false;
	}if($('#password').val()==""){
		alert("��й�ȣ���� �������� �Է��Ҽ������ϴ�.")
		return false;
	}if($("#mobile").val()==""){
		alert("����Ϲ�ȣ���� �������� �Է��Ҽ������ϴ�.")
		return false;
	}if($('#name').val()==""){
		alert("�̸����� �������� �Է��Ҽ������ϴ�.")
		return false;
	}if($('email').val()==""){
		alert("�̸��� ���� �������� �Է��Ҽ������ϴ�.")
		return false;
	}if($('#id').val()==$('#check_hidden1').val()){
		alert("���̵� �ߺ��˴ϴ�.")
		return false
	}
	if($.isNumeric($('#name').val())==true){
		alert("�̸������� ���ڰ� ���������ϴ�.")
		return false;
	}
	if($.isNumeric($('#mobile').val())==false){
		alert("����Ϲ�ȣ������ ���ڸ� ���� �ֽ��ϴ�.")
		return false;
	}
	

	$.ajax({
		  url:'Signup',//ȣ��� ������ ���(�̸�)
		  method:'get',//������ ���۹�� get/post
		  //������ ������(������Ʈ��)//
		  data:'id='+$('input[name=id]').val()+'&password='+$('input[name=password]').val()+'&mobile='+$('input[name=mobile]').val()+'&name='+$('input[name=name]').val()+'&email='+$('input[name=email]').val(),
		  dataType:'text',//��ȯ���� ������ Ÿ�� 
		  beforeSend:function(){},
		  success:function(txt){//ȣ�� �����ؼ� �Ϸ��ϸ� 
			alert("�Է¿Ϸ�Ǿ����ϴ�.");
		},
		complete:function(){
			
		} 
		
	    })
	    alert("ȸ������ �Ϸ�! �α��� �������� �̵��մϴ�.");
		myFnc();
		function myFnc(){
			location.href = "loginform.jsp";

		}
	
})
	    

$(document)
.on('click','#clear',function(){
	$('#id').val("");
	$('#password').val("");
	$('#mobile').val("");
	$('#name').val("");
	$('#email').val("");
	
	
})




</script>