<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:if test="${loginfailMsg !=null}">
		<script>
			alert('${loginfailMsg}');
		</script>
	</c:if>
	<c:remove var="loginfailMsg" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COTYLEDON ROOM</title>
    <link rel="stylesheet" href="/resources/css/common/main.css">
    <link rel="stylesheet" href="/resources/css/member/login4.css">
	
</head>
<body>
   <%@include file="/WEB-INF/views/common/header_be.jsp" %>
	
    <div style="padding-top: 5%;">
      <h2>관리자 로그인</h2>
  </div>
  <div class="red_bar"></div>
  
  <div style="padding-top: auto;  margin: auto;" >
  
 
 	<a href="/member/login"><button style="width: 163px" class="m_btn">회원</button></a>
	<a href="/designer/login"><button style="width: 163px" class="m_btn">디자이너</button></a>
	<a href="/admin/login"><button style="width: 163px" class="m_btn">관리자</button></a>
  
  
  </div>
  
  <form action="/admin/main" method="post">
    <table class="content">
      <tr>
        <td class="text">아이디</td>
        <td><input class="box" type="text" name="adminId"></td>
      </tr>
      <tr>
        <td class="text">비밀번호</td>
        <td ><input class="box" type="password" name="adminPwd"></td>
      </tr>
      <tr>
        <td colspan="2"><input class="login" input class="box" type="submit" value="로 그 인"></td>
      </tr>
      <tr>
        <td colspan="2">
        
      </tr>
  
    </table>
  </form>
	
    <%@include file="/WEB-INF/views/common/footer.jsp" %>
	
	
</body>
</html>