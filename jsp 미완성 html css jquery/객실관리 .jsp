<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Freelancer - Start Bootstrap Theme</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
         <link href="style.css" rel="stylesheet" type="text/css">
    </head>
    <body id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">메인</a>
                <button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                      
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#about">객실관리</a></li>
                      
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead bg-primary text-white text-center">
            <div class="container d-flex align-items-center flex-column">
                <!-- Masthead Avatar Image-->
               
                <!-- Masthead Heading-->
                <h1 class="masthead-heading text-uppercase mb-0">객실관리 프로그램</h1>
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
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">객실관리 시작하기</h2>
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
                <h2 class="page-section-heading text-center text-uppercase text-white">객실관리</h2>
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
                 <!-- 왼쪽 셀렉트 박스에요 아이디는 "selectBox"-->
              <select class="custom-select" id="selectBox">
              <option selected>방을선택해주세요 </option>
              <option value="1">room1</option>
              <option value="2">room2</option>
              <option value="3">room3</option>
            </select>
            <table border="1" id="room-table">
              
            </table>
          </div>
           <!-- 여기부터는 오른쪽에있는 내용물들 이에요!-->
            <!-- 테이블로 짰어요!-->
        <div class="right">
        <table>
      <tr><td><div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">객실명</span>
          </div>
           <!-- 객실명 옆에 있는 input 이에요 아이디는 "room-name"이에요 !-->
          <input type="text" id="room-name" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
      <tr><td><div class="input-group">
          <div class="input-group-prepend">
            <span class="input-group-text">객실분류</span>
          </div>
          <!-- 객실분류 옆에 있는 input 이에요 아이디는 "room-div"이에요 !-->
          <textarea class="form-control" id="room-div" aria-label="With textarea"></textarea>
        </div>
        <br></td></tr>
      <tr><td><div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">1박요금</span>
          </div>
           <!-- 1박요금 옆에 있는 input 이에요 아이디는 "room-expense"이에요 !-->
          <input type="text" class="form-control" id="room-expense" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
      <tr><td><div class="input-group mb-3">
          <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-default">숙박인원</span>
          </div>
          <!-- 숙박인원 옆에 있는 input 이에요 아이디는 "person" 이에요 !-->
          <input type="text" class="form-control"id="person" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div><br></td></tr>
        </table>
        <!-- 등록(수정)버튼 삭제버튼 비우기 버튼  이에요 !-->
        <!-- 등록(수정)은 update 이고 삭제버튼은 delete 이며 비우기버튼은 remove입니다.!-->
        <div class="button-items">
          <button type="button" id="update" class="btn btn-primary">등록(수정)</button>
          <button type="button" id="delete" class="btn btn-secondary">삭제</button>
          <button type="button"id="reset"  class="btn btn-danger">비우기</button>
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
        <script src="js/scripts.js"></script>
    </body>
    <script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<script language="javascript">
    
    $(document)
    //Create(insert부분)//
    .on('click','#update',function(){
        var r1 = $('#room-name').val();
        var r2 = $('#room-div').val();
        var r3 = $('#room-expense').val();
        var r4 = $('#person').val();

        $('#room-name').val("");
        $('#room-div').val("");
        $('#room-expense').val("");
        $('#person').val("");
        
        $('table:eq(0)').append('<tr><td>'+r1+'</td><td>'+r2+'</td><td>'+ r3+'</td><td>'+r4+'</td></tr>');

    })
    $(document)
    //Delete(remove(delete)부분)//
    //테이블에있는 내용물을 삭제합니다.//
    .on('click','#delete',function(){
        $('table:eq(0) tr').eq(0).remove();
    })
    $(document)
    .on('click','#reset',function(){
         $('#room-name').val("");
         $('#room-div').val("");
         $('#room-expense').val("");
         $('#person').val("");
    })
    $(document)
    .on('click','#selectBox',function(){
       var s1 =  $(this).find("option:selected").text();
       $('#room-name').val(s1);



    })
</script> 