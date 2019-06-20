<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba</title>
<style type="text/css">
.error {
	color: red;
}

table {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

table td {
	border: 1px solid #565454;
	padding: 20px;
}
</style>
</head>
<body>
	<h3>Persons List</h3>
	<c:if test="${!empty listPersons}">
		<table class="tg">
			<tr>
				<th width="80">Person ID</th>
				<th width="120">Person Name</th>
				<th width="120">Person Country</th>
				
			</tr>
			<c:forEach items="${listPersons}" var="person">
				<tr>
					<td>${person.id}</td>
					<td>${person.name}</td>
					
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>