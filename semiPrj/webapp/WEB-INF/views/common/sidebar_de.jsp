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
  <div class="admin">디자이너</div>
  <ul>
    <li><a href="./d_rv_chart.jsp">예약 목록</a></li>
    <li><a href="./d_calendar.jsp">월별 근무표</a></li>
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