<%@page import="coty.member.vo.MemberVo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <c:if test ="${alertEditMsg != null}">
			
		<script type="text/javascript">
		
		alert("${alertEditMsg}")
		
		
		</script>
		</c:if>
		
		<c:remove var = "alertEditMsg" scope="session"/>
    
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COTYLEDON ROOM</title>
    <link rel="stylesheet" href="/resources/css/common/main.css">
    <link rel="stylesheet" href="/resources/css/member/S_membereditpage.css">
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
</head>
<body>
    <%@include file="/WEB-INF/views/common/header_be.jsp" %>
    <%@include file="/WEB-INF/views/common/sidebar_my.jsp" %>

<div>
<h2>회원 정보</h2>
</div>
<div class="red_bar"></div>
<section>
<form action="" method="post">
<table  cellspacing="0" class="edit_table">
  <tr>
    <td>이름</td>
    <td><input type="text" name="membername" value="${loginMember.name}" readonly="readonly"></td>
  </tr>
  <tr>
    <td>아이디</td>
    <td><input type="text" name="memberId" value="${loginMember.id}" readonly="readonly"></td>
  </tr>
  <tr>
  <!-- ${loginMember.pwd} -->
    <td>비밀번호</td>
    <td><input type="text" name="memberPwd" value="${loginMember.pwd}"></td>
  </tr>
  <tr>
  <td>전화번호</td>
    <td><input type="text" name="memberPhone" value="${loginMember.phone}"></td>
  </tr>
  <tr>
    <td>이메일</td>
    <td><input type="text" name="memberEmail" value="${loginMember.email}"></td>
  </tr>
  <tr>
    <td>주민번호</td>
    <td><input type="text" name="memberidnum" value="${loginMember.ssno}" readonly></td>
  </tr>
  <tr>
    <td>성별</td>
    <td> 
    <input type="text" name="gender" value="${loginMember.gender_fm}" readonly="readonly">
   
  </tr>
  <tr>
    <td>닉네임</td>
    <td><input type="text" name="memberNick" value="${loginMember.nick}"></td>
  </tr>
  <tr>
  	<td>주소</td>
    <td><input type="text" name="address" value="${loginMember.address}" style="height: 100px"></td>
    <!-- <td>
      배송지 정보
    </td>
    <td style="text-align: center;">
      <select id="productCnt" type="number" class="selectarr" style="width: 80%;">
        <option value="1">우리집</option>
        <option value="2">본가</option>
        <option value="3">직장</option>
        <option value="4">학원</option>
        <option value="5">자취방</option>
    </select><tr>
    </td> -->
  </tr>

  <tr>
    <td colspan="2" style="text-align: center;"><input class="btn01" type="submit" value="회원정보 수정"></td> 
  </tr>
</table>
</form>


</section>

    <%@include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>