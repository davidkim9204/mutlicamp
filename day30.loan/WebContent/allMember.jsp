<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width='800' border='1'>
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>암호</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>권한(1:관리자, 0:일반회원)</th>
		</tr>
		<c:forEach items="${memberList }" var="m">
			<tr>
				<td>${m.name }</td>
				<td>${m.userid }</td>
				<td>${m.pwd }</td>
				<td>${m.email }</td>
				<td>${m.phone }</td>
				<td>${m.admin }</td>
			</tr>
		</c:forEach>
		<tr>
			<td align="right" colspan="6">
				<input type="button" value="회원추가"
				 onclick="location.href='addMember.do' ">
			</td>
		</tr>
	</table>
</body>
</html>