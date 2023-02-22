<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmaci�n de Registro</title>
</head>
<body>
	<h3>El alumno con nombre ${alumno.nombre} y apellido ${alumno.apellido} 
	se ha registrado con �xito</h3>
	<h4>La asignatura escogida es: ${alumno.optativa}</h4>
	<br>
	La ciudad donde iniciar� los estudios el alumno <strong>${alumno.nombre}</strong> es: <strong>${alumno.ciudadEstudios}</strong>
	<br>
	Los idiomas escogidos por el alumno son: <strong>${alumno.idiomasAlumno}</strong>
</body>
</html>