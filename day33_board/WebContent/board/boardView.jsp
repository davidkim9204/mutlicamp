<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>게시글 상세보기</h1>
		<table>
			<tr>
				<th>작성자</th>
				<td>${board.name}</td>
				<th>이메일</th>
				<td>${board.email}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td><fmt:formatDate value="${board.writedate}" /></td>
				<th>조회수</th>
				<td>${board.readcount }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3">${board.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3"><pre>${board.content }</pre></td>
			</tr>
		</table>
		<br> <br> 
		<input type="button" value="게시글 수정" 	onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'update')">
		<input type="button" value="게시글 삭제" onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'delete')">
		<input type="button" value="게시글 리스트" onclick="location.href='BoardServlet?command=board_list'"> 
		<input type="button" value="게시글 등록" onclick="location.href='BoardServlet?command=board_write_form'">
	</div>
	
	   <form action="BoardServlet" method="post">
         <input type="hidden" name="command" value="commentWrite">
         <input type="hidden" name="boardNum" value="${board.num }">
         <table>
         	<tr>
         		<td width = "70%">내용</td>
         		<td width = "20%">작성자</td>
         		<td width = "10%">내용</td>
         	</tr>
         	<tr>
         		<td><input type="text" name="content"></td>
         		<td><input type="text" name="writer"></td>
         		<td><input type="submit" value="등록"></td>
         	</tr>
         	
         	<c:forEach items = "${commentList}" var = "comment">
         		<tr>
         			<td>${comment.num} : ${comment.content}</td>
         			<td>${comment.writer} </td>
         			<td><a href="BoardServlet?command=commentDelete&cId=${comment.id}&boardNum=${board.num}">삭제</a></td>
         		</tr>
         	</c:forEach>
         </table>
        </form>
</body>
</html>