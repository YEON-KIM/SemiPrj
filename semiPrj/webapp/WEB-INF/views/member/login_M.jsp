<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
      <h2>회원 로그인</h2>
  </div>
  <div class="red_bar"></div>
  
  <div style="padding-top: auto;  margin: auto;" >
  
 
	<a href="/member/login"><button style="width: 163px" class="m_btn">회원</button></a>
	<a href="/designer/login"><button style="width: 163px" class="m_btn">디자이너</button></a>
	<a href="/admin/login"><button style="width: 163px" class="m_btn">관리자</button></a>
  
  
  </div>
  
  <form action="" method="post">
    <table class="content">
      <tr>
        <td class="text">아이디</td>
        <td><input class="box" type="text" name="memberId"></td>
      </tr>
      <tr>
        <td class="text">비밀번호</td>
        <td ><input class="box" type="password" name="memberPwd"></td>
      </tr>
      <tr>
        <td colspan="2"><input class="login" input class="box" type="submit" value="로 그 인"></td>
      </tr>
      <tr>
        <td colspan="2">
          <div class="find">
            <a href="/member/missingid">아이디 찾기</a> | <a href="/member/missingpwd">비밀번호 찾기</a> | <a href="/member/agree">회원가입</a></td>
          </div>
          </td>
      </tr>
  
    </table>
  </form>

    <%@include file="/WEB-INF/views/common/footer.jsp" %>



</body>
</html>