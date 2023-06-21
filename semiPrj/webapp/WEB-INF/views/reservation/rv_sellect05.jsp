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
    <link rel="stylesheet" href="/resources/css/reservation/rv_form.css">
    <link rel="stylesheet" href="/resources/css/reservation/rv_sellect05.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    
    <style>
        
    </style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/header_be.jsp" %>
    <%@ include file="/WEB-INF/views/common/sidebar_my.jsp" %>
    

    <div class="rv_word">
        <p class="rv_word_title">예약</p><br>
        <p class="rv_word_content">
            실시간 예약을 통해 편리한 매장이용을 도와드립니다.<br>
            기타 문의사항은 해당 매장으로 문의 부탁드립니다.
        </p>
    </div>
    <div class="bar"></div>

    <form action="">
        <div class="rv_container">
            <div class="rv_item1">01<br>매장 선택</div>
            <div class="rv_item2">02<br>디자이너 선택</div>
            <div class="rv_item3">03<br>시술 선택</div>
            <div class="rv_item4">04<br>일정 선택</div>
            <div class="rv_item5">05<br>예약 확인</div>
        </div>
        <div class="bar"></div>
    </form>

    <form action="">
        <table class="rv_payment" border="1">
            <colgroup>
                <col class="col1"/>
                <col class="col2"/>
                <col class="col3"/>
            </colgroup>
            <tr>
                <td rowspan="5">
                    <img src="/resources/image/디자이너1.jpg" alt="image" style="width: 300px; height: 300px; float: left;">
                    <br><br><br>
                    <h2>김라라 디자이너</h2>
                    <br>
                    <p>최선을 다하겠습니다.</p>
                </td>
                <td  class="d_td">예약매장</td>
                <td>역삼점</td>
            </tr>
            <tr>
                <td  class="d_td">날짜</td>
                <td>2023/04/01</td>
            </tr>
            <tr>
                <td class="d_td">시간</td>
                <td>12:00</td>
            </tr>
            <tr>
                <td class="d_td">예약자</td>
                <td>김승우</td>
            </tr>
            <tr>
                <td class="d_td">시술정보</td>
                <td>남자 컷트</td>
            </tr>
            <tr>
                <td>실제 이용금액은 세부 시술 내용에 따라 달라질 수 있습니다.</td>
                <td class="d_td">예상금액</td>
                <td>18000원</td>
            </tr>
        </table>

        <div class="agree">
            <input type="checkbox" name="checkbox" id="checkbox">이용약관을 동의합니다.
        </div>

        <div style="text-align: center;">
            <button type="button">
                <a href="/reservation/rvSellect04">이전</a>
            </button>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" onclick="nextPage5()">다음</button>

                <script src="/resources/js/rv_sellect.js"></script>
        </div>

    </form>
    

    
    <%@ include file="/WEB-INF/views/common/footer.jsp" %>
        
    
    



</body>
</html>