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
    <link rel="stylesheet" href="/resources/css/member/orderList.css">
    <link rel="stylesheet" href="/resources/css/admin/L_css.css">
</head>
<body>
    
    <%@ include file="/WEB-INF/views/common/header_af.jsp" %>
    <%@ include file="/WEB-INF/views/common/sidebar_my.jsp" %>
    
<br>
<br>
<div class="order_title">
<strong>My 리뷰</strong>
</div>

<div class="bar"></div>
    
<div class="board_wrap">
    <div class="board_title">
        <br>
        <br>
        <Strong>리뷰 등록</Strong>
    </div>
    <div class="board_write_wrap">
        <div class="board_write">
            
            <div class="info">
                <dl>
                    <dt>글쓴이</dt>
                    <dd><input type="text" placeholder="글쓴이 입력"></dd>
                </dl>
                <dl>
                    <dt>비밀번호</dt>
                    <dd><input type="password" placeholder="비밀번호 입력"></dd>
                </dl>
                <dl>
                    <dt>사진첨부</dt>
                    <dd><input type="file" placeholder="사진첨부"></dd>
                </dl>
            </div>
            <div class="cont">
                <textarea placeholder="내용 입력"></textarea>
            </div>             
        </div>
        <div class="bt_wrap">
            <a href="/communication/reviewlist" class="on">수정</a>
            <a href="/communication/reviewlist">취소</a>
        </div>
    </div>
 </div>
</div>
<br><br><br><br>

    <%@ include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>