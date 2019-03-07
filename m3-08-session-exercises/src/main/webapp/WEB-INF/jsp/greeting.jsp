<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Favorite Things Exercises</h1>
		
		<c:url var="favPage1" value="/favPage1"/>
		<form action="${favPage1}" method="POST">
			<h5>What is you Favorite Color?</h5>
			<input name="color" type="text" required>
			<br>
			<input type="submit" value="Next>>>">
		</form>
	</body>
</html>