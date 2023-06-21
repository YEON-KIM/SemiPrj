<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품 상세 정보</title>
    <link rel="stylesheet" href="/resources/css/admin/A_css.css">
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
</head>
<body>
		<%@ include file="/WEB-INF/views/common/header_am.jsp" %>
		
		<div class="board_wrap" id="infobox">
    <div class="board_title">
        <Strong>상품상세정보</Strong>
        <p>상품의 상세 정보입니다.</p>
    </div>
    <div class="board_view_wrap">
        <div class="board_view">
            <div class="title">
              네불라 115g
            </div>
            <div class="info">
                <dl>
                    <dt>상품코드</dt>
                    <dd>A083F1</dd>
                </dl>
                <dl>
                    <dt>상품 가격</dt>
                    <dd>24,000</dd>
                </dl>
                <dl>
                    <dt>카테고리</dt>
                    <dd>에센스</dd>
                </dl>
                <dl>
                    <dt>상품 삭제 여부</dt>
                    <dd>N</dd>
                </dl>

            </div>
            <div class="cont">
                상세내용<br>
                <img src="/resources/image/product/NEBULA/0.png" alt="이미지"><br>
                영양성분표에는 나트륨, 탄수화물, 당류, 지방, 트랜스지방, 포화지방, 콜레스테롤, 단백질 등이 표기되어 있다. 식품마다 표기된 내용이 다를 수 있다.
총 내용량(총 제공량)/열량(칼로리)/1회 제공량
총 내용량(총 제공량)은 말 그대로 제품의 총 내용량(g)을 의미한다. 열량(칼로리)은 총 내용량(총 제공량)을 모두 섭취했을 경우의 열량(칼로리)이다. 1회 제공량은 보통 1회 섭취하기에 적당한 양을 의미한다.
영양성분 함량
영양성분표에는 나트륨, 탄수화물, 당류, 지방, 포화지방, 트랜스지방, 콜레스테롤, 단백질 등이 표시된다. 표를 읽으면 각 영양성분이 제품에 얼마나 함유되어있는지 알 수 있다. 우측에 표시된 퍼센트로 제품을 모두 섭취하면 해당 영양성분의 1일 기준치 중 그 퍼센트만큼을 섭취했다는 의미이다. (ex, 나트륨 43% - 1일 나트륨 기준치 2000mg중 43% 섭취)
            </div>
            
        </div>
        <div class="bt_wrap">
            <a href="/admin/productList" class="on">목록</a>
            <a href="/admin/productEdit">수정</a>
        </div>
    </div>
</div>
		
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>