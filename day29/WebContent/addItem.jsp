<%@page import="model.ItemBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 request.setCharacterEncoding("UTF-8");
 %>

 <jsp:useBean id="item" class="model.ItemBean"/>
 <jsp:setProperty name="item" property="*"/>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
입력 완료된 정뵤

상품명 : <jsp:getProperty name="item" property="name" /> <br>
가격 : <jsp:getProperty name="item" property="price" /> <br>
설명 : <jsp:getProperty name="item" property="description" /> <br>

 

</body>
</html>