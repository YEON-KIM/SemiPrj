<%@page import="coty.admin.adminVo.DesignerVo"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>디자이너 정보</title>
    <link rel="stylesheet" href="/resources/css/admin/A_css.css">
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
    <link rel="stylesheet" href="/resources/css/admin/desingerInfo.css">
    <script defer src="/resources/js/designerInfo.js"></script>
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
		<div class="board_wrap" >
    <div class="board_title">
        <Strong>디자이너 상세정보</Strong>
        <p>디자이너의 상세 정보입니다.</p>
    </div>
    <div class="board_view_wrap">
        <div class="board_view">
            <div class="title">
              ${designerVo.nick}
            </div>
            <div class="info">
                <dl>
                    <dt>근무 매장 : </dt>
                    <dd>${designerVo.shopName}</dd>
                </dl>
                <dl>
                    <dt>디자이너 ID : </dt>
                    <dd>${designerVo.id}</dd>
                </dl>
                <dl>
                    <dt>디자이너 PWD : </dt>
                    <dd>${designerVo.pwd}</dd>
                </dl>
                <dl>
                    <dt>탈퇴 여부</dt>
                    <dd>N</dd>
                </dl>
                
            </div>
            <div class="info">
              <dl>
                  <dt>이름 : </dt>
                  <dd>${designerVo.name}</dd>
              </dl>
              <dl>
                  <dt>전화번호 : </dt>
                  <dd>${designerVo.phone}</dd>
              </dl>
              <dl>
                  <dt>디자이너 Email : </dt>
                  <dd>${designerVo.email}</dd>
              </dl>
              <dl>
                  <dt>디자이너 DB번호</dt>
                  <dd>${designerVo.no}</dd>
              </dl>

          </div>
            
            <div class="cont">
                <div class="greet_title"><소개내용></div>
                <table>
                  <tr>
                    <td>
                    	<img class="photo"src="/resources/image/${designerVo.changeName}" alt="이미지" >
                    </td>
                    <td class="greet_content">
                      	${designerVo.ex}
                    </td>
                  </tr>
                </table>
            </div>
            
        </div>
        <div class="bt_wrap">
            <a href="/admin/designerList" class="on">목록</a>
            <a href="/admin/designerEdit">수정</a>
            <button class = "drop" type="button" onclick="confirmDeQuit();">탈퇴</button>
        </div>
    </div>
</div>
				
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>


<c:if test="${alertMsg != nill}">
	<script>
		alert('${alertMsg}');
	</script>
</c:if>
<c:remove var="alertMsg"/>
		<% 
			DesignerVo designerVo = (DesignerVo)request.getSession().getAttribute("designerVo");
		%>

<script>
	var designerNo = <%= designerVo.getNo()%>;
	function confirmDeQuit(){
	  if(confirm("해당 디자이너의 계정을 탈퇴하시겠습니까?")){
		window.location.href="http://127.0.0.1:8888/admin/designerQuit?no=" + designerNo;
		};
	}

</script>