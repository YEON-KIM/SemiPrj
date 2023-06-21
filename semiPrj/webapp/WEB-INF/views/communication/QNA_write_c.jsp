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
  <%@ include file="/WEB-INF/views/common/header_be.jsp" %>
  <%@include file="/WEB-INF/views/common/sidebar_com.jsp" %>

<div class="aaaa">

      <div class="board_wrap">
        <div class="board_title">
            <Strong>QNA</Strong>
        </div>
        
        
      <form action="/communication/QNA_write_c" method="post" enctype="multipart/form-data">
      <div class="board_write_wrap">
          <div class="board_write">
              <div class="title">
                  <dl>
                      <dt>제목</dt>
                      <dd><input type="text" name="title" placeholder="제목 입력"></dd>
                  </dl>
              </div>
              <div class="info">
                  <dl>
                      <dt>글쓴이</dt>
                      <dd><input type="text" name="writer" placeholder="글쓴이 입력"></dd>
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
                  <textarea name="content_q" placeholder="내용 입력"></textarea>
              </div>             
          </div>
          <div class="bt_wrap">
            <input class="qwerty" type="submit" value="작성하기" 
            style="border-color: #000;background: #000;color: #fff; display: inline-block;
   				   min-width: 90px;
   				   padding: 10px;
    			   margin-left: 10px;
    			   border: 1px solid #000;
    			   border-radius: 2px;
    			   font-size: 1.4rem;" >
            <a href="/communication/QNA_list_c">취소</a>
          </div>
      </div>
    </form>
   </div>
  </div>
  <br><br><br><br>


<%@include file="/WEB-INF/views/common/footer.jsp" %>




</body>
</html>