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
    <link rel="stylesheet" href="/resources/css/admin/L_css.css">
</head>
<body>
   <%@include file="/WEB-INF/views/common/header_be.jsp" %>
      <%@include file="/WEB-INF/views/common/sidebar_com.jsp" %>
<div style="height: 600px;">
<div class="board_wrap">
    <div class="board_title">
        <Strong>FAQ 게시판</Strong>
    </div>
    <div class="board_view_wrap">
          <div class="board_view">
              <div class="title">
                  ${FAQ_Vo.title}

              </div>
              <div class="info">
              <h1>@{FAQVo}</h1>
                  <dl>
                      <dt>번호</dt>
                      <dd>${FAQ_Vo.no}</dd>
                  </dl>
                  <dl>
                      <dt>글쓴이</dt>
                      <dd>${FAQ_Vo.writer}</dd>
                  </dl>
                  <dl>
                      <dt>작성일</dt>
                      <dd>${FAQ_Vo.enrollDate}</dd>
                  </dl>
                  <dl>
                      <dt>조회수</dt>
                      <dd>${FAQ_Vo.hit}</dd>
                  </dl>

              </div>
              <div class="cont">
                 ${FAQ_Vo.content}
              </div>
              
          </div>
          <div class="bt_wrap">
              <a href="/communication/FAQ_list?page=1" class="on">목록</a>
          </div>
      </div>
    </div>
</div>

  <br><br>

<%@include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>