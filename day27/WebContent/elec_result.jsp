<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!final static double B_FEE_1 = 910;
	final static double B_FEE_2 = 1600;
	final static double B_FEE_3 = 7300;

	final static double U_FEE_1 = 93.3;
	final static double U_FEE_2 = 187.9;
	final static double U_FEE_3 = 280.6;
	final static double U_FEE_4 = 709.5;%>
	<%
		double use = Double.parseDouble(request.getParameter("elec_use"));
		double fee;
		//사용 구간 별 요금 계산
		if (use <= 200) {
			fee = B_FEE_1 + use * U_FEE_1;
		} else if (use <= 400) {
			fee = B_FEE_2 + 200 * U_FEE_1 + (use - 200) * U_FEE_2;
		} else if (use <= 1000) {
			fee = B_FEE_3 + 200 * U_FEE_1 + 200 * U_FEE_2 + (use - 400) * U_FEE_3;
		} else {
			fee = B_FEE_3 + 200 * U_FEE_1 + 200 * U_FEE_1 + 600 * U_FEE_3 + (use - 1000) * U_FEE_4;
		}
	%>


	사용량 :
	<%=use%><br>
	사용요금 : <%=fee %>
</body>
</html>