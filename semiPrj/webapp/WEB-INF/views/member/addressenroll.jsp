<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
     <c:if test ="${alertEditMsgad != null}">
		
	<script type="text/javascript">
	
	
	alert("${alertEditMsgad}")
	
	</script>
	</c:if>
	
	<c:remove var = "alertEditMsgad" scope="session"/>
	

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COTYLEDON ROOM</title>
    <link rel="stylesheet" href="/resources/css/common/main.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/member/S_orderList.css">
    <link rel="stylesheet" href="/resources/css/admin/L_css.css">
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
        <Strong>배송지 등록</Strong>
    </div>
    <form action="/member/addressenroll" method="post" enctype="multipart/form-data">
    <div class="board_write_wrap">
        <div class="board_write">
            <div class="title">
                <dl>
                    <dt>배송지명</dt>
                    <dd><input type="text" name="adname" placeholder="배송지명" ></dd>
                </dl>
            </div>
            <div class="title">
                <dl>
                   
                </dl>
            </div>
            <div class="title">
                <dl>
              
                </dl>
                
            </div>
            <div class="title">
                <dl>
                    <dt>주소</dt>
                    <dd><input style="width: 700px; height: 150px;" type="text" name="detail" placeholder="상세주소">           
                </dl>
                
            </div>
           
                      
        </div>
        <div class="bt_wrap">
            <input class="qwerty" type="submit" value="등록" 
            style="border-color: #000;background: #000;color: #fff; display: inline-block;
   				   min-width: 90px;
   				   padding: 10px;
    			   margin-left: 10px;
    			   border: 1px solid #000;
    			   border-radius: 2px;
    			   font-size: 1.4rem;" >
            <a href="/member/address">취소</a>
        </div>
    </div>
    </form>
 </div>
</div>
<br><br><br><br>

   <%@include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>