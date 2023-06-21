<%@page import="coty.admin.qna.dvo.QNA_a_Dao"%>
<%@page import="coty.admin.qna.dvo.QNA_a_Vo"%>
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
    <link rel="stylesheet" href="/resources/css/common/comment.css">
    <link rel="stylesheet" href="/resources/css/admin/L_css.css">
</head>
<body>
         <%@ include file="/WEB-INF/views/common/header_be.jsp" %>

     <%@include file="/WEB-INF/views/common/sidebar_com.jsp" %>
     
<div style="height: 600px;">
<div class="board_wrap">
    <div class="board_title">
        <Strong>QNA</Strong>
    </div>
<div class="board_view_wrap">
          <div class="board_view">
              <div class="title">
                  ${QNA_a_Vo.title}

              </div>
              <div class="info">
              <h1>@{QNAVo}</h1>
                  <dl>
                      <dt>번호</dt>
                      <dd>${QNA_a_Vo.no}</dd>
                  </dl>
                  <dl>
                      <dt>글쓴이</dt>
                      <dd>${QNA_a_Vo.writer}</dd>
                  </dl>
                  <dl>
                      <dt>작성일</dt>
                      <dd>${QNA_a_Vo.enrollDate}</dd>
                  </dl>
                  <dl>
                      <dt>조회수</dt>
                      <dd>${QNA_a_Vo.hit}</dd>
                  </dl>

              </div>
              <div class="cont">
                 ${QNA_a_Vo.content_q}
              </div>
              
          </div>
          <div class="bt_wrap">
              <a href="/communication/QNA_list_c_a?page=1" class="on">목록</a>
          </div>
      </div>
    </div>
  </div>

  <div id="form-commentInfo">
      <div id="comment-count" style="font-size: 20px;">댓글 <span id="count">0</span></div>
      <input id="comment-input" placeholder="댓글을 입력해 주세요." style="width: 800px; height: 30px;">
      <button id="submit" style="width: 50px; height: 35px;">등록</button>
  </div>
  <div id=comments style="font-size: 15px;">
  </div>
  <script src="/resources/js/comment.js"></script>




  


<%@include file="/WEB-INF/views/common/footer.jsp" %>




</body>
</html>
<% QNA_a_Vo QNA_a_Vo = (QNA_a_Vo)request.getSession().getAttribute("QNA_a_Vo"); %>