<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Petshop da FIAP - NOVO</title>
</head>
<body>
	<h1>Novo Animal</h1>
	<form method="POST" action="animal-novo"><br>
		<label>ID:</label>
		<input name="idAnimal" type="text"><br>
		<label>Nome:</label>
		<input name="nomeAnimal" type="text"><br>
		<label>Especie:</label>
		<input name="especieAnimal" type="text"><br>
		<label>Cor:</label>
		<input name="corAnimal" type="text"><br>
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>