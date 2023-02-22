<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmación de Registro</title>
</head>
<body>
	<h3>El alumno con nombre ${alumno.nombre}, apellido ${alumno.apellido} y edad ${alumno.edad}, y email ${alumno.email}, se ha registrado con éxito</h3>
	<h4>La asignatura escogida es: ${alumno.optativa}</h4>
	<br>
	La ciudad donde iniciará los estudios el alumno <strong>${alumno.nombre}</strong> es: <strong>${alumno.ciudadEstudios}</strong>
	<br>
	Los idiomas escogidos por el alumno son: <strong>${alumno.idiomasAlumno}</strong>
	
	
</body>
</html>