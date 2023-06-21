<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="/resources/css/common/css.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/member/S_orderList.css">
</head>
<body>
    <%@ include file="/WEB-INF/views/common/header_be.jsp" %>
    <%@ include file="/WEB-INF/views/common/sidebar_my.jsp" %> 
    
    
<br>
<br>
<div class="order_title">
<strong>My 쇼핑</strong>
</div>

<div class="bar"></div>
    
<div class="board_wrap">
    <div class="board_title">
        <Strong>주문목록</Strong>
    </div>
    <div class="board_list_wrap">
        <div class="board_list">
            <div class="top">
   
                <div class="num">주문번호</div>
                <!-- <div class="title"> 상품이름</div> -->
                <div class="writer" >상품이름</div>
                <div class="writer">수량</div>
                <div class="writer">가격</div>
                <div class="date">날짜</div>
                <div class="count">배송상태</div>
                <div class="count">환불여부</div>
               
            	  
            </div>
            
               <c:forEach items = "${OrderList}" var="ovo"> 
            <div class="orderlistdetail">
               	
                <div class="num"><a href="/member/orderhistory">${ovo.no}</a></div>
                <div class="num"><a href="/member/orderhistory">${ovo.name}</a></div>
                <div class="num">${ovo.amount}</div>
                <div class="num">${ovo.total}</div>
                <div class="num">${ovo.ordate}</div>
                <div class="num">${ovo.state}</div>
                <div class="num">${ovo.re_yn}</div>
            </div>
               </c:forEach>
               
            
           
        </div>


     <div class="board_page">
              <a href="#" class="bt first"><<</a>
              
              
              <c:if test="${pagevo.currentPage > 1}">
              <a href="/member/orderlist?page=${pagevo.currentPage-1}" class="bt prev"><</a>
              </c:if>
              
              
              <c:forEach var="i" begin="${pagevo.startPage}" end="${pagevo.endPage}" step="1">
              	<c:if test="${pagevo.currentPage == i }">
              		<a href="/member/orderlist?page=${i}" class="num on">${i}</a>
              	</c:if>
              
       			<c:if test="${pagevo.currentPage != i }">
       				<a href="/member/orderlist?page=${i}" class="num">${i}</a>
              	</c:if>
   
              </c:forEach>
              
              <c:if test="${pagevo.currentPage < pagevo.maxPage}">
              <a href="/member/orderlist?page=${pagevo.currentPage+1}" class="bt prev">></a>
              </c:if>
              <a href="#" class="bt last">>></a>
          </div>


       
    </div>
</div>


   <%@ include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>

		<script>
		const elements = document.querySelectorAll('.orderlistdetail');
		elements.forEach(element => {
		  element.addEventListener('click', () => {
		    const no = element.querySelector('.num').innerText;
		    location.href = "/member/orderList?no=" + no;
		  });
		});
		
		</script>