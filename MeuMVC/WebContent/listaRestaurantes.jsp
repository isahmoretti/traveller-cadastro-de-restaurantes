<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page
	import="java.util.List, br.com.traveller.model.Restaurante"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
 <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
    integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
    integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />

  <!--Jquery-->

  <script src="https://code.jquery.com/jquery-3.6.0.min.js"
    integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<title>Lista de restaurantes</title>
</head>
<body>
<main class="container my-5">
	<h1>Lista de restaurantes cadastrados</h1>
	
	<table class="table-bordered">
  <tr>
    <th class="px-1 text-center table-primary">ID</th>
    <th class="px-1 text-center table-primary">Nome</th>
    <th class="px-1 text-center table-primary">Nota</th>
    <th class="px-1 text-center table-primary">Tipo de cozinha</th>
    <th class="px-1 text-center table-primary">Descrição</th>
    <th class="px-1 text-center table-primary">Horário</th>
    <th class="px-1 text-center table-primary">Endereço</th>
    <th class="px-1 text-center table-primary">Site</th>
    <th class="px-1 text-center table-warning">Ações</th>
    
  </tr>
  
  <c:forEach items="${restaurantes}" var="restaurante">
  <tr>
    <td class="px-2">${restaurante.id}</td>
    <td class="px-2">${restaurante.nome}</td>
    <td class="px-2">${restaurante.avaliacao}</td>
    <td class="px-2">${restaurante.tipoCozinha}</td>
    <td class="px-2">${restaurante.descricao}</td>
    <td class="px-2">${restaurante.horarioFuncionamento}</td>
    <td class="px-2">${restaurante.localizacao}</td>
    <td class="px-2">${restaurante.site}</td>
    <td class="px-2">
    	<a class="btn my-2 btn-danger" href="/MeuMVC/removeRestaurante?id=${restaurante.id}">Excluir </a>
    </td>
  </tr>
  </c:forEach>
</table>

<a  class=" my-3 btn btn-primary" href="http://localhost:8080//MeuMVC/novoRestauranteCriado.jsp">Cadastrar novo restaurante</a>

</main>
 <!-- Optional JavaScript; choose one of the two! -->

  <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous">
  </script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous">	
</body>
</html>