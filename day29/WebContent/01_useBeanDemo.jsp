<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="member" class="model.MemberBean"/>

# 자바빈 객체생성 후 저장된 정보 출력하기 <br><br>
이름 : <%=member.getName() %> <br>
아이디 : <%=member.getNickname() %><br>

# 정보 변경 후 정보 출력하기 <br><br>

<%
member.setName("박민우");
member.setNickname("minuminu");

%>
이름 : <%=member.getName() %> <br>
아이디 : <%=member.getNickname() %><br>



</body>
</html>