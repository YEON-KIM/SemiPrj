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
    <link rel="stylesheet" href="/resources/css/reservation/rv_sellect02.css">
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
        <table  class="designer_intro" >
            <colgroup>
                <col class="col1"/>
                <col class="col2"/>
                <col class="col3"/>
                <col class="col4"/>
            </colgroup>
            <tr>
                <td><img src="/resources/image/shop3.jpg" alt=""></td>
                <td>
                    <h2>&nbsp;&nbsp;김승우 디자이너</h2><br>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;고객이 왕이다</p>
                    <br>&nbsp;&nbsp;&nbsp;
                    <label>
                        <input type="radio" name="designer" value="designer1">선택하기
                    </label>
                </td>
                <td><img src="/resources/image/shop3.jpg" alt=""></td>
                <td>
                    <h2>&nbsp;&nbsp;김수잔 디자이너</h2><br>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;당신만의 분위기를 담은 디자인</p>
                    <br>&nbsp;&nbsp;&nbsp;
                    <label>
                        <input type="radio" name="designer" value="designer2">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td><img src="/resources/image/shop3.jpg" alt=""></td>
                <td>
                    <h2>&nbsp;&nbsp;김동준 디자이너</h2><br>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;변신시켜 드립니다</p>
                    <br>&nbsp;&nbsp;&nbsp;
                    <label>
                        <input type="radio" name="designer" value="designer3">선택하기
                    </label>
                </td>
                <td><img src="/resources/image/shop3.jpg" alt=""></td>
                <td>
                    <h2>&nbsp;&nbsp;강주희 디자이너</h2><br>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;고객 맞춤</p>
                    <br>&nbsp;&nbsp;&nbsp;
                    <label>
                        <input type="radio" name="designer" value="designer4">선택하기
                    </label>
                </td>
            </tr>
            
        </table>

            <div style="text-align: center;">
                <button type="button">
                    <a href="/reservation/rvSellect01">이전</a>
                </button>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <button type="button" onclick="nextPage2()">다음</button>

                <script src="/resources/js/rv_sellect.js"></script>
            </div>

    </form>
    
    
        
    
    <%@ include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>