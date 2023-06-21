<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COTYLEDON ROOM</title>
    <link rel="stylesheet" href="/resources/css/common/main.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/designer/d_calendar.css">
    <link rel="stylesheet" href="/resources/css/common/css.css">
</head>
<body>
<%@include file="/WEB-INF/views/common/header_de.jsp" %>


<br>
<br>
<div class="order_title">
<strong>디자이너</strong>
</div>

<div class="bar"></div>

<section class="calendar_1">
<div class='rap'>
    <div class="header">
       <div class="btn prevDay"></div>
      <h2 class='dateTitle'></h2>
      <div class="btn nextDay"></div>
    </div>
    
    <div class="grid dateHead">
      <div>일</div>
      <div>월</div>
      <div>화</div>
      <div>수</div>
      <div>목</div>
      <div>금</div>
      <div>토</div>
    </div>

    <div class="grid dateBoard"></div>
  </div>
 
</section>        
<div class="back"></div>


    <%@include file="/WEB-INF/views/common/footer.jsp" %>

    <script src="/resources/js/calendar.js"></script>

</body>
</html>