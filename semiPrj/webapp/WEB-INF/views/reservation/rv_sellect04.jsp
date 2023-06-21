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
    <link rel="stylesheet" href="/resources/css/reservation/rv_sellect04.css">
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
        
        <table border="1" class="time_sellect">
            <colgroup>
                <col class="col1"/>
                <col class="col2"/>
            </colgroup>
            <tr>
                <td class="d_td"><label for="date">날짜</label></td>
                <td><input type="date" id="date" name="date" required></td>
            </tr>
            <tr>
                <td class="d_td">오전</td>
                <td>
                    <div>
                        <input type="radio" name="time" value="time_1000">
                        <label for="time_1000">10:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time"" value="time_1030">
                        <label for="time_1030">10:30</label> &nbsp;&nbsp;
                        <input type="radio" name="time"" value="time_1100">
                        <label for="time_1100">11:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time"" value="time_1130">
                        <label for="time_1130">11:30</label>
                    </div>
                </td>
            </tr>
            <tr>
                <td class="d_td">오후</td>
                <td>
                    <div>
                        <input type="radio" name="time" value="time_1200">
                        <label for="time_1200">12:00</label> &nbsp;
                        <input type="radio" name="time" value="time_1230">
                        <label for="time_1230">12:30</label> &nbsp;
                        <input type="radio" name="time" value="time_1300">
                        <label for="time_1300">1:00</label> &nbsp;&nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1330">
                        <label for="time_1330">1:30</label>&nbsp; <br>
                        <input type="radio" name="time" value="time_1400">
                        <label for="time_1400">2:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1430">
                        <label for="time_1430">2:30</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1500">
                        <label for="time_1500">3:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1530">
                        <label for="time_1530">3:30</label> <br>
                        <input type="radio" name="time" value="time_1600">
                        <label for="time_1600">4:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1630">
                        <label for="time_1630">4:30</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1700">
                        <label for="time_1700">5:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1730">
                        <label for="time_1730">5:30</label> <br>
                        <input type="radio" name="time" value="time_1800">
                        <label for="time_1800">6:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1830">
                        <label for="time_1830">6:30</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1900">
                        <label for="time_1900">7:00</label> &nbsp;&nbsp;
                        <input type="radio" name="time" value="time_1930">
                        <label for="time_1930">7:30</label>
                    </div>
                </td>
            </tr>
        </table>

        <div style="text-align: center;">
            <button type="button">
                <a href="/reservation/rvSellect03">이전</a>
            </button>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" onclick="nextPage4()">다음</button>

                <script src="/resources/js/rv_sellect.js"></script>
        </div>
        


    </form>

    <%@ include file="/WEB-INF/views/common/footer.jsp" %>



    
        
    
    



</body>
</html>