<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품목록</title>
    <link rel="stylesheet" href="/resources/css/market/productListstyle.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/common/main.css">
</head>
<body>
<%@include file="/WEB-INF/views/common/header_be.jsp" %>
      
<%@include file="/WEB-INF/views/common/sidebar_mk.jsp" %>
    <div>
        <h1>MARKET</h1>
    </div>
    <div class="bar"></div>
    
      <section>
        <table cellspacing ="50">
          <tr><td><div class="menu">SHAMPOO</div></td></tr>
          <tr>
            <td><a href="/market/productdetail1"><img src="/resources/image/product/NUBESALBAR/0.png" alt=""></a></td>
            <td><a href="/market/productdetail2"><img src="/resources/image/product/ROSEAHABITU/0.png" alt=""></a></td>
            <td><a href="/market/productdetail3"><img src="/resources/image/product/VEREPLUVIA/0.png" alt=""></a></td>
            <td><a href="/market/productdetail4"><img src="/resources/image/product/POSTPLUVIA/0.png" alt=""></a></td>
          </tr>
          <tr class="product_name">
            <td><a>누베스 알바 600ml</a></td>
            <td><a>로제아 하비투 600ml</a></td>
            <td><a>베레 플루비아 600ml</a></td>
            <td><a>포스트 플루비아 600ml</a></td>
          </tr>
    </table>
</section>

<%@include file="/WEB-INF/views/common/footer.jsp" %>
  </body>
</html>