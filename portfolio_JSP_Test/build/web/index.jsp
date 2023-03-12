<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
	<link rel="stylesheet" href="main.css">
	<title>CRUD</title>
</head>
<body>
	<h1>Datos</h1>
	<form action="SvPersona" method="POST">
		<p><label for="">Nombre:</label><input type="text" name="nombre"></p>
		<p><label for="">Apellido:</label><input type="text" name="apellido"></p>
		<p><label for="">Telefono:</label><input type="text" name="telefono"></p>
		<button type="submit">Subir</button>
	</form>

	<h1>Ver Lista de Personas</h1>
	<p>Si desea ver toda la lista de personas haga click en mostar personas</p>
	<form action="SvPersona" method="GET">
		<button type="submit">Mostrar Personas</button>
	</form>

	<h1>Eliminar Personas</h1>
	<p>Ingrese el nombre de la persona a eliminar</p>
	<form action="" method="">
		<p><label for="">nombre:</label><input type="text" name="dni_delete"></p>
		<button type="submit">Eliminar</button>
	</form>

	<!--Javascript importing of the bootstrap framework -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin= "anonymous"></script>
</body>
</html>