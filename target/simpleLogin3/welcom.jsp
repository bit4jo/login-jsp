<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
 <h1> WELCOME! ${sessionScope.loginId }</h1>
 <button onClick="location.href='/logoutAction'">로그아웃</button>
</body>
</html>