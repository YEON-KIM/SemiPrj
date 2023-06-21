<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COTYLEDON ROOM</title>
    <link rel="stylesheet" href="/resources/css/common/main.css">
    <link rel="stylesheet" href="/resources/css/member/agree.css">
    
    
</head>
<body>
    <%@include file="/WEB-INF/views/common/header_be.jsp" %>
    
    <div style="padding-top: 5%;"></div>
    <div style="text-align: center;"><h2>회원 가입</h2></div>
  <div class="red_bar"></div>
  <div style="padding-bottom: 5%;">
    <div class="sec1">
      <div>
        <h3>
          <div class="essential">[필수] 이용약관 동의</div>
        </h3>
        <br>
      </div>
      <div class="agreearea">
        <div class="content1">
          <h3>이용 약관</h3>
          <br>
          <div class="terms_content1">
            <strong><제 1 장 : 총칙></strong><br>
            <textarea rows="20" cols="150">제1조(목적)
이 약관은 oooo 회사(전자상거래 사업자)가 운영하는 oooo 사이버 몰(이하 “몰”이라 한다)에서 제공하는 인터넷 관련
서비스(이하 “서비스”라 한다)를 이용함에 있어 사이버 몰과 이용자의 권리ㆍ의무 및 책임사항을 규정함을 목적으로 합니다.                 
※「PC통신, 무선 등을 이용하는 전자상거래에 대해서도 그 성질에 반하지 않는 한 이 약관을 준용합니다」
             
제2조(정의)
①“몰” 이란 oooo 회사가 재화 또는 용역(이하 “재화등”이라 함)을 이용자에게 제공하기 위하여 컴퓨터등 정보통신설비를
이용하여 재화등을 거래할 수 있도록 설정한 가상의 영업장을 말하며, 아울러 사이버몰을 운영하는 사업자의 의미로도 
사용합니다.
             
②“이용자”란 “몰”에 접속하여 이 약관에 따라 “몰”이 제공하는 서비스를 받는 회원 및 비회원을 말합니다.
             
③ ‘회원’이라 함은 “몰”에 개인정보를 제공하여 회원등록을 한 자로서, “몰”의 정보를 지속적으로 제공받으며, “몰”이 제공하는
서비스를 계속적으로 이용할 수 있는 자를 말합니다.
             
④ ‘비회원’이라 함은 회원에 가입하지 않고 “몰”이 제공하는 서비스를 이용하는 자를 말합니다.
             
            
             
전속관할로 합니다. 다만, 제소 당시 이용자의 주소 또는 거소가 분명하지 않거…</textarea>
            </div>
          <div class="checkbox"><input type="checkbox" required; name="check">동의함</div>
        </div>
        
      </div>
  
    </div>
    <div class="sec1">
      <div>
        <h3>
          <div class="essential">[필수] 개인정보 처리방침 동의</div>
        </h3>
        <br>
      </div>
      <div>
        <div class="content">
          <div class="terms_content1">
            <h3>개인정보처리 방침</h3>
            <br>
            <textarea rows="20" cols="150">제1조(목적)
이 약관은 oooo 회사(전자상거래 사업자)가 운영하는 oooo 사이버 몰(이하 “몰”이라 한다)에서 제공하는 인터넷 관련
서비스(이하 “서비스”라 한다)를 이용함에 있어 사이버 몰과 이용자의 권리ㆍ의무 및 책임사항을 규정함을 목적으로 합니다.
                 
※「PC통신, 무선 등을 이용하는 전자상거래에 대해서도 그 성질에 반하지 않는 한 이 약관을 준용합니다」
             
제2조(정의)
①“몰” 이란 oooo 회사가 재화 또는 용역(이하 “재화등”이라 함)을 이용자에게 제공하기 위하여 컴퓨터등 정보통신설비를
이용하여 재화등을 거래할 수 있도록 설정한 가상의 영업장을 말하며, 아울러 사이버몰을 운영하는 사업자의 의미로도 
사용합니다.
             
②“이용자”란 “몰”에 접속하여 이 약관에 따라 “몰”이 제공하는 서비스를 받는 회원 및 비회원을 말합니다.
             
③ ‘회원’이라 함은 “몰”에 개인정보를 제공하여 회원등록을 한 자로서, “몰”의 정보를 지속적으로 제공받으며, “몰”이 제공하는
              서비스를 계속적으로 이용할 수 있는 자를 말합니다.
             
④ ‘비회원’이라 함은 회원에 가입하지 않고 “몰”이 제공하는 서비스를 이용하는 자를 말합니다.
  
②“이용자”란 “몰”에 접속하여 이 약관에 따라 “몰”이 제공하는 서비스를 받는 회원 및 비회원을 말합니다.
             
③ ‘회원’이라 함은 “몰”에 개인정보를 제공하여 회원등록을 한 자로서, “몰”의 정보를 지속적으로 제공받으며, “몰”이 제공하는
서비스를 계속적으로 이용할 수 있는 자를 말합니다.
             
④ ‘비회원’이라 함은 회원에 가입하지 않고 “몰”이 제공하는 서비스를 이용하는 자를 말합니다.
</textarea>
          </div>
        </div>
        <div class="checkbox"><input type="checkbox" required; name="check">동의함</div>
      </div>
  
    </div>
    <div class="sec1">
      <div>
        <h3>
          <div class="essential">[선택] 마케팅 활용 동의</div>
        </h3>
        <br>
      </div>
      <div>
        <div class="content">
          <div class="terms_content1">
            <h3>마케팅 활용 항목</h3>
            <br>
            <textarea rows="10" cols="150">제1조(목적)
              <h3>마케팅 활용 항목</h3>
              1. SMS 알림 문자
              2. 뉴스레터 및 안내 메일 수신 </textarea>
          </div>
        </div>
        <div>
          <div style="display: inline-block;">
            *선택항목에 동의하지 않으셔도 회원가입은 가능합니다.
        <div class="checkbox"><input type="checkbox" required>동의함</div>
      </div>
  
    </div>
  </div>
  </div>
 
  <div class="line"></div>
  
  
  <div class="btn_red" style="display: inline-block;"><a href ="/member/join" class="next" onclick="nextForm()">다음단계</a></div>
  <span class="btn_black" style="display: inline-block;"><a href ="#" class="next">취소</a></span>
  
  
</div>

	<%@include file="/WEB-INF/views/common/footer.jsp" %>

	<script type="text/javascript">
	
	const check = document.querySelector('#check');
	const checkedA = check.checked;
	// 선택 상태 확인
	console.log("checka" , checkedA )
	
	</script>



</body>
</html>
