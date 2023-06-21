<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>디자이너 목록</title>
    <link rel="stylesheet" href="/resources/css/admin/D_css.css">
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
	 
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
    <div class="board_wrap">
      <div class="board_title">
          <Strong>디자이너 목록</Strong>
          <p>디자이너 계정 목록입니다.</p>
      </div>
      <div class="board_list_wrap">
          <div class="board_list">
              <div class="top">
                  <div class="num">번호</div>
                  <div class="title">닉네임</div>
                  <div class="writer">계정명</div>
                  <div class="shop">근무 매장</div>
                  <div class="tel">전화번호</div>
              </div>

				<c:forEach items="${designerList}" var="devo">
		              <div class="listbody">
		                  <div class="num">${devo.no}</div>
		                  <div class="title">${devo.nick}</a></div>
		                  <div class="writer">${devo.id}</div>
		                  <div class="shop">${devo.shop}</div>
		                  <div class="tel">${devo.phone}</div>
		              </div>
				</c:forEach>
		             
		      </div>
				


          <div class="board_page">
              <c:if test="${pageVo.currentPage > 1}">
	              <a href="/admin/designerList?page=${pageVo.currentPage - 1}" class="bt prev"><</a>
              </c:if>
              
				<c:forEach var ="i" begin="${pageVo.startPage}" end="${pageVo.endPage}">
					<c:if test="${pageVo.currentPage == i}">
						<span class="selecNum">${i}</span>
					</c:if>
					<c:if test="${pageVo.currentPage != i}">
		              	<a href="/admin/designerList?page=${i}" class="num">${i}</a>
					</c:if>
				</c:forEach>

              <c:if test="${pageVo.currentPage < pageVo.maxPage}">
	              <a href="/admin/designerList?page=${pageVo.currentPage + 1}" class="bt next">></a>
              </c:if>
             
          </div>


          <div class="bt_wrap">
              <a href="/admin/designerForm" class="on">계정등록</a>
          </div>
      </div>
  </div> 


  <br><br><br><br><br>
		
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>

 
		
</html>
<c:if test="${alertMsg != null}">
    	<script>
    		alert('${alertMsg}');
    	</script>
    	
    </c:if>
    <c:remove var="alertMsg"/>


    <script>
    const listbodies = document.querySelectorAll(".listbody");
    listbodies.forEach(function(listbody) {
        listbody.addEventListener("click", function(event){
            const no = event.target.parentNode.children[0].innerText
            location.href="/admin/designerInfo?no=" + no;
            
        });
    });
    </script>