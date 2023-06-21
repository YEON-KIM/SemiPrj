<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <c:if test ="${alertdelteaMsg != null}">
	
<script type="text/javascript">


alert("${alertdelteaMsg}")

</script>
</c:if>

<c:remove var = "alertdelteaMsg" scope="session"/> 
    
    
    
	
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

	<%@include file="/WEB-INF/views/common/header_be.jsp" %>
	<%@include file="/WEB-INF/views/common/sidebar_my.jsp" %>
   
   
<br>
<br>
<div class="order_title">
<strong>My 쇼핑</strong>
</div>

<div class="bar"></div>
    
<div class="board_wrap">
    <div class="board_title">
        <Strong>배송지 목록</Strong>
    </div>
    <div class="board_list_wrap">
        <div class="board_list">
            <div class="top">
                <div class="num"></div>
                
            </div>
           
            <div>
               
            <div>
            <form action="/member/address" method="post">
                <table style="width: 1000px; text-align: left;">
                    <tr style="width: auto;">
                   
                    <c:forEach items = "${AddressList}" var="adl"> 
                    <div class="Addresslistdetail">
                    <th>${adl.adname}</th> 
                    </tr>
                    <tr>
                    <td>${adl.detail}</td>
                </tr>
                <tr></tr>
                <tr>
                    <td style="padding-top: 1%;"><button type="button" onclick="delAddr(${adl.no});">배송지 삭제</button></td>
               
                </tr>
                </div>
               </c:forEach>
                </table>
                </form>
               </div>
               </div>
               
            </div>

            <br>
            <hr>
            <br>

        <div class="board_page">
            <a href="#" class="bt first"><<</a>
            
           <c:if test="${pagevo.currentPage > 1}">
              <a href="/member/addresslist?page=${pagevo.currentPage-1}" class="bt prev"><</a>
              </c:if>
              
              
              <c:forEach var="i" begin="${pagevo.startPage}" end="${pagevo.endPage}" step="1">
              	<c:if test="${pagevo.currentPage == i }">
              		<a href="/member/addresslist?page=${i}" class="num on">${i}</a>
              	</c:if>
              
       			<c:if test="${pagevo.currentPage != i }">
       				<a href="/member/addresslist?page=${i}" class="num">${i}</a>
              	</c:if>
   
              </c:forEach>
              
              <c:if test="${pagevo.currentPage < pagevo.maxPage}">
              <a href="/member/addresslist?page=${pagevo.currentPage+1}" class="bt prev">></a>
              </c:if>
              <a href="#" class="bt last">>></a>
          </div>
          
          
        <div class="bt_wrap">
            <a href="/member/addressenroll" class="on">등록</a>
           
        </div>
        
    </div>
</div>


   	<%@include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>

	<script>
		const elements = document.querySelectorAll('.Addresslistdetail');
		elements.forEach(element => {
		  element.addEventListener('click', () => {
		    const no = element.querySelector('.num').innerText;
		    location.href = "/member/addressList?no=" + no;
		  });
		});
		
		function delAddr(no){
			
			location.href = "/member/address/del?no=" + no;
			
		}
		
		</script>
		
		
		