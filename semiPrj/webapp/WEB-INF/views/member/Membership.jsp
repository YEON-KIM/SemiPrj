<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>멤버쉽</title>
    <link rel="stylesheet" href="/resources/css/member/membershipstyle.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/common/main.css">
</head>
<body>
<%@include file="/WEB-INF/views/common/header_be.jsp" %>
<br><br><br><br><br>
    <div>
      <img src="/resources/image/membershipcard.png" alt="" width="350px">
      </div>
      <br><br>
      <div class="membership">
        <h2>멤버십</h2>
      </div>
      <br><br>
      <div class="membership">
        <hr>
        <br>
        <table class="order_table">
          <tr>
            <td>등급</td>
            <td><img src="/resources/image/멤버쉽 실버 영역.png" alt="" width="100px"></td>
            <td><img src="/resources/image/멤버쉽 골드영역.png" alt="" width="100px"></td>
            <td><img src="/resources/image/멤버쉽 다이아몬드영역.png" alt="" width="130px"></td>
          </tr>
          <tr>
            <td>기준</td>
            <td>5회 방문 <br>
              20만원 이상 구매시</td>
            <td>10회 방문 <br>
              50만원 이상 구매시</td>
            <td>20회 방문 <br>
              100만원 이상 구매시</td>
          </tr>
          <tr>
            <td>할인</td>
            <td>5%</td>
            <td>10%</td>
            <td>15%</td>
          </tr>
          <tr>
            <td>혜택</td>
            <td>-</td>
            <td>-</td>
            <td>생일 이벤트 50% DC</td>
          </tr>
        </table>
      </div>
      <br><br><br>
   <%@include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>