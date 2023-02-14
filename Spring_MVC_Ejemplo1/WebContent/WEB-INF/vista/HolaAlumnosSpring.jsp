<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Respuesta de Formulario</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/miestilo.css">
</head>
<body>
<h1>
Hola ${param.nombreAlumno}. Bienvenido al curso de Spring!
</h1>

<br>
<h2>Atención a todos</h2>
<p>${mensajeClaro}</p>

<img alt="foto" src="${pageContext.request.contextPath}/recursos/images/spring.png">

</body>
</html>