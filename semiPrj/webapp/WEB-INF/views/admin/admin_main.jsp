<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:remove var="alertMsg"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 메인</title>
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
</head>

<body>
  <%@ include file="/WEB-INF/views/common/header_am.jsp" %>
  
  <img alt="관리자메인이미지" src="/resources/image/shop3.jpg"  width=1300px; height=600px; style="padding-left : 300px; padding-top:5px; padding-bottom:20px;">
  
 
 <%@ include file="/WEB-INF/views/common/footer.jsp" %>
   
  </body>
</html>
<c:if test="${alertMsg != null}">
	<script>
		alert('%{alertMsg}');
	</script>
</c:if>
<c:remove var="alertMst"/>