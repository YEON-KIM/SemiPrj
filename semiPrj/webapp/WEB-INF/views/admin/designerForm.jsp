<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>디자이너 계정 양식</title>
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
    <script defer src="/resources/js/designerForm.js?ver=1"></script>
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
		<div id="menu_title"><디자이너 계정 생성></div>
    <div id="menu_title2">새로운 디자이너의 정보를 입력해주세요.</div>
  </div>
  
  
  <form action="/admin/designerList" onsubmit="return checkValid();" method="post" enctype="multipart/form-data">
    <table class="content">
      <tr>
        <td class="text">* 아이디</td>
        <td>
          <input class="box" type="text" name="deId" required placeholder="4~12자리 소문자로 시작(숫자포함)">
        	<button type="button" onclick="dbCheckId();">중복확인</button>
        </td>
      </tr>
      <tr>
        <td class="text">* 비밀번호</td>
        <td ><input class="box" type="password" name="dePwd" required placeholder="비밀번호를 입력하십시오."></td>
      </tr>
      <tr>
        <td class="text">* 비밀번호 확인</td>
        <td>
          <input class="box" type="password" name="dePwd2" required placeholder="비밀번호를 입력하십시오.">
          <span id="same"></span>
        </td>
      </tr>
      <tr>
        <td class="text">* 이름 </td>
        <td ><input class="box" type="text" name="deName" required placeholder="한글 2~4글자">
          <span class="sameName"></span>
        </td>
        
      </tr>
      <tr>
        <td class="text">* 근무 매장 </td>
        <td class="sel">
	       	<select name="shop">
	        	<option value="1">역삼점</option>
	        	<option value="2">신사점</option>
	        	<option value="3">논현점</option>
	        	<option value="4">압구정점</option>
	        </select>
        
        </td>
      </tr>
      <tr>
        <td class="text">* 전화번호</td>
        <td ><input class="box" type="text" name="deTel" required placeholder="010-xxxx-xxxx"></td>
      </tr>
      <tr>
        <td class="text">* 이메일</td>
        <td ><input class="box" type="email" name="deEmail" required placeholder="abc@abc.com"></td>
      </tr>
      <tr>
      <tr>
        <td class="text">* 디자이너 닉네임 </td>
        <td ><input class="box" type="text" name="deNick" required>
        </td>
       </tr> 
      <tr>
        <td class="text">* 디자이너 사진 </td>
        <td ><input type="file" name="f" multiple="multiple" required>
        </td>
       </tr> 
        <td colspan="2">
          <input class="create" class="box" type="submit" value="계정 생성" >
          <button class="cancel" type="button" ><a href="javascript:window.history.back();">취소</a></button>
        </td>
      </tr>
      
  
    </table>
  </form>
<br><br><br><br><br>
		
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>