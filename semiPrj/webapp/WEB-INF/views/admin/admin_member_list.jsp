<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>고객 관리</title>
    <link rel="stylesheet" href="/resources/css/admin/MM_css.css">
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
    <link rel="stylesheet" href="/resources/css/admin/admin_member_list.css">
    
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
	
	<div>
    <div class="board_wrap">
      <div class="board_title">
          <Strong>고객 목록</Strong>
          <p>고객의 정보 목록입니다.</p>
      </div>
      <div class="board_list_wrap">
          <div class="board_list">
              <div class="top">
                  <div class="num">번호</div>
                  <div class="meNick">고객닉네임</div>
                  <div class="meId">아이디</div>
                  <div class="gender">성별</div>
                  <div class="signUpDay">가입일자</div>
                  <div class="quitYn">탈퇴여부</div>
              </div>
              
              <c:forEach items="${memberList}" var="mvo">
	              <div class = "listbody">
	                  <div class="num">${mvo.no}</div>
	                  <div class="meNick">${mvo.nick}</a></div>
	                  <div class="meId">${mvo.id}</div>
	                  <div class="gender">${mvo.gender_fm}</div>
	                  <div class="signUpDay">${mvo.signUpDay}</div>
	                  <div class="quitYn">${mvo.quitYn}</div>
	              </div>
              
              
              </c:forEach>
             
              
             
          </div>


          <div class="board_page">
              <c:if test="${pageVo.currentPage > 1}">
	              <a href="/admin/memberList?page=${pageVo.currentPage - 1}" class="bt prev"><</a>
              </c:if>
              
				<c:forEach var ="i" begin="${pageVo.startPage}" end="${pageVo.endPage}">
					<c:if test="${pageVo.currentPage == i}">
						<span class="selecNum">${i}</span>
					</c:if>
					<c:if test="${pageVo.currentPage != i}">
		              	<a href="/admin/memberList?page=${i}" class="num">${i}</a>
					</c:if>
				</c:forEach>

              <c:if test="${pageVo.currentPage < pageVo.maxPage}">
	              <a href="/admin/memberList?page=${pageVo.currentPage + 1}" class="bt next">></a>
              </c:if>
          </div>


          
      </div>
  </div> 
  </div>
  <br><br><br><br><br><br>
	
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>


<script>
	const listbodies = document.querySelectorAll(".listbody");
	listbodies.forEach(function(listbody) {
	    listbody.addEventListener("click", function(event){
	        const no = event.target.parentNode.children[0].innerText
	        location.href="/admin/memberInfo?no=" + no;
	    });
	});

</script>

<c:if test="${alertMsg != null}">
	<script>
		alert('${alertMsg}');
	</script>
</c:if>
<c:remove var="alertMsg"/>