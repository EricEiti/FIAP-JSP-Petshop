<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Petshop da FIAP - EDITAR</title>
</head>
<body>
	<h1>Editar Animal</h1>
	<form method="POST" action="animal-editar"></br>
		<label>ID:</label>${animal.id}</br>
		<label>Nome:</label>
		<input name="nomeAnimal" type="text" value="${animal.nome}"></br>
		<label>Especie:</label>
		<input name="especieAnimal" type="text" value="${animal.especie}"></br>
		<label>Cor:</label>
		<input name="corAnimal" type="text" value="${animal.cor}"></br>
		<input type="submit" value="Editar">
	</form>
</body>
</html>