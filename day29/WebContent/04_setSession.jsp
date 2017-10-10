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
		session.setAttribute("id", "pinksung");
		session.setAttribute("pwd", "test1234");
		session.setAttribute("age", 20);
		session.setAttribute("a", "abc");
		session.setAttribute("b", "abc");
		session.setAttribute("c", 20);
		session.setAttribute("d", "ddd");
		session.setAttribute("e", "ddd");
		session.setAttribute("f", 20);
	%>
	세션설정

</body>
</html>