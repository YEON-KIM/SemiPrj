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
    <link rel="stylesheet" href="/resources/css/reservation/R_css.css">
    <link rel="stylesheet" href="/resources/css/reservation/review_list.css">
    <style type="text/css">
    	#page-area{
	width: 30%;
	margin: auto;
	display: flex;
	justify-content: space-between;
	font-size: 2em;
	margin-top: 30px;
	
}
    </style>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header_be.jsp" %>
    <%@ include file="/WEB-INF/views/common/sidebar_com.jsp" %>
	
    <div class="board_wrap">
      <div class="board_title">
          <Strong>리뷰 게시판</Strong>
      </div>
      <div class="board_list_wrap">
          <div class="board_list">
              <div class="top">
                  <div class="num">번호</div>
                  <div class="picture">사진 미리보기</div>
                  <div class="title"> 내용</div>
                  <div class="memberNick">닉네임</div>
                  <div class="shop">매장</div>
                  <div class="designer">디자이너</div>
              </div>
              
              
              <c:forEach items="${reviewList}" var="rvo">
              <div class="gogo">
                  <div class="num">${rvo.no}</div>
                  <div class="picture"><img class="reviewphoto" src="/resources/image/리뷰사진7.jpg" alt="이미지"></div>
                  <div class="title"><a href="">${rvo.content}</a></div>
                  <div class="memberNick">${rvo.writer}</div>
                  <div class="shop">${rvo.shopName}</div>
                  <div class="designer">${rvo.designerName}</div>
              </div>
              </c:forEach>
              
          </div>


          <div id="page-area">
			
				<c:if test="${ pageVo.currentPage > 1 }">
					<a href="/communication/reviewlist?page=${pageVo.currentPage-1}"><</a>
				</c:if>
				
				<c:forEach var="i" begin="${pageVo.startPage}" end="${pageVo.endPage}">					
					<c:if test="${pageVo.currentPage == i}">
						<span>${i}</span>
					</c:if>
					<c:if test="${pageVo.currentPage != i}">
						<a href="/communication/reviewlist?page=${i}">${i}</a>
					</c:if>
				</c:forEach>
				
				<c:if test="${ pageVo.currentPage < pageVo.maxPage }">
					<a href="/communication/reviewlist?page=${pageVo.currentPage+1}">></a>
				</c:if>
			</div>
          
          
          


          <div class="bt_wrap">
              <a href="/communication/reviewenroll" class="on">등록</a>
              <!-- <a href="#">수정</a> -->
          </div>
      </div>
  </div>
  

</section>
	
	
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>


</body>
</html>

<!-- <script>
	const gogo = document.querySelector(".gogo");
	gogo.addEventListener("click" , function(event){
		const no = event.target.parentNode.children[0].innerText;
		location.href = "/communication/reviewdetaillist?no=" + no;
	});
</script> -->
<script>
const elements = document.querySelectorAll('.gogo');
elements.forEach(element => {
  element.addEventListener('click', () => {
    const no = element.querySelector('.num').innerText;
    location.href = "/communication/reviewdetaillist?no=" + no;
  });
});
</script>