<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품관리</title>
    <link rel="stylesheet" href="/resources/css/admin/P_css.css">
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
    <link rel="stylesheet" href="/resources/css/admin/admin_product_list.css">
    <script defer src="/resources/js/admin_product_list.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
		<div style="height:610px;">
    <div class="board_wrap">
      <div class="board_title">
          <Strong>상품목록</Strong>
          <p>고객에게 판매할 상품들의 목록입니다.</p>
      </div>
      <div class="board_list_wrap">
          <div class="board_list">
              <div class="top">
                  <div class="checkB"><input type="checkbox" id="check-all"></div>
                  <div class="num"> 번호 </div>
                  <div class="category"> 카테고리 </div>
                  <div class="pname">상품명</div>
                  <div class="price">상품가격</div>
                  <div class="ex">상품상세</div>
              </div>
              
              <c:forEach items="${productList}" var="pvo">
	              <div class="listbody">
	                  <div class="checkB"><input type="checkbox" class="check-item"></div>
	                  <div class="num">
	                      ${pvo.no}
	                  </div>
	                  <div class="category">${pvo.category}</div>
	                  <div class="pname">${pvo.name}</div>
	                  <div class="price">${pvo.price}</div>
	                  <div class="ex">${pvo.ex}</div>
	              </div>
              </c:forEach>
              
          </div>


         <div class="board_page">
              <c:if test="${pageVo.currentPage > 1}">
	              <a href="//admin/productList?page=${pageVo.currentPage - 1}" class="bt prev"><</a>
              </c:if>
              
				<c:forEach var ="i" begin="${pageVo.startPage}" end="${pageVo.endPage}">
					<c:if test="${pageVo.currentPage == i}">
						<span class="selecNum">${i}</span>
					</c:if>
					<c:if test="${pageVo.currentPage != i}">
		              	<a href="/admin/productList?page=${i}" class="num">${i}</a>
					</c:if>
				</c:forEach>

              <c:if test="${pageVo.currentPage < pageVo.maxPage}">
	              <a href="/admin/productList?page=${pageVo.currentPage + 1}" class="bt next">></a>
              </c:if>
             
          </div>


          <div class="bt_wrap">
              <a href="/admin/product" class="on">등록</a>
              <button type="button" onclick="button_delete();" class="delete">삭제</button>
          </div>
      </div>
  </div> 
  </div>
		
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>
<script>
    const listbodies = document.querySelectorAll(".listbody");
    listbodies.forEach(function(listbody) {
        listbody.addEventListener("click", function(event){
            const no = event.target.parentNode.children[0].innerText
            location.href="http://127.0.0.1:8888/admin/productInfo";
            
        });
    });
    </script>