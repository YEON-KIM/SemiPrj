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
          <h2>MARKET</h2>
        
          <ul>
            <li><a href="/market/productlist">ALL</a></li>
            <li><a href="/market/shampoo">SHAMPOO</a></li>
            <li><a href="/market/treatment">TREATMENT</a></li>
            <li><a href="/market/styling">STYLING</a></li>
            <li><a href="/market/essence">ESSENCE</a></li>
            <li><a href="/market/machine">MACHINE</a></li>
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