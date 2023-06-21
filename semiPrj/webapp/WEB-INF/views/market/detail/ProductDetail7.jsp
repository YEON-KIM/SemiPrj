<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>네불라</title>
    <link rel="stylesheet" href="/resources/css/market/product.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/common/main.css">
</head>
<body>
	<%@include file="/WEB-INF/views/common/header_be.jsp" %>      
	<%@include file="/WEB-INF/views/common/sidebar_mk.jsp" %>

	<c:forEach items="${ productList7 }" var="p7">

    <div>
      <h1>MARKET</h1>
	</div>
  	<div class="bar"></div>
    
    <div class="inner">
       <tr>
          <td>
   		    <div class="detail" style="display: inline-block;">
           		<div >
                    <a href="/market/productlist" class="btnback"><span>BACK TO SHOP</span></a><br><br>
                    <h1 class="title">${p7.name } - ${p7.ex }</h1><br>  
                    <p class="price">${p7.price }원</p><br>
                    <div class="txtbox">
                        <p><b>${p7.ex }</b></p><p><br></p>
                        <p>(1) 펌 모발을 탄력 있고 탄탄하게 유지</p><br>
                        <p>(2) 열 손상으로부터 모발 보호</p><br>
                        <p>(3) 손상된 모발에 수분과 영양 공급</p><br>
                        <p>(4) 모발에 볼륨감 부여</p><br>
                    </div>
                      <div class="bottombtns">
                        <div class="btnbox">
                            <select id="productCnt" type="number" class="selectarr">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                            </select>
                            <tr>
								<td><button class="btnbuy" onclick="insertCart();">장바구니</button></td>
                                <td><button class="btnbuy" onclick="gotoBuy()">바로 구매</button></td>
                            </tr>
                        </div></div><br><br><br></div></div></td>
                        <td>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="/resources/image/product/${p7.src }/1.png" alt="">
                        </td>
                    </tr>
                    </div>
        <div class="detail_img">
            <div class="prodviewEdit"><img src="/resources/image/product/${p7.src }/2.png" alt=""></div>
            <div class="prodviewEdit"><img src="/resources/image/product/${p7.src }/3.png" alt=""></div>
        </div>
<%@include file="/WEB-INF/views/common/footer.jsp" %>
<form method="post" action="/member/cartadd" id="frm">
	<input id="pCnt" name="pCnt" type="hidden" value="">
	<input id="pNo" name="pNo" type="hidden" value="${p7.no}">
</form>
</c:forEach>
  </body>
</html>
<script>
  
  function insertCart(){
	  document.getElementById("pCnt").value = document.getElementById("productCnt").value
	  
	  document.getElementById('frm').submit();
  }
  
  </script>