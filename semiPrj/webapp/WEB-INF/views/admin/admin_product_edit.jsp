<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품 상세 정보</title>
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
  <link rel="stylesheet" href="/resources/css/admin/a_main.css">
  <link rel="stylesheet" href="/resources/css/admin/admin_product.css">
  <link rel="stylesheet" href="/resources/css/admin/admin_product_edit.css">
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
		<div id="menu_title"><상품 수정></div>
    <div id="menu_title2">수정할 상품의 정보를 내용을 적어주세요.</div>
  </div>

  <div class="red_bar"></div>

  <form action="" method="post">
    <table class="content">
      <tr>
        <td class="text" readonly>* 상품코드</td>
        <td><input class="box" type="text" name="productCode" value=""></td>
      </tr>
      <tr>
        <td class="text">* 상품명</td>
        <td ><input class="box" type="text" name="productName" value=""></td>
      </tr>
      <tr>
        <td class="text">* 상품 금액</td>
        <td ><input class="box" type="text" name="productPrice" value=""></td>
      </tr>
      <tr>
        <td class="text">* 카테고리 </td>
        <td >
          <select name="categoly" id="categoly" required>
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
        <td ><textarea name="basicText" id="" cols="100" rows="2"></textarea></td>
      </tr>
      <tr>
        <td class="text">* 상세내용</td>
        <td ><textarea name="detailText" id="" cols="100" rows="20"></textarea></td>
      </tr>
      <tr>
        <td class="text">* 상품 이미지</td>
        <td>
          <input class="box" type="text" name="fileSrc">
          <input type="file" name="" id="" required multiple>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <input class="edit" input type="submit" value="수정">
          <button class="cancel" type="button" ><a href="http://127.0.0.1:8888/admin/productList">취소</a></button>
        <td>
        </td>
      </tr>
      
  
    </table>
  </form>
		
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>