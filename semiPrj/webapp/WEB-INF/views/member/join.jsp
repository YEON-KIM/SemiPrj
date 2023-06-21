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
<link rel="stylesheet" href="/resources/css/member/join.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
   
    <style>
        .red-color{color: #ff7a7a;}
        .blue-color{color: #32d2aa;}
    </style>
</head>
<body>
	<%@include file="/WEB-INF/views/common/header_be.jsp"%>

	<div style="padding-top: 5%;"></div>
	<div>
		<h2>회원 가입</h2>
	</div>
	<div class="red_bar"></div>
	<div style="padding-bottom: 5%;">
		<form action="" method="post" onsubmit="checkValid()" >

			<table class="content" name="joinForm">
				<tr>
					<td class="text">아이디</td>
					<td><input class="box" type="text" name="memberId" required></td>
					<td><input class="btn01" type="submit" value="중복확인"></td>
				</tr>
				<tr>
					<td class="text">비밀번호</td>
					<td><input class="box" type="text" name="memberPwd" placeholder="비밀번호를 입력하세요" required></td>
				</tr>
				<tr>
					<td class="text">비밀번호 확인</td>
					<td><input class="box" type="text" name="memberPwd2" placeholder="비밀번호를 입력하세요" required></td>
				</tr>
				<tr>
					<td  class="text" id="pwd-result" class='aaa bbb ccc'>비밀번호 일치여부</td>
				</tr>
				<tr>
					<td class="text">이름</td>
					<td><input class="box" type="text" name="membername" required></td>
				</tr>
				<tr>
					<td class="text">주민번호</td>
					<td><input class="box" type="text" name="memberIdnum" placeholder="123456-123456" required>
					</td>
				</tr>
				<tr>
					<td class="text">전화번호</td>
					<td><input class="box" type="text" name="memberPhone" placeholder="010-1234-5678" required> 
					</td>
					<td><input class="btn01" type="submit" value="인증하기"></td>
				</tr>
				<tr>
					<td class="text">이메일</td>
					<td><input class="box" type="email" name="memberEmail" placeholder="abc@naver.com" required>
					</td>
				<!-- 	<tr>
					<td  class="text" id="email-result" class='aaa bbb ccc'>이메일 검사</td>
				</tr> -->
				</tr>
				<tr>
					<td class="text">주소</td>
					<td><input class="box" type="text" name="memberAddress" required></td>
					<td><input class="btn01" type="submit" value="주소찾기"></td>
				</tr>
				<tr>
					<td class="text">상세주소</td>
					<td><input class="box" type="text" name="memberAddress2" required></td>
				</tr>
				<tr>
					<td class="text">닉네임</td>
					<td><input class="box" type="text" name="memberNick"></td>
				</tr>
				<td class="text">성별</td>
				<td style="text-align: center;"><label for="female">여성</label>
					<input type="checkbox" id="female" name="gender" value="female">

					<span><label for="male">남성</label> <input type="checkbox"
						id="male" name="gender" value="male"></span></td>
				</tr>
				<tr>
					<td colspan="3"><input class="login" type="submit"
						value="가입하기"></td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="find">
							<a href="/member/login">로그인</a> | <a href="/member/missingpwd">비밀번호
								찾기</a>
					</td>
					</div>
				</tr>

			</table>
		</form>
	</div>
	

	<%@include file="/WEB-INF/views/common/footer.jsp"%>
	<script type="text/javascript" defer>
	
	 //기본값은 false
    let isPwdOk = false;
    let isIdOk = false;

    const pwd = document.querySelector('input[name=memberPwd]');
    const pwd2 = document.querySelector('input[name=memberPwd2]');
    const pwdResult = document.querySelector('#pwd-result');

    pwd.addEventListener("blur" , () => {

        //정규식 검사
        const str = pwd.value;
        const reg = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,11}$/
        const result = reg.test(str);

       if(!result){
            isIdOk = false;
            //비번창 색변경
            alert("대문자 알파벳과 소문자,숫자, 특수기호(!@#$%^&*)를 포함한 비밀번호를 입력하세요 (8글자 이상 12미만)")
            
        }else {
            isIdOk = true;
           
        }

    });
    
    pwd2.addEventListener("blur",  () => {
        
        //비번일치확인

        if (pwd.value === pwd2.value) {
            isPwdOk = true;
            pwdResult.innerText = '일치';
            pwdResult.classList.remove('red-color');
            pwdResult.classList.add('blue-color');

        }else {
            isPwdOk = false;
            pwdResult.innerText = '불일치';
            pwdResult.classList.remove('blue-color');
            pwdResult.classList.add('red-color');
        }
        
    });


    function checkValid() {
        if(!isPwdOk){
            alert('비밀번호를 확인하세요');
            return false;
        
        }
       
        return true;
    }

    
	</script>

</body>
</html>