<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Petshop da FIAP</title>
</head>
<body>
	<a href="animal-novo">+ Animal</a>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>Nome</td>
				<td>Espécie</td>
				<td>Cor</td>
				<td>Acao</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${animais}" var="animal">
			<tr>
				<td>${animal.id}</td>
				<td>${animal.nome}</td>
				<td>${animal.especie}</td>
				<td>${animal.cor}</td>
				<td>
					<a href="animal-editar?id=${animal.id}">Editar</a>
					<a href="animal-remover?id=${animal.id}">Remover</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>