<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 request.setCharacterEncoding("UTF-8");
 %>
 <jsp:useBean id="member" class="model.MemberBean"/>
 <jsp:setProperty name="member" property="*"/>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
입력 완료 회원 정뵤

이름 : <jsp:getProperty name="member" property="name" /> <br>
별명 : <jsp:getProperty name="member" property="nickname" /> <br>
비번 : <jsp:getProperty name="member" property="pwd" /> <br>
이멜 : <jsp:getProperty name="member" property="email" /> <br>
전번 : <jsp:getProperty name="member" property="phone" /> <br>

 
</body>
</html>