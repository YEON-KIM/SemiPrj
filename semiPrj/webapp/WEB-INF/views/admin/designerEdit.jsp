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
  <title>디자이너 정보 수정</title>
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
		<div id="menu_title"><디자이너 정보 수정></div>
    <div id="menu_title2">디자이너의 정보를 수정할 수 있습니다.</div>
  </div>

  <div class="red_bar"></div>
  
  <form action="/admin/designerInfo" method="post">
    <table class="content">
      <tr>
        <!-- <td class="text" readonly>* 번호</td> -->
        <td>
	        <input type="hidden" name="num" value="${designerVo.no}">
	        <%-- <div class="kan"> ${designerVo.no}</div> --%>
        </td>
      </tr>
      <tr>
        <td class="text" readonly>* 근무매장</td>
        <td>
	        <input type="hidden" name="shop" value="${designerVo.shop}">
	        <div class="kan" name="shop"> ${designerVo.shopName}</div>
        </td>
      </tr>
      <tr>
        <td class="text" readonly>* 닉네임</td>
        <td>
	        <input type="hidden" name="desNick" value="${designerVo.nick}">
        	<div class="kan" name="desNick"> ${designerVo.nick} </div>
        </td>
      </tr>
      <tr>
        <td class="text" readonly>* 이름</td>
        <td>
	        <input type="hidden" name="desName" value="${designerVo.name}">
	        <div class="kan" name="desName"> ${designerVo.name} </div>
        </td>
      </tr>
      <tr>
        <td class="text">* 디자이너 ID </td>
        <td >
	        <input type="hidden" name="desId" value="${designerVo.id}">
	        <div class="kan" name="desId"> ${designerVo.id} </div>
        </td>
      </tr>
      <tr>
        <td class="text">* 전화번호 </td>
        <td >
          <input class="box" type="tel" name="tel" value="${designerVo.phone}" required>
        </td>
      </tr>
      <tr>
        <td class="text">* 이메일 </td>
        <td >
          <input class="box" type="text" name="email" value="${designerVo.email}" required >
        </td>
      </tr>
      
      <tr>
        <td class="text">* 소개내용</td>
        <td >
	        <textarea name="detail" id="" cols="100" rows="20" required placeholder="디자이너 소개내용을 작성해주세요.">${designerVo.ex}</textarea>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <input class="check" type="submit" value="확인">
          <button class="cancel" type="button"  onclick="history.back(-1);"><a href="javascript:window.history.back();">취소</a></button>
        <td>
        </td>
      </tr>
      
  
    </table>
  </form>

		
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>