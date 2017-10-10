<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Loan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int balance = Integer.parseInt(request.getParameter("balance"));
		double rate = Double.parseDouble(request.getParameter("rate"));
		rate = rate / 100;
		int period = Integer.parseInt(request.getParameter("period"));
		int monthPayment = (int) ((balance * rate / 12 * Math.pow((1 + rate / 12), period))
				/ (Math.pow((1 + rate / 12), period) - 1));
		List<Loan> list = new ArrayList<>();
		for (int i = 1; i <= period; i++) {
			// 		out.println(monthPayment + "&nbsp;&nbsp;&nbsp;");
			// 		int monthRate = (int)(balance * rate/12);//이번달 이자
			// 		int monthOrigin = monthPayment - monthRate;//이번달 원금
			// 		out.println(monthOrigin + "&nbsp;&nbsp;&nbsp;");
			// 		out.println(monthRate + "&nbsp;&nbsp;&nbsp;");
			// 		balance -= monthOrigin;
			// 		out.println(balance + "&nbsp;&nbsp;&nbsp;<br>");
			int monthInterest = (int) (balance * rate / 12);//이번달 이자
			int monthOrigin = monthPayment - monthInterest;//이번달 원금
			balance -= monthOrigin;
			Loan loan = new Loan();
			loan.setMonthPayment(monthPayment);
			loan.setMonthInterest(monthInterest);
			loan.setMonthOrigin(monthOrigin);
			loan.setBalance(balance);
			list.add(loan);
		}
	%>

	<center>
		<table>
			<%
				for (int i = 0; i < list.size(); i++) {
					Loan loan = list.get(i);
			%>
			<tr>
				<td> <%= loan.getMonthPayment() %></td>
				<td> <%= loan.getMonthOrigin() %></td>
				<td> <%= loan.getMonthInterest() %></td>
				<td> <%= loan.getBalance() %></td>			
			
			</tr>
			<%
				}
			%>
		</table>
	</center>
</body>
</html>




