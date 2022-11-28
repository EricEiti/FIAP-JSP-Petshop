<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Usuario</title>
</head>
<body>
	<form method="POST" action="usuario-editar">
		<label>login: </label>${login}<br>
		<input name="login" type="hidden" value="${login}">
		<label>Nome:</label>
		<input name="nomeCompleto" type="text" value="${nomeCompleto}"><br>
		<input type="submit" value="Editar">
	</form>
</body>
</html>