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
    <link rel="stylesheet" href="/resources/css/designer/d_rv_chart.css">
    <link rel="stylesheet" href="/resources/css/common/css.css">
</head>
<body>
<%@include file="/WEB-INF/views/common/header_de.jsp" %>


<br>
<br>
<div class="order_title">
<strong>디자이너</strong>
</div>

<div class="bar"></div>

<div class="board_wrap">
    <div class="board_title">
        <Strong>디자이너 예약목록</Strong>
    </div>
    <div class="board_list_wrap">
        <div class="board_list">
            <div class="top">
                <div class="num">예약번호</div>
                <div class="num">매장</div>
                <div class="num">고객</div>
                <div class="num">시술</div>
                <div class="num">예약현황</div>
                <div class="num"></div>
                <div class="num"></div>
            </div>
            <c:forEach items="${ designerRvList }" var="de">
            <div class="product_1"> 
                <div class="num">${de.rNo }</div>
                <div class="num">${de.shopName }</div>
                <div class="num">${de.cNo }</div>
                <div class="num">${de.styleName }</div>
                <div class="num">${de.res }</div>
                <c:if test="${de.res == '예약 완료'}">
                
                	<div class="num"><button onclick="cancle();">예약 취소</button></div>
                	<form method="post" action="/designer/rv_chart" id="frm">
                		<input id="no" name="no" type="hidden" value="${de.no}">
	                	<input id="res" name="res" type="hidden" value="${de.res}">
					</form>
  					<script>
					  function cancle(){
						  document.getElementById('frm').submit();
					  }
					</script>                
                </c:if>
                <c:if test="${de.res == '시술 완료'}">
                <div class="num"><a href="/designer/ment?page=${de.reNo }"><input type="submit" value="댓글남기기" onclick="ment();"></a></div>
                <form method="post" action="/designer/ment" id="frm1">
                		<input id="rNo" name="rNo" type="hidden" value="${de.reNo}">
					</form>
					<script>
					  function cancle(){
						  document.getElementById('frm1').submit();
					  }
					</script>
            	</c:if>
            </div>
            </c:forEach>
           
        </div>


        <div class="board_page">
            <a href="#" class="bt first"><<</a>
            <a href="#" class="bt prev"><</a>
            <a href="#" class="num on">1</a>
            <a href="#" class="num">2</a>
            <a href="#" class="num">3</a>
            <a href="#" class="num">4</a>
            <a href="#" class="num">5</a>
            <a href="#" class="bt next">></a>
            <a href="#" class="bt last">>></a>
        </div>


        
    </div>
</div>

   <%@include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>