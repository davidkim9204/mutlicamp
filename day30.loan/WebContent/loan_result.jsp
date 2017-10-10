<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Loan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
	text-align: center;
	line-height: 1.5;
	border: 1px solid #ccc;
	margin: 20px 10px;
}

table thead {
	border-right: 1px solid #ccc;
	border-left: 1px solid #ccc;
	background: #e7708d;
}

table thead th {
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	color: pink;
}

table tbody th {
	width: 150px;
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
	background: hotpink;
}

table td {
	width: 250px;
	padding: 10px;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
}
</style>
</head>
<body>

	<center>
		<table>
			<tr>
				<th>월납입금</th>
				<th>월납입원금</th>
				<th>월납입이자</th>
				<th>잔액</th>
			</tr>
			<%-- <%
				for(int i=0; i<list.size();i++){
					Loan loan = list.get(i);
				}
			%> --%>
			<c:forEach items="${list}" var="loan">
				<tr>
					<td>${loan.monthPayment }</td>
					<td>${loan.monthOrigin }</td>
					<td>${loan.monthInterest }</td>
					<td>${loan.balance }</td>
				</tr>
			</c:forEach>
			
			
			
		</table>
	</center>
</body>
</html>




