<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="/resources/css/admin/admin.css">
  <link rel="stylesheet" href="/resources/css/admin/a_main.css">
  <link rel="stylesheet" href="/resources/css/admin/disignerEdit.css">
  <link rel="stylesheet" href="/resources/css/admin/admin_member_edit.css">
  <title>고객 정보 수정</title>
</head>
<body>
 	<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
 	
 	
    <div id="menu_title"><고객 정보 수정></div>
    <div id="menu_title2">고객의 특이사항을 수정할 수 있습니다.</div>
  </div>

  <div class="red_bar"></div>
  
  <form action="/admin/memberInfo" method="post">
    <table class="content">
      <tr>
      	<input type="hidden" name="num" value="${memberVo.no}">
        <td class="text" readonly>* 닉네임 : </td>
        <td><div class="kan" name="memberNick"> ${memberVo.nick} </div></td>
      </tr>
      <tr>
        <td class="text" readonly>* 이름</td>
        <td><div class="kan" name="memberName"> ${memberVo.name} </div></td>
      </tr>
      <tr>
        <td class="text">* 고객 ID </td>
        <td ><div class="kan" name="memberId"> ${memberVo.id} </div></td>
      </tr>
      
      <tr>
        <td class="text">* 전화번호 </td>
        <td ><div class="kan" name="memberTel"> ${memberVo.phone} </div></td>
      </tr>
      <tr>
        <td class="text">* 이메일 </td>
        <td ><div class="kan" name="memberEmail"> ${memberVo.email} </div></td>
      </tr>
      <tr>
        <td class="text" readonly>* 가입일자</td>
        <td><div class="kan" name="memSignUpDay"> ${memberVo.signUpDay} </div></td>
      </tr>
      
      <tr>
        <td class="text">* 특이사항</td>
        <td ><textarea name="com" id="" cols="100" rows="20" required>${member.com}</textarea></td>
      </tr>
      <tr>
        <td colspan="2">
          <input class="check" input type="submit" value="확인">
          <button class="cancel" type="button"  onclick="history.back(-1);"><a href="javascript:window.history.back();">취소</a></button>
        <td>
        </td>
      </tr>
      
  
    </table>
  </form>

   
    <%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>