<%@page import="java.net.URLDecoder"%>
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
		Cookie[] ck = null;
		ck = request.getCookies();
		String name = null;
		if( ck != null ){
			for( Cookie c : ck ){
				if( c.getName().equals("username")){
					//ㄱ
					name = URLDecoder.decode(c.getValue(), "UTF-8");
				}
			}
		}
	%>
	<%=name %>님 안녕하세요<br>
	저희 홈페이지에 방문해 주셔서 감사합니다 blabla<br>
	
	<form action="logout.jsp">
		<input type="submit" value="로그아웃">
	</form> 
	
	<input type="button" value="로그아웃" onclick="location.href='logout.jsp'">
	
</body>
</html>