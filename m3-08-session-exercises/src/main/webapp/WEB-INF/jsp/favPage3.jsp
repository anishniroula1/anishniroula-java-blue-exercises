<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Favorite Things Exercises</h1>
		
		<c:url var="Page3input" value="/Page3input"/>
		<form action="${Page3input}" method="POST">
			<h5>What is you Favorite Season?</h5>
			<input type="radio" name="season" value="Spring">Spring
			<input type="radio" name="season" VALUE="Summer">Summer
			<input type="radio" name="season" value="Fall">Fall
			<input type="radio" name="season" VALUE="Winter">Winter<br>
			<input type="submit" value="Next>>>">
		</form>
	</body>
</html>