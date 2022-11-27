<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Petshop da FIAP - Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="login" method="POST">
		<label>Login:</label>
		<input type="text" name="login"><br>
		<label>Senha:</label>
		<input type="password" name="senha"><br>
		<input type="submit" value="Entrar">
	</form>
	<h3>${msg}</h3>
</body>
</html>