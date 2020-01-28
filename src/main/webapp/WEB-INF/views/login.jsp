<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<script>

	function loginButtonClick(){
		$("")	
	}
	

</script>
<body>
	<form action="/login" method="POST">
		<input name="id">
		<input name="password">
		<button type="submit" onclick="loginButtonClick()">로그인</button>
	</form>
</body>
</html>