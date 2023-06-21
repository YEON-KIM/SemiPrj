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
        <div class="admin">게시판 목록</div>
        <ul>
          <li><a href="/communication/Notice_list?page=1">공지사항</a></li>
          <br>
          <li><a href="/communication/FAQ_list?page=1">FAQ</a></li>
          <br>
          <li><a href="/communication/QNA_list_c?page=1">QNA</a></li>
          <br>
          <li><a href="/communication/QNA_list_c_a?page=1">QNA 답변</a></li>
          <br>
          <li><a href="/communication/reviewlist?page=1">리뷰게시판</a></li>
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