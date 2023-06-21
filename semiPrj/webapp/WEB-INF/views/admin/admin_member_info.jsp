<%@page import="coty.member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>고객 정보 조회</title>
    <link rel="stylesheet" href="/resources/css/admin/A_css.css">
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
    <link rel="stylesheet" href="/resources/css/admin/admin_member_info.css">
    <script src="/resources/js/designerInfo.js"></script>
</head>

<body>
 	<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
    
  <div class="board_wrap">
    <div class="board_title">
        <Strong>고객 상세정보</Strong>
        <p>고객의 상세 정보입니다.</p>
    </div>
    <div class="board_view_wrap">
        <div class="board_view">
            <div class="title">
              <b>고객닉네임</b> : <span class="memberNick">${memberVo.nick}</span>
            </div>
            <div class="info">
                <dl>
                    <dt>고객 ID : </dt>
                    <dd>${memberVo.id}</dd>
                </dl>
                <dl>
                    <dt>고객 생년월일 :</dt>
                    <dd>${memberVo.birth}</dd>
                </dl>
                <dl>
                    <dt>고객 성별 :</dt>
                    <dd>${memberVo.gender_fm}</dd>
                </dl>
                <dl>
                    <dt>탈퇴 여부</dt>
                    <dd>${memberVo.quitYn}</dd>
                </dl>
                
            </div>
            <div class="info">
              <dl>
                  <dt>고객 이름 : </dt>
                  <dd>${memberVo.name}</dd>
              </dl>
              <dl>
                  <dt>고객 연락처 : </dt>
                  <dd>${memberVo.phone}</dd>
              </dl>
              <dl>
                  <dt>고객 Email : </dt>
                  <dd>${memberVo.email}</dd>
              </dl>
              <dl>
                  <dt>가입일자 : </dt>
                  <dd>${memberVo.signUpDay}</dd>
              </dl>

          </div>
            
            <div class="cont">
                <div class="greet_title"><고객 특이사항></div>
                <table>
                  <tr>
                    <td class="greet_content">
                      ${memberVo.com}
                    </td>
                  </tr>
                </table>
            </div>
            
        </div>
        <div class="bt_wrap">
            <a href="/admin/memberList" class="on">목록</a>
            <a href="/admin/memberEdit">수정</a>
            
        </div>
    </div>
</div>
  
 <%@ include file="/WEB-INF/views/common/footer.jsp" %>
   
  </body>
</html>

<%
	MemberVo memberVo = (MemberVo)request.getSession().getAttribute("memberVo");
%>