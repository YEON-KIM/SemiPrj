<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품관리</title>
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/admin_product.css">
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
		<div id="menu_title"><상품 등록></div>
    <div id="menu_title2">등록할 새로운 상품의 정보를 입력해주세요.</div>
  </div>

  <form action="/admin/productList" method="post">
    <table class="content">
      <tr>
        <td class="text">* 상품코드</td>
        <td><input class="box" type="text" name="productCode"></td>
      </tr>
      <tr>
        <td class="text">* 상품명</td>
        <td ><input class="box" type="text" name="productName"></td>
      </tr>
      <tr>
        <td class="text">* 상품 금액</td>
        <td ><input class="box" type="text" name="productPrice"></td>
      </tr>
      <tr>
        <td class="text">* 카테고리 </td>
        <td >
          <select name="categoly" id="categoly"vrequired>
            <option value="shampoo">샴푸</option>
            <option value="treatment">트리트먼트</option>
            <option value="styling">스타일링</option>
            <option value="essence">에센스</option>
            <option value="machine">기계</option>
          </select>
        </td>
      </tr>
      <tr>
        <td class="text">* 기본내용</td>
        <td ><textarea name="" id="" cols="100" rows="2"></textarea></td>
      </tr>
      <tr>
        <td class="text">* 상세내용</td>
        <td ><textarea name="" id="" cols="100" rows="20"></textarea></td>
      </tr>
      <tr>
        <td class="text">* 상품 이미지</td>
        <td>
          <input class="box" type="password" name="memberPwd">
          <input type="file" name="" id="" required multiple>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <input class="register" input type="submit" value="등록">
          <button class="cancel" type="button" ><a href="./admin_product_list.html">취소</a></button>
        <td>
        </td>
      </tr>
      
  
    </table>
  </form>
		
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>