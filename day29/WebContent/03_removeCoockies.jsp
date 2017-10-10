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
Cookie c = new Cookie("id", "");
c.setMaxAge(0);
response.addCookie(c);

%>
쿠키 삭제됬어용

<a href="02_getCookies.jsp">
확인해보세욤

</body>
</html>