<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formulario JSP</title>
</head>
<body>
<h1>Formulario De Accidente</h1><br>
<hr>
<form action="serbletsform" method="post">
	<table>
	
		<tr>
			<td>Nombre Empresa</td><td><input type="text" placeholder="Awakelab" name="nombre" value="${param.nombre}"/></td>
		</tr>
		<tr>
			<td>Fecha Accidente</td><td><input type="date" placeholder="01/06/2020" name="fecha" value="${param.fecha}" /></td>
		</tr>
		<tr>
			<td>ID Empresa</td><td><input type="number" placeholder="6969696969" name="id" value="${param.id}" /></td>
		</tr>
		<tr>
			<td>Tipo De Accidente</td><td><select name="tAccidente" value="${param.tAccidente}" >
			
					 <option>Se saco la chucha</option>
			 		 <option>Le entro una lagaña al ojo</option> 
				 	 <option>Covit-19</option> 
				 	 <option>Se lo pitiaron</option>
				  	 <option>Le quitaron las 15 lukas</option>
				 </select>
			 </td>
		</tr>
	</table>
	<input type="submit" value="enviar formulario">
</form>

	
	
</body>
</html>