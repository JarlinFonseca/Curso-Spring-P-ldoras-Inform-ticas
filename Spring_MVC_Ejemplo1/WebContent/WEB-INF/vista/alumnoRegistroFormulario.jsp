<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>
	<form:form action="procesarFormulario" modelAttribute="alumno" method="POST">
		<form:label path="nombre">Nombre:</form:label>
		<form:input path="nombre"/> 
		<form:errors path="nombre" style="color:red;"></form:errors>
		<br><br><br>
		
		<form:label path="apellido">Apellido:</form:label>
		<form:input path="apellido"/>
		<form:errors path="apellido" style="color:red;"></form:errors>
		<br><br><br>
		
		
		Edad: <form:input path="edad"/>
		<form:errors path="edad" style="color:red;"></form:errors>
		
		<br><br><br>
		
		Email: <form:input path="email"/>
		<form:errors path="email" style="color:red;"></form:errors>
		
		
		<br><br><br>
		<form:label path="optativa">Asignaturas Optativas:</form:label>
		<form:select path="optativa" multiple="true">
			<form:option value="Dise�o" label="Dise�o"></form:option>
			<form:option value="Karate" label="Karate"></form:option>
			<form:option value="Comercio" label="Comercio"></form:option>
			<form:option value="Danza" label="Danza"></form:option>
		</form:select>
		<form:errors path="optativa" style="color:red;"></form:errors>
		<br><br><br>
		
		
		Barcelona<form:radiobutton path="ciudadEstudios" value="Barcelona"/>
		Madrid<form:radiobutton path="ciudadEstudios" value="Madrid"/>
		Valencia<form:radiobutton path="ciudadEstudios" value="Valencia"/>
		Bilbao<form:radiobutton path="ciudadEstudios" value="Bilbao"/>
		<form:errors path="ciudadEstudios" style="color:red;"></form:errors>
		
		<br><br><br>
		
		Ingl�s<form:checkbox path="idiomasAlumno" value="Ingl�s"/>
		Franc�s<form:checkbox path="idiomasAlumno" value="Franc�s"/>
		Alem�n<form:checkbox path="idiomasAlumno" value="Alem�n"/>
		Mandar�n<form:checkbox path="idiomasAlumno" value="Mandar�n"/>
		<form:errors path="idiomasAlumno" style="color:red;"></form:errors>
		
		<br><br><br>
		
		<input type="submit" value="Enviar">
	
	
	</form:form>

</body>
</html>