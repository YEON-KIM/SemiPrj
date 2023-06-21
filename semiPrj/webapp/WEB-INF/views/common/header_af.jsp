<%@page import="coty.member.vo.MemberVo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
        <div class="abc">
		
            <div class="Title"><a  href = "/">COTYLEDON ROOM</a></div>
            <div class="abc-right">	
            <div class="abc-menu"><a href = "/member/cart">CART&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div>
            <div class="abc-menu"><a href = "/member/memberedit">MYPAGE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div> 
            <div class="abc-menu"><a href = "/">LOGOUT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div> 
		
            </div>
        </div>


        <div class="Menu-1">
          <div class="Menu"><a href="./shop_list_main.jsp">ABOUT</a></div>
          <div class="Menu"><a href="./ProductList.jsp">MARKET</a></div>
          <div class="Menu"><a href="./Membership.jsp">MEMBERSHIP</a></div>
          <div class="Menu"><a href="/reservation/rvSellect01">RESERVATION</a></div>
          <div class="Menu"><a href="./Notice_list_c.jsp">COMMUNICATION</a></div>
          </div>

    </header>
</body>
</html>