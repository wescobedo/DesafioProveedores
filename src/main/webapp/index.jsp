<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Proveedores</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link
	href="//cdn.datatables.net/2.0.8/css/dataTables.dataTables.min.css"
	rel="stylesheet">


</head>
<body>
    
    
    <div class="container">
		<h1>Listado de Proveedores</h1>

		<a href="${pageContext.request.contextPath}/actorDetails"
			class="btn btn-primary">Nuevo</a>

		<table class="table" id="tblproveedores">
			<thead class="table-dark">
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Rut</th>
					<th>Direccion</th>
					<th>Correo</th>
					<th>Telefono</th>
					<th>Contacto</th>
					<th>Telefono contacto</th>
					
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${proveedores}">
					<tr>
						<th><c:out value="${a.getId()}"></c:out></th>
						<td><c:out value="${a.getNombre()}"></c:out></td>
						<td><c:out value="${a.getRut()}"></c:out></td>
						<td><c:out value="${a.getDireccion()}"></c:out></td>
						<td><c:out value="${a.getCorreo()}"></c:out></td>
						<td><c:out value="${a.getTelefono()}"></c:out></td>
						<td><c:out value="${a.getContacto()}"></c:out></td>
						<td><c:out value="${a.getTelefonocontacto()}"></c:out></td>
						
						<h3>entro al c for each</h3> 
					</tr>
				</c:forEach>
				
				
						<h3>salio del c for each</h3> 
			</tbody>
		</table>
	</div>
    
    <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>

	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>

	<script src="https://cdn.datatables.net/2.0.8/js/dataTables.min.js"></script>

	<script>
		$(document).ready(()=>{
			$('#tblproveedores').DataTable();
		})
	</script>

	<script src="https://kit.fontawesome.com/81a2ed02b0.js"
		crossorigin="anonymous"></script>
    
</body>
</html>


