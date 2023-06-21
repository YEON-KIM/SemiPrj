<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
        <div class="abc">
            <div class="Title"><a  href = "/designer/rv_chart">COTYLEDON ROOM</a></div>
            <div class="abc-right">
            	<c:if test="${deLoginVo != null}">
	            	<div class="abc-menu">${deLoginVo.nick}님 환영합니다!&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>        	
            	</c:if>
              <div class="abc-menu"><a href = "/designer/rv_chart">MYPAGE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div> 
              <div class="abc-menu"><a href = "/designer/logout">LOGOUT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div> 
            </div>
        </div>
    </header>
    <img id="sidearea" class="menu-icon" src="/resources/image/134216_menu_lines_hamburger_icon.png" alt="이미지">
    <br>
<div id="sidebar">
  <div class="admin">디자이너</div>
  <ul>
    <li><a href="/designer/rv_chart">예약 목록</a></li>
    <li><a href="/designer/calendar">월별 근무표</a></li>
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