<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/admin/Idcheck.css">
</head>
<body>
	<div class="box">	
		<h2>아이디 중복확인</h2>
		<input type="text" name= "checkId" id="popupInput">
	</div>
</body>

<script>
setTimeout(()=>{
    const popupInput = document.querySelector("#popupInput");
    const parentInput = window.opener.document.querySelector("input[name=deId]"); //현재 창 기준에서 부모창을 알 수 있고 opener를 통해 부모창에 접근할 수 있음.
    popupInput.value = parentInput.value; //부모요소의 값을 자식창(팝업창)에 전달
    
    }, 100);

</script>
</html>