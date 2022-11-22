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

	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>Nome</td>
				<td>Espécie</td>
				<td>Cor</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${animais}" var="animal">
			<tr>
				<td>${animal.id}</td>
				<td>${animal.nome}</td>
				<td>${animal.especie}</td>
				<td>${animal.cor}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>