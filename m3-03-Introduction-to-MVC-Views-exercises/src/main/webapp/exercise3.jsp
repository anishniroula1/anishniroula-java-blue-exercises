<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		<c:set var = "word" value = "${param.word}"/>
		<c:set var = "count" value = "${param.count}"/>
		
		<c:forEach begin = "1" end = "${param.count}" var="num">
		<c:set var = "cssClass" value="li"/>
		<li class = "${cssClass}" style="font-size:${count-num}px">${word}</li>
		</c:forEach>
		<ul>
		
	
		<%--
		
	
		
		
		Ask user to input name and number
		when name print the number has to decrese in px in CSS ways
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 --%>
		</ul>
		
	</body>
</html>