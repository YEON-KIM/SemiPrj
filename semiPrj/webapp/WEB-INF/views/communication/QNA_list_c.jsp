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
<div style="height: 600px;">
<div class="aaaa">
    <div class="board_wrap">
      <div class="board_title">
          <Strong>QNA 게시판</Strong>
      </div>
      <div class="board_list_wrap">
          <div class="board_list">
              <div class="top">
                  <div class="num">번호</div>
                  <div class="title"> 제목</div>
                  <div class="writer">글쓴이</div>
                  <div class="date">작성일</div>
                  <div class="count">답변</div>
              </div>
               <c:forEach items="${QNAList}" var="QNA">
              <div class="gogo">
                  <div class="num">${QNA.no}</div>
                  <div class="title">${QNA.title}</div>
                  <div class="writer">${QNA.writer}</div>
                  <div class="date">${QNA.enrollDate}</div>
                  <div class="writer">${QNA.hit}</div>
              </div>
			  </c:forEach>
          </div>


			<div class="board_page">
              <a href="#" class="bt first"><<</a>
                     
              <c:if test="${pageVo.currentPage > 1}">
              <a href="/communication/QNA_list_c?page=${pageVo.currentPage-1}" class="bt prev"><</a>
              </c:if>
              
              
              <c:forEach var="i" begin="${pageVo.startPage}" end="${pageVo.endPage}" step="1">
              	<c:if test="${pageVo.currentPage == i }">
              		<a href="/communication/QNA_list_c?page=${i}" class="num on">${i}</a>
              	</c:if>
              
       			<c:if test="${pageVo.currentPage != i }">
       				<a href="/communication/QNA_list_c?page=${i}" class="num">${i}</a>
              	</c:if>
   
              </c:forEach>
              
              <c:if test="${pageVo.currentPage < pageVo.maxPage}">
              <a href="/communication/QNA_list_c?page=${pageVo.currentPage+1}" class="bt prev">></a>
              </c:if>
              <a href="#" class="bt last">>></a>
          </div>


          <div class="bt_wrap">
              <a href="/communication/QNA_write_c" class="on">등록</a>
              <!-- <a href="#">수정</a> -->
          </div>
      </div>
  </div>
  </div>
</div>

<%@include file="/WEB-INF/views/common/footer.jsp" %>




</body>
<script>
const elements = document.querySelectorAll('.gogo');
elements.forEach(element => {
  element.addEventListener('click', () => {
    const no = element.querySelector('.num').innerText;
    location.href = "/communication/QNA_view_c?no=" + no;
  });
});

</script>
</html>