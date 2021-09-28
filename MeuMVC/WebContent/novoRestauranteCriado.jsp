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
<title>Inserir restaurante</title>
</head>
<body>
	<main class="container my-5 ">
		<form action="/MeuMVC/novoRestaurante" method="post">
			<h1>Cadastro de Restaurante</h1>
			
			<div class="row my-3">
  				<div class="col-sm-12 col-md-4">
  					<label class="form-label">ID</label>
    				<input class="form-control" type="number" name="id">
 				</div>
  				<div class="col-sm-12 col-md-4">
  					<label class="form-label" >Nome</label>
   				 	<input class="form-control type="text" name="nome">
  				</div>
  				<div class="col-12 col-md-4">
  					<label class="form-label" >Nota</label>
					<select name="nota" class="form-select form-control">
  					<option selected></option>
  					<option value="1">1</option>
  					<option value="2">2</option>
  					<option value="3">3</option>
  					<option value="3">4</option>
  					<option value="3">5</option>
					</select>
  				</div>
			</div>
			<div class="row">
 				<div class="col-12 col-md-6">
   				<label class="form-label">Tipo de cozinha</label>
			    <input class="form-control type="text" name="tipoCozinha">
 				</div>
  				<div class="col-12 col-md-6">
    			<label class="form-label">Horário de Funcionamento</label>
				<input class="form-control type="text" name="horarioFuncionamento">
  			</div>
		  </div>
		  <div class="row">
  		    <div class="col-12 col-md-6">
           	<label class="form-label">Endereço</label>
			<input class="form-control type="text" name="localizacao">
            </div>
            <div class="col-12 col-md-6">
            <label class="form-label">Site</label>
			<input class="form-control type="text" name="site">
          </div>
         </div>
         <div class="row">
		  <div class="col">
		  <label class="form-label">Descrição</label>
		   <textarea class="form-control" name="descricao" ></textarea>
		  </div>
		 </div>
			<button type="submit" class="btn btn-primary my-2">Cadastrar</button>
		</form>
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