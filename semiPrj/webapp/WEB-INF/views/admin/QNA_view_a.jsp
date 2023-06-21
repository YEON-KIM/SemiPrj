<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>디자이너 계정 양식</title>
    <link rel="stylesheet" href="/resources/css/admin/a_admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/a_designerForm.css">
    <link rel="stylesheet" href="/resources/css/admin/L_css.css">
    <link rel="stylesheet" href="/resources/css/a_comment.css">
</head>

<body>
	<%@include file="/WEB-INF/views/common/header_am.jsp" %>  

  
 
  <div style="height: 600px;">
<div class="board_wrap">
    <div class="board_title">
        <Strong>QNA 답변</Strong>
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
                 ${QNA_a_Vo.content_a}
              </div>
              
          </div>
          <div class="bt_wrap">
              <a href="/admin/QNA_list_a?page=1" class="on">목록</a>
          </div>
      </div>
    </div>
</div>

</body>
</html>