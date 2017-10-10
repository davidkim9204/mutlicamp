<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
정보 입력폼
<form action="addItem.jsp">
<table>
상품명 : <input type="text" name="name"> <br>
가격 : <input type="text" name="price"> <br>
설명 : <textarea rows="5" cols="30" name="description" ></textarea> <br>


<input type="submit" value="전송" >
<input type="reset" value="취소"> <br>

</body>
</html>