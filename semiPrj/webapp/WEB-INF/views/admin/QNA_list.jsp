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
</head>

<body>
	<%@include file="/WEB-INF/views/common/header_am.jsp" %>  

  
  
  <div style="height: 600px;">

     <div class="board_wrap">
        <div class="board_title">
            <Strong>QNA 게시판</Strong>
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
              <a href="/admin/QNA_list?page=${pageVo.currentPage-1}" class="bt prev"><</a>
              </c:if>
              
              
              <c:forEach var="i" begin="${pageVo.startPage}" end="${pageVo.endPage}" step="1">
              	<c:if test="${pageVo.currentPage == i }">
              		<a href="/admin/QNA_list?page=${i}" class="num on">${i}</a>
              	</c:if>
              
       			<c:if test="${pageVo.currentPage != i }">
       				<a href="/admin/QNA_list?page=${i}" class="num">${i}</a>
              	</c:if>
   
              </c:forEach>
              
              <c:if test="${pageVo.currentPage < pageVo.maxPage}">
              <a href="/admin/QNA_list?page=${pageVo.currentPage+1}" class="bt prev">></a>
              </c:if>
              <a href="#" class="bt last">>></a>
          </div>


      </div>
  </div>
  </div>
  </div>
  <br><br><br><br><br><br><br><br><br><br>
 
<%@include file="/WEB-INF/views/common/footer.jsp" %>

   
  </body>
</html>

<script>
const elements = document.querySelectorAll('.gogo');
elements.forEach(element => {
  element.addEventListener('click', () => {
    const no = element.querySelector('.num').innerText;
    location.href = "/admin/QNA_view?no=" + no;
  });
});

</script>