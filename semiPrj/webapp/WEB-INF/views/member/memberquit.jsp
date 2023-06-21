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
    <link rel="stylesheet" href="/resources/css/member/S_membereditpage.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
</head>
<body>
   <%@include file="/WEB-INF/views/common/header_be.jsp" %>
    <%@include file="/WEB-INF/views/common/sidebar_my.jsp" %>

<div>
<h2>회원 탈퇴</h2>
</div>
<div class="red_bar"></div>
<section>
<form action="" method="post">
<table  cellpadding="5"  cellspacing="0" class="edit_table">
  <tr>
    <td>이름</td>
    <td><input type="text" value="" required="required"></td>
  </tr>
  <tr>
    <td>전화번호</td>
    <td><input type="text" value="" required="required"></td>
  </tr>
  <tr>
    <td>비밀번호</td>
    <td><input type="password" value="" style=" height: 40px;
      font-size: 20px;" required="required"></td>
  </tr>

  <tr>
    <td colspan="2" style="text-align: center;"><input class="btn01" type="submit" value="탈퇴하기"></td> 
  </tr>
</table>
</form>


</section>
<br><br><br><br>

    <%@include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>