<%@page import="coty.member.vo.MemberVo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
	<c:if test ="${alertMsg != null}">
		
	<script type="text/javascript">
	
	
	alert("${alertMsg}")
	
	</script>
	</c:if>
	
	<c:remove var = "alertMsg" scope="session"/>
    
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COTYLEDON ROOM</title>
    <link rel="stylesheet" href="./resources/css/common/main.css">

</head>
<body>
	
 	<%@include file="/WEB-INF/views/common/header_be.jsp" %>
	
    <br><br>
    <div class="aaa"><img src="/resources/image\main.webp" alt="background-image" width=1300px; height=600px;></div>
   <br><br><br>
	
	
    <%@include file="/WEB-INF/views/common/footer.jsp"%>
    
	 <%
	 request.getSession().getAttribute("loginMember");
	 %>



</body>
</html>