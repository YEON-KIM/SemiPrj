<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/common/shop_list_main.css">
    <link rel="stylesheet" href="/resources/css/common/main.css">
    
    <style>
        
    </style>
    
</head>
<body>

    <%@ include file="/WEB-INF/views/common/header_be.jsp" %>

        <br><br>
        <div class="rv_word">
            <p class="rv_word_title">매장 목록</p><br>
            
        </div>
        <div class="bar"></div>
        
        <form action="">
            <table class="rv_shoplist" border="1">
                <colgroup>
                    <col class="col1"/>
                    <col class="col2"/>
                    <col class="col2"/>
                </colgroup>
                <tr>
                    <td><img class="shopimg" src="/resources/image/shop3.jpg"></td>
                    <td>
                        <h1>역삼점<br></h1>
                        <p>주소 : 서울시 강남구 역삼동<br></p>
                        <p>주차 : 주차 가능<br></p>
                        <p>전화 : 02-222-4444</p>
                    </td>
                    <td class="d_td">
                        <div style="text-align: center;">
                            <button type="button">
                                    <a href="/about/shopList01">매장 둘러보기</a>
                            </button>
                        </div>
                    </td>
                </tr>
            </table>
            <table class="rv_shoplist" border="1">
                <colgroup>
                    <col class="col1"/>
                    <col class="col2"/>
                    <col class="col2"/>
                </colgroup>
                <tr>
                    <td><img class="shopimg" src="/resources/image/shop3.jpg" alt=""></td>
                    <td>
                        <h1>신사점<br></h1>
                        <p>주소 : 서울시 강남구 신사동<br></p>
                        <p>주차 : 주차 가능<br></p>
                        <p>전화 : 02-222-3333</p>
                    </td>
                    <td class="d_td">
                        <div style="text-align: center;">
                            <button type="button">
                                    <a href="/about/shopList02">매장 둘러보기</a>
                            </button>
                        </div>
                    </td>
                </tr>
            </table>
            <table  class="rv_shoplist" border="1">
                <colgroup>
                    <col class="col1"/>
                    <col class="col2"/>
                    <col class="col2"/>
                </colgroup>
                <tr>
                    <td class="aa"><img class="shopimg" src="/resources/image/shop5.png" alt=""></td>
                    <td>
                        <h1>논현점<br></h1>
                        <p>주소 : 서울시 강남구 논현동<br></p>
                        <p>주차 : 주차 가능<br></p>
                        <p>전화 : 02-222-4444</p>
                    </td>
                    <td class="d_td">
                        <div style="text-align: center;">
                            <button type="button">
                                    <a href="/about/shopList03">매장 둘러보기</a>
                            </button>
                        </div>
                
                    </td>
                </tr>
            </table>
            <table  class="rv_shoplist" border="1">
                <colgroup>
                    <col class="col1"/>
                    <col class="col2"/>
                    <col class="col2"/>
                </colgroup>
                <tr>
                    <td class="aa"><img class="shopimg" src="/resources/image/shop4.png" alt=""></td>
                    <td>
                        <h1>압구정점<br></h1>
                        <p>주소 : 서울시 강남구 압구정동<br></p>
                        <p>주차 : 주차 가능<br></p>
                        <p>전화 : 02-222-4444</p>
                    </td>
                    <td class="d_td">
                        <div style="text-align: center;">
                            <button type="button">
                                    <a href="/about/shopList04">매장 둘러보기</a>
                            </button>
                        </div>
                    </td>
                </tr>
            </table>

    
		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

    

</body>
</html>