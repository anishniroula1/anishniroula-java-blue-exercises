<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Favorite Things Exercises</h1>
		
		<table>
	<tr>
		<th>Favorite Color:</th>
<td><c:out value="${favThings.color}" /></td> 
	</tr>
	<tr>
		<th>Favorite Food:</th>
		<td><c:out value="${favThings.food}" /></td>
	</tr>
	<th>Favorite Season:</th>
		<td><c:out value="${favThings.season}" /></td>
	</tr>
	</body>
</html>