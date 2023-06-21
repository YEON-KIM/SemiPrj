<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
          <tr><td><div class="menu">TREATMENT</div></td></tr>
          <tr>
            <td><a href="/market/productdetail5"><img class="product_img" src="/resources/image/product/MOLLISMARE1/0.png" alt=""></a></td>
            <td><a href="/market/productdetail6"><img class="product_img" src="/resources/image/product/MOLLISMARE2/0.png" alt=""></a></td>
          </tr>
          <tr class="product_name">
            <td><a>몰리스마레 150ml</a></td>
            <td><a>몰리스마레 450ml</a></td>
          </tr>
          <tr><td><div class="menu">STYLING</div></td></tr>
          <tr>
            <td><a href="/market/productdetail7"><img class="product_img" src="/resources/image/product/NEBULA/0.png" alt=""></a></td>
            <td><a href="/market/productdetail8"><img class="product_img" src="/resources/image/product/RESONARE/0.png" alt=""></a></td>
            <td><a href="/market/productdetail9"><img class="product_img" src="/resources/image/product/SS/0.png" alt=""></a></td>
            <td><a href="/market/productdetail10"><img class="product_img" src="/resources/image/product/TT/0.png" alt=""></a></td>
          </tr>
          <tr class="product_name">
            <td><a>네불라 115g</a></td>
            <td><a>레조나레 200ml</a></td>
            <td><a>세도 심플렉스 45g</a></td>
            <td><a>테네레 템푸스 45g</a></td>
          </tr>
          <tr><td><div class="menu">ESSENCE</div></td></tr>
          <tr>
            <td><a href="/market/productdetail11"><img class="product_img" src="/resources/image/product/CALIGO/0.png" alt=""></a></td>
            <td><a href="/market/productdetail12"><img class="product_img" src="/resources/image/product/REMISSIO/0.png" alt=""></a></td>
            <td><a href="/market/productdetail13"><img class="product_img" src="/resources/image/product/MITIS/0.png" alt=""></a></td>
          </tr>
          <tr class="product_name">
            <td><a>칼리고 150ml</a></td>
            <td><a>레미시오 100ml</a></td>
            <td><a>미티스 100ml</a></td>
          </tr>
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