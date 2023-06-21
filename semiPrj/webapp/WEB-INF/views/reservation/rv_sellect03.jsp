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
    <link rel="stylesheet" href="/resources/css/reservation/rv_sellect03.css">
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
        <table border="1" class="cut_sellect">
            <colgroup>
                <col class="col1"/>
                <col class="col2"/>
                <col class="col3"/>
                <col class="col4"/>
            </colgroup>
            <tr>
                <th colspan="3">시술 메뉴</th>
                <th>선택</th>
            </tr>
            <tr>
                <td class="d_td">
                    남자 컷트
                </td>
                <td>
                    <p>
                        디자인 남성커트
                        머리숱, 곱슬유무, 얼굴형에 맞는 디자인커트로 진행 해드립니다. <br>
                        디자인커트+두피케어샴푸+두피앰플+스타일링
                    </p>
                </td>
                <td>
                    <p>15,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="m_cut">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    여자 컷트
                </td>
                <td>
                    <p>
                        헤어스타일의 시작 커트
                        고객님의 두상,얼굴형,곱슬유무를 파악하여 디자인커트로 진행 해드립니다. <br>
                        디자인커트+두피앰플+스타일링
                    </p>
                </td>
                <td>
                    <p>18,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="f_cut">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    두피관리 컷트
                </td>
                <td>
                    <p>
                        샴푸만으로는 씻겨지지않는 노폐물이나 각질을 부드럽게 제거하여 <br>
                        두피를 깨끗하게 관리할 수 있는 두피관리가 포함되어있는 커트
                    </p>
                </td>
                <td>
                    <p>27,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="care_cut">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    남성 사이드 다운펌
                </td>
                <td>
                    <p>
                        남성만의 고민 깔끔하게 해결해드립니다.
                    </p>
                </td>
                <td>
                    <p>20,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="down_fama">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    남성 디자인펌
                </td>
                <td>
                    <p>
                        남성 디자인펌입니다. <br>
                        쉐도우펌, 애즈펌, 가르마펌 등등 디자인이 들어간 펌
                    </p>
                </td>
                <td>
                    <p>70,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="m_pama">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    여성 디자인펌
                </td>
                <td>
                    <p>
                        여성 디자인펌입니다. <br>
                        베이직, 일반펌
                    </p>
                </td>
                <td>
                    <p>20,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="w_pama">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    남성 염색
                </td>
                <td>
                    <p>
                        남자만의 스타일 나는 컬러 <br>
                        염색전용샴푸+트랜드 디자인컬러
                    </p>
                </td>
                <td>
                    <p>50,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="m_dye">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    여성 염색
                </td>
                <td>
                    <p>
                        요즘 유행하는 트렌드컬러의 표현이 가능합니다. <br>
                        염색전용샴푸+트랜드 디자인컬러
                    </p>
                </td>
                <td>
                    <p>60,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="w_dye">선택하기
                    </label>
                </td>
            </tr>
            <tr>
                <td class="d_td">
                    드라이
                </td>
                <td>
                    <p>
                        오늘은 특별한 날이니까 더욱 깔끔하게~<br>
                    </p>
                </td>
                <td>
                    <p>18,000 원</p>
                </td>
                <td>
                    <label>
                        <input type="radio" name="cut" value="dry">선택하기
                    </label>
                </td>
            </tr>
            
        </table>

        <div style="text-align: center;">
            <button type="button">
                <a href="/reservation/rvSellect02">이전</a>
            </button>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" onclick="nextPage3()">다음</button>

                <script src="/resources/js/rv_sellect.js"></script>
        </div>


    </form>

    <%@ include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>