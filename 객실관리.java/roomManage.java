<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>���ǰ���</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
         <link href="styles.css" rel="stylesheet" type="text/css">
        
    </head>
    <body id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">����</a>
                <button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                           <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="bookManage.jsp">�������</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#about">���ǰ����Ϸ�����</a></li>
                      
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead bg-primary text-white text-center">
            <div class="container d-flex align-items-center flex-column">
                <!-- Masthead Avatar Image-->
               
                <!-- Masthead Heading-->
                <h1 class="masthead-heading text-uppercase mb-0">���ǰ��� ���α׷�</h1>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- Masthead Subheading-->
               
            </div>
        </header>
        <!-- Portfolio Section-->
        <section class="page-section portfolio" id="room-manage">
            <div class="container">
                <!-- Portfolio Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">���ǰ��� �����ϱ�</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
              
        <!-- About Section-->
        <section class="page-section bg-primary text-white mb-0" id="about">
            <div class="container">
                <!-- About Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-white">���ǰ���</h2>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- About Section Content-->
               
    
         <div class="wrapper">
            
            <div class="main-contents1">
            <div class="left">
            
                 <!-- ���� ����Ʈ �ڽ����� ���̵�� "selectBox"-->
              <select class="custom-select" name="selectBox" style="width:300px; height:400px;" id="selectBox">
             
              <option selected>
              
              <table id='table' border=1 >
              <tr><td>���Ǹ�</td><td>���Ǻз�</td><td>�ѿ�� ���</td><td>�����ο�</td></tr>
              
              
              
              </table>
              
              </option>
              
              
            </select>
            <table border="1" id="room-table">
              
             </table>
              
            
            
          </div>
           <!-- ������ʹ� �����ʿ��ִ� ���빰�� �̿���!-->
            <!-- ���̺�� ®���!-->
        <div class="right">
        <table>
      <tr><td>
      <div class="input-hidden">
      <!-- id="hi_roomId"-->
      <input type = "hidden" id="roomid" name="roomid">
      
      </div>
      <div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">���Ǹ�</span>
          </div>
           <!-- ���Ǹ� ���� �ִ� input �̿��� ���̵�� "room-name"�̿��� !-->
          <input type="text" id="roomname" name="roomname" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
      <tr><td><div class="input-group">
                  <select class="custom-select custom-select-lg mb-3"name="roomitem2" value="roomitem2" id="roomitem2">
     
    <option selected>����</option>
                           <option value="Suite">SuiteRoom</option>
                           <option value="Family">FamilyRoom</option>
                           <option value="Double">DoubleRoom</option>
                           <option value="Single">SingleRoom</option>
                           <option value="Domtory">Dormitory</option>
   </select>
          <!-- ���Ǻз� ���� �ִ� input �̿��� ���̵�� "room-div"�̿��� !-->
          
        </div>
        <br></td></tr>
      <tr><td><div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">�ѿ��</span>
          </div>
           <!-- 1�ڿ�� ���� �ִ� input �̿��� ���̵�� "room-expense"�̿��� !-->
          <input type="text" class="form-control" id="roomexpense" name="roomexpense"aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
      <tr><td><div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">�����ο�</span>
          </div>
          <!-- �����ο� ���� �ִ� input �̿��� ���̵�� "person" �̿��� !-->
          <input type="text" class="form-control"id="person" name="person" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
        </table>
        <!-- ���(����)��ư ������ư ���� ��ư  �̿��� !-->
        <!-- ���(����)�� update �̰� ������ư�� delete �̸� �����ư�� remove�Դϴ�.!-->
        <div class="button-items">
          <button type="button" id="update" class="btn btn-dark">���</button>
          <button type="button" id="edit" class="btn btn-info">����</button>
          <button type="button" id="delete" class="btn btn-warning">����</button>
          <button type="button" id="reset"  class="btn btn-danger">����</button>
        </div>
        </div>
        </div>
           </div>
                
            </div>
        </section>
       
        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <!-- Contact form JS-->
        <script src="assets/mail/jqBootstrapValidation.js"></script>
        <script src="assets/mail/contact_me.js"></script>
        <!-- Core theme JS-->
           <script type ="text/javascript" src="scripts.js"> </script>

    </body>
    <script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<script language="javascript">
   
    
    $(document)
    //Create(insert�κ�)//
    .on('click','#update',function(){
       $.ajax({
          url:'RoomSubmit',
          method:'get',
         // data:'roomname='+$('input[name=roomname]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val(),
         data:'roomname='+$('input[name=roomname]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val()+'&roomid='+$('input[name=roomid]').val(),
          dataType:'text',
          beforeSend:function(){},
          success:function(txt){
             //alert(txt);
             
          },
          complete:function(txt){
             alert("have a nice day");
             $('#selectBox:eq(0)').append(txt);
          }
       })
        var r1 = $('#roomname').val();
        var r2 = $("#roomitem2 option:selected").val();
        var r3 = $('#roomexpense').val();
        var r4 = $('#person').val();
       
        $('#roomname').val(r1);
        $('#roomitem2').val(r2);
        $('#roomexpense').val(r3);
        $('#person').val(r4);
        //table//
        $('#selectBox:eq(0)').append('<option><table><tr><td>'+r1+'</td><td>'+r2+'</td><td>'+r3+'</td><td>'+r4+'</td></tr></table></option>');
        $('#roomname').val("");
        $('#roomitem2').val("");
        $('#roomexpense').val("");
        $('#person').val("");
        // ��κ��� �ѹ������غ��°�?
        
        
    })
    
    $(document)
    .on('click','#edit',function(){
       $.ajax({
            url:'RoomEdit',
            method:'get',
            data:'roomid='+$('input[name=roomid]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val()+'&roomname='+$('input[name=roomname]').val(),
            //data:'roomname='+$('input[name=roomname]').val()+'&roomitem2='+$('#roomitem2 option:selected').text()+'&roomexpense='+$('input[name=roomexpense]').val()+'&person='+$('input[name=person]').val()+'&roomid='+$('input[name=roomid]').val(),
            dataType:'text',
            beforeSend:function(){},
            success:function(txt){
               alert(txt);
            },
            complete:function(){
               alert("have a nice day");
            }
         })
        var r01 =  $('#roomname').val();
        var r02 = $('#roomitem2').val();
        var r03 =  $('#roomexpense').val();
        var r04 = $('#person').val();
          $('#roomname').val("");
          $('#roomitem2').val("");
          $('#roomexpense').val("");
          $('#person').val("");
        
        
        $('#selectBox:eq(0) tr').eq(0).remove();
        $('#selectBox:eq(0)').append('<option><table><tr><td>'+r01+'</td><td>'+r02+'</td><td>'+r03+'</td><td>'+r04+'</td></tr></table></option>');
       
     
    })
    
    
    $(document)
    //Delete(remove(delete)�κ�)//
    //���̺��ִ� ���빰�� �����մϴ�.//
    .on('click','#delete',function(){
       $.ajax({
          url:'RoomCancle',
          method:'get', 
          data:'roomname='+$('input[name=roomname]').val(),
          dataType:'text',
          beforeSend:function(){},
          success:function(txt){
             alert(txt);
          }, 
          complete:function(){
             alert("have a nice day");
          }
       })
        $('#selectBox:eq(0) tr').eq(0).remove();
       $('#roomname').val;
       $('#roomname').val("");
        $('#roomitem2').val("");
        $('#roomexpense').val("");
        $('#person').val("");
    })
    $(document)
    .on('click','#reset',function(){
         $('#roomname').val("");
         $('#roomitem2').val("");
         $('#roomexpense').val("");
         $('#person').val("");
    })
   
    
   $(document)
   .on('click','#selectBox',function(){
	 
      var idx = $("#selectBox option:selected").index();
      var s1 = $('table:eq('+(idx-1)+') td').eq(0).text();
      var s2 = $('table:eq('+(idx-1)+') td').eq(1).text();
      var s3 = $('table:eq('+(idx-1)+') td').eq(2).text();
      var s4 = $('table:eq('+(idx-1)+') td').eq(3).text();
        var id = $('#hi_roomId').val();
      $('#roomname').val(s1);
      $('#roomitem2').val(s2);
      $('#roomexpense').val(s3);
      $('#person').val(s4);
   })
   
     $(document)
   .on('click','#selectBox',function(){
     $.get('RoomSelect',{},function(txt){
    	
			
			ar = txt.split(',');
			for(i=0;i<ar.length;i++){
				//<tr><td>John</td></tr>�̷������� �ְԵȴ�.//
				name =ar[i];
				$('#roomid').val(name);
			}
			
			console.log(name)
			
		},'text');
		return false;
   })
   
</script> 