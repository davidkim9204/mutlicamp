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
 
 Cookie c = new Cookie("id", "jian");
 c.setMaxAge(365*24*60*60);
 response.addCookie(c);
 
 response.addCookie(new Cookie("pwd", "loveyou"));
 response.addCookie(new Cookie("age", "35"));
 %>
 
 쿠키설정 했어용
</body>
</html>