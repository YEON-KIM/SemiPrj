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
          <tr><td><div class="menu">MACHINE</div></td></tr>
          <tr>
            <td><a href="/market/productdetail14"><img class="product_img" src="/resources/image/product/FLAT/0.png" alt=""></a></td>
            <td><a href="/market/productdetail15"><img class="product_img" src="/resources/image/product/HAIRDRY/0.png" alt=""></a></td>
          </tr>
          <tr class="product_name">
            <td><a>다이슨 고데기</a></td>
            <td><a>다이슨 헤어드라이기</a></td>
          </tr>
    </table>
</section>

<%@include file="/WEB-INF/views/common/footer.jsp" %>
  </body>
</html>
