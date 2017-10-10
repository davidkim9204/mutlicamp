<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 정보입력폼


<form action="03_addMember.jsp">
<table>
이름 : <input type="text" name="name"> <br>
별명 : <input type="text" name="nickname"> <br>
비번 : <input type="password" name="pwd"> <br>
이멜 : <input type="text" name="email"> <br>
전번 : <input type="text" name="phone"> <br>

<input type="submit" value="전송">
<input type="reset" value="취소"> <br>




</table>
</form>
</body>
</html>