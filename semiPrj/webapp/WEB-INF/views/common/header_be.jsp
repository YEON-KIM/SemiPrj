<%@page import="coty.member.vo.MemberVo"%>
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
            <div class="Title"><a  href = "/">COTYLEDON ROOM</a></div>
            <div class="abc-right">
            <%
		MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
		if(loginMember != null) { %>
			
		 <div class="abc-menu"><%=loginMember.getNick() %> 님 환영합니다 &nbsp; &nbsp;</div><% } %>
			
            <div class="abc-menu"><a href = "/member/cart">CART&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div>
            	<c:if test="${loginMember == null}">
            <div class="abc-menu"><a href = "/member/login">LOGIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div> 
            <div class="abc-menu"><a href = "/member/agree">SIGNUP&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div>  
			</c:if>
			<c:if test="${loginMember != null}">
            <div class="abc-menu"><a href = "/member/memberedit">MYPAGE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div>
			 <div class="abc-menu"><a href = "/member/logout">LOGOUT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></div>     
			</c:if> 
			
            </div>
        </div>


        <div class="Menu-1">
          <div class="Menu"><a href="/about/shopListMain">ABOUT</a></div>
          <div class="Menu"><a href="/market/productlist">MARKET</a></div>
          <div class="Menu"><a href="/member/membership">MEMBERSHIP</a></div>
          <div class="Menu"><a href="/reservation/rvSellect01">RESERVATION</a></div>
          <div class="Menu"><a href="/communication/Notice_list?page=1">COMMUNICATION</a></div>
          </div>

    </header>
</body>
</html>