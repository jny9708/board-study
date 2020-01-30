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
	var msgs = '${msgs}';
	if(msgs != ''){
		alert(msgs);
	}
	
	
</script>
<body>
	<form action="<c:url value="/login"/>" method="POST">
		아이디 : <input name="userid" type="text"> <p>
		비밀번호 : <input name="password" type="password"><p>
		<button type="submit" >로그인</button>
	</form>
	
	<a href="<c:url value="/member/signup"/>"> 회원가입 </a>
	
	
</body>
</html>