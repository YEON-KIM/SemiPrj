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
        <Strong>공지사항</Strong>
    </div>
   <div class="board_list_wrap">
          <div class="board_list">
          	  
              <div class="top">
                  <div class="num">번호</div>
                  <div class="title">제목</div>
                  <div class="writer">글쓴이</div>
                  <div class="date">작성일</div>
                  <div class="writer">조회수</div>
              </div>
			
       
              <c:forEach items="${noticeList}" var="nvo">
              <div class="gogo">
                  <div class="num">${nvo.no}</div>
                  <div class="title">${nvo.title}</div>
                  <div class="writer">${nvo.writer}</div>
                  <div class="date">${nvo.enrollDate}</div>
                  <div class="writer">${nvo.hit}</div>
              </div>
			  </c:forEach>
          </div>


          <div class="board_page">
              <a href="#" class="bt first"><<</a>
              
              
              <c:if test="${pageVo.currentPage > 1}">
              <a href="/communication/Notice_list?page=${pageVo.currentPage-1}" class="bt prev"><</a>
              </c:if>
              
              
              <c:forEach var="i" begin="${pageVo.startPage}" end="${pageVo.endPage}" step="1">
              	<c:if test="${pageVo.currentPage == i }">
              		<a href="/communication/Notice_list?page=${i}" class="num on">${i}</a>
              	</c:if>
              
       			<c:if test="${pageVo.currentPage != i }">
       				<a href="/communication/Notice_list?page=${i}" class="num">${i}</a>
              	</c:if>
   
              </c:forEach>
              
              <c:if test="${pageVo.currentPage < pageVo.maxPage}">
              <a href="/communication/Notice_list?page=${pageVo.currentPage+1}" class="bt prev">></a>
              </c:if>
              <a href="#" class="bt last">>></a>
          </div>


      </div>
  </div>
  </div>
  <br><br><br><br><br>


   <%@ include file="/WEB-INF/views/common/footer.jsp" %>




</body>
<script>
const elements = document.querySelectorAll('.gogo');
elements.forEach(element => {
  element.addEventListener('click', () => {
    const no = element.querySelector('.num').innerText;
    location.href = "/communication/Notice_view?no=" + no;
  });
});

</script>
</html>