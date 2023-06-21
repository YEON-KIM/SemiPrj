<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img id="sidearea" class="menu-icon" src="/resources/image/134216_menu_lines_hamburger_icon.png" alt="이미지">
	    <br>
	<div id="sidebar">
    <div class="admin">My 쇼핑</div>
    <ul>
      <li><a href="/member/cart">장바구니</a></li>
      <li><a href="/member/orderlist?page=1">주문목록</a></li>
      <li><a href="/member/address">배송지목록</a></li>
      <br>
      <div class="admin">My 예약</div>
        <li><a href="/reservation/rvChart">예약목록</a></li>
        <br>
        <div class="admin">회원 정보</div>
          <li><a href="/member/memberedit">회원수정</a></li>
          <li><a href="/communication/QNA_list_c?page=1">Q&A</a></li>
          <li><a href="/communication/QNA_list_c_a?page=1">Q&A 답변</a></li>
          <li><a href="/member/memberquit">회원탈퇴</a></li>
  </ul>
</div>
<script>
  const sidebar = document.getElementById('sidebar');
  const sidearea = document.getElementById('sidearea');

  sidearea.addEventListener('mouseover', () => {
    sidebar.classList.add('active');
  });
  sidebar.addEventListener('mouseleave', () => {
    sidebar.classList.remove('active');
  });

</script>
</body>
</html>