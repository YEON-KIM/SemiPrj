<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="/resources/css/member/cart.css">
    <link rel="stylesheet" href="/resources/css/common/css.css">
</head>
<body>
<div>
  <%@include file="/WEB-INF/views/common/header_be.jsp" %>
    <%@include file="/WEB-INF/views/common/sidebar_my.jsp" %>

<br>
<br>
<main>
<div class="order_title">
<strong>My 쇼핑</strong>
</div>

<div class="bar"></div>

<div class="board_wrap">
    <div class="board_title">
        <Strong>장바구니</Strong>
    </div>
    <div class="board_list_wrap">
        <table class="board_list">
            <thead>
            	<tr>
	                <td class="writer">상품번호</td>
	                <td class="num">상품</td>
	                <td class="product">사진</td>
	                <td class="writer">가격</td>
	                <td class="writer">수량</td>
	                <td class="writer">삭제</td>
            	</tr>
            </thead>
            <tbody>
    	      <c:forEach items="${cartList}" var="cvo">
            	<tr> 
	                <td class="num">${cvo.pNo}</td>
	                <td class="num">${cvo.name }</td>
	                <td class="num"><img class="cart_img" src="/resources/image/product/${cvo.src}/0.png" alt=""></td>
	                <td class="num">${cvo.price }</td>
	                <td class="num">${cvo.amount }</td>
	                <td class="num"><button onclick="deleteCart();">삭제하기</button></td>
					<form method="post" action="/member/cartdelete" id="delete">
						<input id="delete" name="delete" type="hidden" value="${cvo.no}">
					</form>
            	</tr>
					 </c:forEach>
            </tbody>
        </table>


        <div class="page-area">
            <c:if test="${ pageVo.currentPage > 1 }">
                    <a href="/member/cart?page=${pageVo.currentPage-1}">이전</a>
                </c:if>

                <c:forEach var="i" begin="${pageVo.startPage}" end="${pageVo.endPage}">
                    <c:if test="${pageVo.currentPage == i}">
                        <span>${i}</span>
                    </c:if>
                    <c:if test="${pageVo.currentPage != i}">
                        <a href="/member/cart?page=${i}">${i}</a>
                    </c:if>
 				</c:forEach>

                <c:if test="${ pageVo.currentPage < pageVo.maxPage }">
                    <a href="/member/cart?page=${pageVo.currentPage+1}">다음</a>
                </c:if>
        </div>


        <div class="bt_wrap">
            <a href="/market/productlist" class="on">돌아가기</a>
            <!-- <a href="#">수정</a> -->
        </div>
        <form method="post" action="/kakaoPay">
    		<div><button>카카오페이로 결제하기</button></div>
		</form>
    </div>
</div>
<%@include file="/WEB-INF/views/common/footer.jsp" %>
</main>
</div>
</body>
</html>


<script>
	function deleteCart(){
		  document.getElementById('delete').submit();
	}
</script>
