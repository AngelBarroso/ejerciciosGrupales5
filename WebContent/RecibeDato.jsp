<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
tiva JSTL
XHTML
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<from action="serbletsform" method="post">
	<table>
		<tr>
			<td><h3>Nombre empresa: <c:out value="${nombreE}"/></h3></td>
		</tr>
		<tr>
			<td>Fecha Accidente:<input type="text" value="<c:out value="${fechaA}"/>"/></td>
		</tr>
		<tr>
			<td>ID Empresa:<input type="text" value="<c:out value="${idC}"/>"/></td>
		</tr>
		<tr>
			<td>Tipo de Accidente:<input type="text" value="<c:out value="${accidenteT}"/>"/></td>
		</tr>
	</table>

</body>
</html>