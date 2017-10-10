<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>대출 원리금 균등상환</h1>
		<form action="loan.do" method="post">
			대출금 : <input style="text-align: right;" type="text" name="balance"><br>
			이율 : <input style="text-align: right;" type="text" name="rate">%	<br> 
			대출기간 : <input style="text-align: right;" type="text" name="period">개월<br> 
			<input type="submit" value="계산">
			<input type="reset" value="다시">
		</form>

	</center>
</body>
</html>