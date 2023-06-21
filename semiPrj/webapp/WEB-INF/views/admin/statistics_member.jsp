<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>방문자 통계</title>
    <link rel="stylesheet" href="/resources/css/admin/admin.css">
    <link rel="stylesheet" href="/resources/css/admin/a_main.css">
    <link rel="stylesheet" href="/resources/css/admin/designerForm.css">
    <link rel="stylesheet" href="/resources/css/admin/statistics_member.css">
    <script defer src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
    <script defer src="/resources/js/statistics_member.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header_am.jsp" %>

	<div class="statistics_area">
    <div class="aboutmenu">
      <ul>
        <li class="aboutlist"><a class="on" href="./statistics_member.jsp">방문자</a></li>
        <li class="aboutlist"><a class="on" href="./statistics_member.jsp">상품판매</a></li>
      </ul>
    </div>
    <div class="ststistics_member">
      <div class="visit_text">방문통계</div><span id="time">23.03.17 21:01:02 기준</span>
      <div class="visit_content">
        <table>
          <tr>
            <th class="today">오늘 방문수</th>
            <th class="yesterday">어제 방문수</th>
            <th class="all">누적 방문수</th>
          </tr>
          <tr>
            <td>514</td>
            <td>129</td>
            <td>148,236</td>
          </tr>
        </table>
      </div>
      <div class="chart">
        <canvas id="myChart" width="1200px" height="450px"></canvas>
      </div>

    </div>
  </div>
  <br><br><br><br><br><br><br><br>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>