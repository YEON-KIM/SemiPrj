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
<link rel="stylesheet" href="/resources/css/reservation/reservationNew.css">
   
    <style>
        .red-color{color: #ff7a7a;}
        .blue-color{color: #32d2aa;}
    </style>
</head>
<body>
	<%@include file="/WEB-INF/views/common/header_be.jsp"%>

	<div style="padding-top: 5%;"></div>
	<div>
		<h2>예약</h2>
	</div>
	<div class="red_bar"></div>
	<div style="padding-bottom: 5%;">
		<form action="" method="post" onsubmit="checkValid()" >

			<table class="content" name="joinForm">
				<tr>
					<td class="text">매장</td>
					<td>
						<select id="shop" required>
							<option value="option1">역삼점</option>
							<option value="option2">신사점</option>
							<option value="option3">논현점</option>
							<option value="option4">압구정점</option>
						  </select>
					</td>
				</tr>
				<tr>
					<td class="text">디자이너</td>
					<td>
						<select id="designer">
							<option value="default"></option>
							
						</select>
					</td>
				</tr>
				<tr>
					<td class="text">시술</td>
					<td>
						<select id="hair" required>
							<option value="option1">컷트</option>
							<option value="option2">파마</option>
							<option value="option3">염색</option>
							<option value="option4">드라이</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="text">일자</td>
					<td>
						<input type="date" id="myDate" required>
					</td>
				</tr>
				<tr>
					<td class="text">시간</td>
					<td>
						<select id="time" required>
							<option value="option1">10:00</option>
							<option value="option2">10:30</option>
							<option value="option3">11:00</option>
							<option value="option4">11:30</option>
							<option value="option1">12:00</option>
							<option value="option2">12:30</option>
							<option value="option3">1:00</option>
							<option value="option4">1:30</option>
							<option value="option1">2:00</option>
							<option value="option2">2:30</option>
							<option value="option3">3:00</option>
							<option value="option4">3:30</option>
							<option value="option4">4:00</option>
							<option value="option4">4:30</option>
							<option value="option4">5:00</option>
							<option value="option4">5:30</option>
							<option value="option4">6:00</option>
							<option value="option4">6:30</option>
							<option value="option4">7:00</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td colspan="3"><input class="gogo" type="submit"
						value="예약하기"></td>
				</tr>
				

			</table>
		</form>
	</div>
	

	<%@include file="/WEB-INF/views/common/footer.jsp"%>
	

</body>
</html>

<script>
	const shopSelect = document.getElementById("shop");
	const designerSelect = document.getElementById("designer");
  
	shopSelect.addEventListener("change", function() {
	  // Clear previous options
	  designerSelect.innerHTML = "";
  
	  // Add new options based on firstSelect value
	  if (shopSelect.value === "option1") {
		const option1 = document.createElement("option");
		option1.text = "김승우";
		option1.value = "shop1-1";
		designerSelect.add(option1);
  
		const option2 = document.createElement("option");
		option2.text = "김강민";
		option2.value = "shop1-2";
		designerSelect.add(option2);

		const option3 = document.createElement("option");
		option3.text = "이소라";
		option3.value = "shop1-3";
		designerSelect.add(option3);

		const option4 = document.createElement("option");
		option4.text = "김김김";
		option4.value = "shop1-4";
		designerSelect.add(option4);

	  } else if (shopSelect.value === "option2") {
		const option1 = document.createElement("option");
		option1.text = "이나라";
		option1.value = "shop2-1";
		designerSelect.add(option1);
  
		const option2 = document.createElement("option");
		option2.text = "박소미";
		option2.value = "shop2-2";
		designerSelect.add(option2);

		const option3 = document.createElement("option");
		option3.text = "최수정";
		option3.value = "shop2-3";
		designerSelect.add(option3);

		const option4 = document.createElement("option");
		option4.text = "한해미";
		option4.value = "shop2-4";
		designerSelect.add(option4);

	  } else if (shopSelect.value === "option3") {
		const option1 = document.createElement("option");
		option1.text = "강현석";
		option1.value = "shop3-1";
		designerSelect.add(option1);
  
		const option2 = document.createElement("option");
		option2.text = "이승희";
		option2.value = "shop3-2";
		designerSelect.add(option2);

		const option3 = document.createElement("option");
		option3.text = "김다인";
		option3.value = "shop3-3";
		designerSelect.add(option3);

		const option4 = document.createElement("option");
		option4.text = "김수민";
		option4.value = "shop3-4";
		designerSelect.add(option4);

	  } else if (shopSelect.value === "option4") {
		const option1 = document.createElement("option");
		option1.text = "이나라";
		option1.value = "shop4-1";
		designerSelect.add(option1);
  
		const option2 = document.createElement("option");
		option2.text = "박소미";
		option2.value = "shop4-2";
		designerSelect.add(option2);

		const option3 = document.createElement("option");
		option3.text = "최수정";
		option3.value = "shop4-3";
		designerSelect.add(option3);

		const option4 = document.createElement("option");
		option4.text = "한해미";
		option4.value = "shop4-4";
		designerSelect.add(option4);
	  }
	});


	var today = new Date();
	var nextWeek = new Date(today.getFullYear(), today.getMonth(), today.getDate() + 7);

	var dd = String(nextWeek.getDate()).padStart(2, '0');
	var mm = String(nextWeek.getMonth() + 1).padStart(2, '0');
	var yyyy = nextWeek.getFullYear();

	var maxDate = yyyy + '-' + mm + '-' + dd;

	document.getElementById("myDate").setAttribute("min", today.toISOString().split('T')[0]);
	document.getElementById("myDate").setAttribute("max", maxDate);	

	


  </script>