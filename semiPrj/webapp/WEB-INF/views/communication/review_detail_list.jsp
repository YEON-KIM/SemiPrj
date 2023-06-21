<%@page import="coty.designer.vo.MentVo"%>
<%@page import="java.util.List"%>
<%@page import="coty.communication.vo.ReviewVo"%>
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
    <link rel="stylesheet" href="/resources/css/common/sidebar.css">
    <link rel="stylesheet" href="/resources/css/member/orderList.css">
    <link rel="stylesheet" href="/resources/css/admin/J_css.css">
</head>
<body>
    
    <%@ include file="/WEB-INF/views/common/header_be.jsp" %>
    <%@ include file="/WEB-INF/views/common/sidebar_com.jsp" %>
    
<br>

<%
	ReviewVo reviewVo = (ReviewVo)session.getAttribute("reviewVo");
	MentVo mv = (MentVo)session.getAttribute("MentVo");
%>

<div class="board_wrap">
    <div class="board_title">
        <Strong>리뷰 상세</Strong>
    </div>
    <div class="board_view_wrap">
        <div class="board_view">
            
            <div class="info">
                <dl>
                    <dt>번호</dt>
                    <dd>${reviewVo.no}</dd>
                </dl>
                <dl>
                    <dt>닉네임</dt>
                    <dd>${reviewVo.writer}</dd>
                </dl>
                <dl>
                    <dt>매장</dt>
                    <dd>${reviewVo.shopName}</dd>
                </dl>
                <dl>
                    <dt>디자이너</dt>
                    <dd>${reviewVo.designerName}</dd>
                </dl>
                <dl>
                    <dt>시술</dt>
                    <dd>${reviewVo.styleName}</dd>
                </dl>
                <dl>
                    <dt>작성일</dt>
                    <dd>${reviewVo.enrollDate}</dd>
                </dl>
                

            </div>
            <div class="cont">
                
                <div>
                    ${reviewVo.content}
                </div>
            </div>
			<form action="/designer/ment" method="post">
				<table>
					<tr>
						<td><input class="mentbox" type="text" name="ment" required></td>
						<td><input class="mentbtn" type="submit" value="댓글 등록"></td>
					</tr>
					
				</table>
				<input id="rNo" name="rNo" type="hidden" value="${reviewVo.no}">
			</form>
					
				<div>
					<dl>
						<dd class="ment">
							댓글 ::: ${MentVo.ment }
					</dd>
				</dl>
			</div>
        </div>
        <div class="bt_wrap">
            <a href="/communication/reviewlist?page=1" class="on">목록</a>
            <a href="/communication/reviewedit">수정</a>
            <a href="#">삭제</a>
        </div>
        
    </div>
</div>

<br><br><br><br>





    <%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>