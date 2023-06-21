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
    <link rel="stylesheet" href="/resources/css/common/css.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/member/S_orderhistory.css">

</head>
   <%@include file="/WEB-INF/views/common/header_be.jsp" %>
   <%@include file="/WEB-INF/views/common/sidebar_my.jsp" %>
<br>
<br>
<div class="order_title">
<strong>My 쇼핑</strong>
</div>

<div class="bar"></div>
    
<div class="board_wrap">
    <div class="board_title">
        <Strong>주문내역</Strong>
    </div>
    <div class="board_list_wrap">
        <div class="board_list">
          <div class="top">
            
            <div style="width: 900px; overflow: hidden;">
              <table id="banner" style="width: 250px;">
                <tr>
                  <td><img src="/resources/image/NUBESALBAR/0.png" ></td>
                  <td><img src="/resources/image/RESONARE/0.png"></td>
                  <td><img src="/resources/image/MITIS/0.png"></td>
                  <td><img src="/resources/image/NUBESALBAR/0.png"></td>
                  <td><img src="/resources/image/RESONARE/0.png"></td>
                  <td><img src="/resources/image/MITIS/0.png"></td>
                </tr>
              </table>
              <div>
              <button onclick="moveRight()" style="float: left;"><img src="/resources/image/back_arrow_icon.png" alt="" style="width: 20px;"></button>
              <button onclick="moveLeft()" style="float: right;"><img src="/resources/image/forward_arrow_icon.png" alt="" style="width: 20px;"></button></div>
            </div>
            </div>
            </div>
            
            <hr>
            <br>
            <div>
              <h2>구매 정보</h2>
              <br>
              <table class="order_table">
                <tr>
                  <td class="order_td1">구매 구성</td>
                  <td>1. 레조나레 100ml</td>
                  <td>2. 마티스 100ml</td>
                </tr>
                <tr>
                  <td>구매 금액</td>
                  <td>11,500원</td>
                  <td></td>
                </tr>
                <tr>
                  <td>배송 상태</td>
                  <td>2023.03.12 전달완료</td>
                  <td></td>
                </tr>
              </table>
            </div>
            <br>
            <hr>
            <br>

            <div>
              <h2>결제 정보</h2>
              <br>
              <table class="order_table">
                <tr>
                  <td class="order_td1" >결제 수단</td>
                  <td>비씨카드(1234)</td>
                </tr>
                <tr>
                  <td>결제 금액</td>
                  <td>11,500원</td>
                </tr>
                <tr>
                  <td>결제 상태</td>
                  <td>2023.02.12 결제완료</td>
                </tr>
              </table>
            </div>
            <br>
            <hr>
            <br>
            <div>
                <h2>배송 정보</h2>
                <br>
              <table class="order_table">
                <tr>
                  <td class="order_td1">받는 사람</td>
                  <td>김수잔</td>
                </tr>
                <tr>
                  <td>연락처</td>
                  <td>010-1234-0864</td>
                </tr>
                <tr>
                  <td>주소</td>
                  <td>(1234)강원도 원주시</td>
                </tr>
                <tr>
                  <td>운송장 번호</td>
                  <td>CJ대한통운,123456789 <a href="#" style="text-decoration: underline;">배송조회</a></td>
                </tr>
              </table>
            </div>
           
            
            <script>
              let banner = document.getElementById("banner");
              let currentPosition = 0;
              let images = banner.getElementsByTagName("img");
            
              function moveLeft() {
                currentPosition += images[0].width;
                if (currentPosition > 0) {
                  currentPosition = -(images.length - 1) * images[0].width;
                }
                banner.style.transform = "translateX(" + currentPosition + "px)";
              }
            
              function moveRight() {
                currentPosition -= images[0].width;
                if (currentPosition < -(images.length - 1) * images[0].width) {
                  currentPosition = 0;
                }
                banner.style.transform = "translateX(" + currentPosition + "px)";
              }
            </script>

        </div>


        <div class="bt_wrap">
            <a href="/" class="on">뒤로가기</a>
            <!-- <a href="#">수정</a> -->
        </div>
    </div>
</div>
</div>
<%@include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>