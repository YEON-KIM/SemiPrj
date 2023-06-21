function nextPage1() {
    var radios = document.getElementsByName("shop");
    var checked = false;
    for (var i = 0; i < radios.length; i++) {
      if (radios[i].checked) {
        checked = true;
        break;
      }
    }
    if (checked) {
      location.href = "/reservation/rvSellect02";
    } else {
      alert("매장을 선택해주세요.");
    }
}
fun

function nextPage2() {
    var radios = document.getElementsByName("designer");
    var checked = false;
    for (var i = 0; i < radios.length; i++) {
      if (radios[i].checked) {
        checked = true;
        break;
      }
    }
    if (checked) {
      location.href = "/reservation/rvSellect03";
    } else {
      alert("디자이너를 선택해주세요.");
    }
}

function nextPage3() {
  var radios = document.getElementsByName("cut");
  var checked = false;
  for (var i = 0; i < radios.length; i++) {
    if (radios[i].checked) {
      checked = true;
      break;
    }
  }
  if (checked) {
    location.href = "/reservation/rvSellect04";
  } else {
    alert("시술을 선택해주세요.");
  }
}

function nextPage4() {
  var radios = document.getElementsByName("time");
  var dateInput = document.getElementById("date");

  var checked = false;
  for (var i = 0; i < radios.length; i++) {
    if (radios[i].checked) {
      checked = true;
      break;
    }
  }
  if (checked && dateInput.checkValidity()) {
    location.href = "/reservation/rvSellect05";
  } else {
    alert("시간을 선택해주세요.");
  }
}

function nextPage5() {
  var radios = document.getElementsByName("checkbox");
  var checked = false;
  for (var i = 0; i < radios.length; i++) {
    if (radios[i].checked) {
      checked = true;
      break;
    }
  }
  if (checked) {
    location.href = "#";
  } else {
    alert("약관동의를 체크해주세요.");
  }
}



