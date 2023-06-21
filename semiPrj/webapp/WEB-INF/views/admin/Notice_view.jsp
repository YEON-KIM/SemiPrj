<%@page import="coty.admin.notice.total.Notice_a_Dao"%>
<%@page import="coty.admin.notice.total.Notice_a_Vo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항</title>
    <link rel="stylesheet" href="/resources/css/admin/a_admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/a_designerForm.css">
    <link rel="stylesheet" href="/resources/css/admin/L_css.css">
</head>

<body>
	<%@include file="/WEB-INF/views/common/header_am.jsp" %>  
  
  
  <div style="height: 600px;">
    <div class="board_wrap">
      <div class="board_title">
          <Strong>공지사항</Strong>
      </div>
      <div class="board_view_wrap">
          <div class="board_view">
              <div class="title">
                  ${Notice_a_Vo.title}

              </div>
              <div class="info">
              <h1>@{noticeVo}</h1>
                  <dl>
                      <dt>번호</dt>
                      <dd>${Notice_a_Vo.no}</dd>
                  </dl>
                  <dl>
                      <dt>글쓴이</dt>
                      <dd>${Notice_a_Vo.writer}</dd>
                  </dl>
                  <dl>
                      <dt>작성일</dt>
                      <dd>${Notice_a_Vo.enrollDate}</dd>
                  </dl>
                  <dl>
                      <dt>조회수</dt>
                      <dd>${Notice_a_Vo.hit}</dd>
                  </dl>

              </div>
              <div class="cont">
                 ${Notice_a_Vo.content}
              </div>
              
          </div>
          <div class="bt_wrap">
              <a href="/admin/Notice_list?page=1" class="on">목록</a>
              <a href="/admin/Notice_edit?no=${Notice_a_Vo.no}">수정</a>
              <a href="/admin/Notice_delete?no=${Notice_a_Vo.no}">삭제</a>
          </div>
      </div>
    </div>
  </div>
  <br><br><br><br>

<%@include file="/WEB-INF/views/common/footer.jsp" %>

   
  </body>
</html>

<% Notice_a_Vo Notice_a_Vo = (Notice_a_Vo)request.getSession().getAttribute("Notice_a_Vo"); %>