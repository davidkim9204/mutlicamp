<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String oper = request.getParameter("oper");
	int result = 0;
	if( oper.equals("add") ){
		result = num1 + num2;
	}
	else if( oper.equals("subt"))
	{
		result = num1 - num2;
	}
	else if( oper.equals("mult")){
		result = num1 * num2;
	}
	request.setAttribute("result", result);
	
	request.getRequestDispatcher("08_result.jsp").forward(request,
			response);
	
%>




