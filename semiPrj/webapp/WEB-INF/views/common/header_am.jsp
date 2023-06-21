<%@page import="coty.admin.adminVo.AdminVo"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header style="margin:1.5%">
    <div class="abc">
      <div class="Title"><a  href = "/admin/main">COTYLEDON ROOM</a></div>
   	<c:if test="${adminLogimVo != null}">
       	<div class="abc-menu" style="margin-left:960px;">관리자님 환영합니다!&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       	<a href = "/admin/logout">LOGOUT&nbsp;&nbsp;</a>
       	</div>   	
    </c:if>
    </div>
    <div class="abc-right">
  </header>
  
  <img class="menu-icon" id="sidearea" src="/resources/image/134216_menu_lines_hamburger_icon.png" alt="이미지">
  
  <div id="sidebar" style="margin-top: 20px;">
    <div class="admin">ADMIN</div>
    <div class="line"></div>
    <ul>
      <li><a href="/admin/QNA_list?page=1">QNA</a></li>
      <li><a href="/admin/QNA_list_a?page=1">QNA 답변</a></li>
      <li><a href="/admin/FAQ_list?page=1">FAQ</a></li>
      <li><a href="/admin/Notice_list?page=1">공지사항</a></li>
      <li><a href="/admin/designerList">디자이너 관리</a></li>
      <li><a href="/admin/productList">상품 관리</a></li>
      <li><a href="/admin/memberList">고객 관리</a></li>
      <li><a href="/statistics/member">통계 조회</a></li>
    </ul>
  </div>
  <div id="main_content" style="margin-top: 20px;">
    <div id="admin_main_title">시스템 정보</div>
    <div class="mainline"></div>
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

    const menuItems = document.querySelectorAll('#sidebar li');
  </script>
</body>
</html>
<%
	AdminVo adminLogimVo = (AdminVo)request.getSession().getAttribute("adminLogimVo");
%>