<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Favorite Things Exercises</h1>
		
		<c:url var="Page2input" value="/Page2input"/>
		<form action="${Page2input}" method="POST">
			<h5>What is you Favorite Food?</h5>
			<input name="food" type="text" required><br>
			<input type="submit" value="Next>>>">
		</form>
	</body>
</html>