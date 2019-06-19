<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Productos</title>
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

		
		<h2>Listado Categorias</h2>
		<table>
			<tr>
				<td><strong>Id</strong></td>
				<td><strong>Categoria</strong></td>
			</tr>
			<c:forEach items="${list}" var="cate">
				<tr>
					<td>${cate.id}</td>
					<td>${cate.nombre}</td>
				</tr>
			</c:forEach>
		</table>
		<!-- 		<h1>Input Form</h1> -->
<%-- 		<form:form action="addCategoria" method="post" modelAttribute="categoria"> --%>
<!-- 			<table> -->
<!-- 				<tr> -->
<!-- 					<td>Name</td> -->
<!-- 					<td> -->
<%-- 						<form:input path="name" /> <br /> --%>
<%-- 						<form:errors path="name" cssClass="error" /> --%>
<!-- 					</td> -->
<!-- 				</tr> -->
				
<!-- 				<tr> -->
<!-- 					<td colspan="2"><button type="submit">Submit</button></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->
<%-- 		</form:form> --%>
	</body>
</html>