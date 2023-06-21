function sendCheckValue() {
	var openJoinfrm = opener.documetn.joinForm;
	
	if(document.checkIdForm.chResult.value == "N") {
		alert("다른 아이디를 입력해주세요.");
		openJoinfrm.id.focus();
		
		window.close();
	}else {
		//종복체크 결과인 idCheck 값을 전달
		
	openJoinfrm.idDuplication.value = "idCheck";
		openJoinfrm.dbCheckId.disabled = true;
		openJoinfrm.dbCheckId.style.opacity = 0.6;
		
	openJoinfrm.dbCheckId.style.cursor = "defalut";
			window.close();
	
	}
	
	
}