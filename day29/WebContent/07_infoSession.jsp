<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 정보를 얻어오는 메소드 사용하기

<%

String id_Str = session.getId();
long lasttime = session.getLastAccessedTime();
long createdtime = session.getCreationTime();
long time_used = (lasttime - createdtime) / 60000;
int inactive = session.getMaxInactiveInterval() / 60;
boolean b_new = session.isNew();
%>
1) <%= session.getId() %> <br>
2) <%= time_used %> <br>
3) <%= inactive %> <br>
4)

<%
if(b_new)
   out.print("새 세션을 만들었네");
else
   out.print("안만들었네");

%>

</body>
</html>