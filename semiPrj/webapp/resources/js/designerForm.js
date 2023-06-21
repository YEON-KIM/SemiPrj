let isIdOk = false;
let isPwdOk = false;
let isNameOk = false;

//아이디 유효성 검사
const deId = document.querySelector("input[name=deId]");
document.querySelector("#sameid")
deId.addEventListener("blur", function(){
  const idStr = deId.value
  const reg = /^[a-z][a-z0-9]{3,11}$/
  const result = reg.test(idStr);

  if(result){
	isIdOk = true;
    deId.style.border="2px solid blue";
  }else{
	isIdOk = false;
    deId.style.border="2px solid red";
  }
});

//비밀번호 일치 검사
const pwd = document.querySelector("input[name = dePwd]");
const pwd2 = document.querySelector("input[name = dePwd2]");
const same = document.querySelector("#same");
pwd2.addEventListener("blur", function(){
  if(pwd.value == pwd2.value){
	isPwdOk = true;
    pwd2.style.border="2px solid blue";
    same.innerText="일치";
    same.classList.remove("red-color");
    same.classList.add("blue-color");
    
  }else{
	isPwdOk = false;
    pwd2.style.border ="2px solid red";
    same.innerText="불일치";
    same.classList.remove("blue-color");
    same.classList.add("red-color");
  }
});


//이름 유효성 검사 
const deName = document.querySelector("input[name=deName]");
const sameName = document.querySelector(".sameName");
deName.addEventListener("blur", function(){
  const nameStr = deName.value;
  const reg1 = /^[가-힣]{2,4}$/;
  const result = reg1.test(nameStr);

  if(result){
	isNameOk = true;
	deName.style.border="2px solid blue";
    sameName.innerHTML="<strong style='color : blue;'>만족</strong>";
  }else{
	isNameOk = false;
	deName.style.border="2px solid red";
    sameName.innerHTML="<strong style='color : red;'>불만족</strong>";
  }
});

//계정생성 검사
function checkValid(){
	if(!isIdOk){
		alert("아이디를 확인하세요.");
		return false;
	}
	if(!isPwdOk){
		alert("비밀번호를 확인하세요.");
		return false;
	}
	if(!isNameOk){
		alert("이름을 확인하세요.");
		return false;
	}
	return true;
}

function dbCheckId(){
	window.open("http://127.0.0.1:8888/designer/checkId", "아이디 중복확인" ,"width=500 , height=300");

}
