<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
	<link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css" />
		<title>Hello Spring MVC</title>
	</head>
	
	<div class="wholebody">
	<body>
	<h4 id="titlehead">Squirrel Cigar Parties for Dummies Review</h4>
	<img alt="dummiesBook" src="img/forDummies.png">
	
	<c:url var="postMessage" value="/postMessage"/>
		<form action="${postMessage}" method="post">
		
		<label class="rsubmit" for="username">Username: </label>
		<input id="userText" name="username" type="text">
		<br>
		
		<div class="rattingRadio">
		<label id="rating" for="rating">Rating:</label><br>
		<div class="radio">
		<input type="radio" name="rating" value="1">1
		<input type="radio" name="rating" value="2">2
		<input type="radio" name="rating" value="3">3
		<input type="radio" name="rating" value="4">4
		<input type="radio" name="rating" value="5">5
		</div>
		</div>
		<label for="title">Title: </label>
		<input id="title" name="title" type="text">
		<br>
		
		<label for="text">Text: </label>
		<input id="text" name="text" type="text">
		<br>
		
		<input id="rsubmit" type="submit" value="Submit">
		
		</form>
		
	</body>
	
	</div>
</html>