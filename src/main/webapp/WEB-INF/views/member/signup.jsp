<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="POST" action="<c:url value="/member/add"/>">
	아이디 : <input name="userid" type="text"/><p>
	비밀번호 : <input name="password" type="password"/><p>
	이메일 : <input name="email" type="text"/><p>
	<button type="submit">회원가입</button>
</form>
</body>
</html>