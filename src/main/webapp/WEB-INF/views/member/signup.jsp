<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="<c:url value="/member/add"/>" method="POST">
	아이디 : <input type="text"/>
	비밀번호 : <input type="text"/>
	이메일 : <input type="text"/>
	<button type="submit"></button>
</form>
</body>
</html>