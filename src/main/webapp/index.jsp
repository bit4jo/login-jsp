<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta content="text/html; charset=UTF-8" />
<title>Login</title>
</head>
<body>
	<form action="/loginAction" method="post">
		<h1>${message}</h1>
		<input name="inputId" type="text" placeholder="아이디 입력" /> 
		<input name="inputPw" type="password" placeholder="비밀번호 입력" /> 
		<input	type="submit" value="로그인" />
	</form>
	
Remote Ip : <%=request.getRemoteAddr()%>
Remote Host : <%=request.getRemoteHost()%>
Remote Port : <%=request.getRemotePort()%>


	
</body>
</html>
