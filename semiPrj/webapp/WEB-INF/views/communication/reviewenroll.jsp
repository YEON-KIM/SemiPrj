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
    
    <%@ include file="/WEB-INF/views/common/header_be.jsp" %>
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
    
    <form action="/communication/reviewenroll" method="post" enctype="multipart/form-data">
    <div class="board_write_wrap">
        <div class="board_write">
            
            <div class="info">
                <dl>
                    <dt>글쓴이</dt>
                    <dd><input type="text" name="writer" value="${loginMember.nick}" readonly="readonly"></dd>
                </dl>
                <dl>
                    <dt>예약번호</dt>
                    <dd><input type="text" placeholder="예약번호 입력" name="rNo"></dd>
                </dl>
                <!-- <dl>
                    <dt>사진첨부</dt>
                    <dd><input type="file" name="f" placeholder="사진첨부"></dd>
                </dl> -->
            </div>
            <div class="cont">
                <textarea placeholder="내용 입력" name="content"></textarea>
            </div>             
        </div>
        <div class="bt_wrap">
            <input type="submit" value="작성">
            <a href="/communication/reviewlist?page=1">취소</a>
        </div>
    </div>
    </form>
 </div>
</div>
<br><br><br><br>

    <%@ include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>