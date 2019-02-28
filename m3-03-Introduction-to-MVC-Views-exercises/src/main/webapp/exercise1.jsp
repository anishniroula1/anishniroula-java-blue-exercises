<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		
		<c:forEach begin = "1" end= "100" var= "num" >
			<ul>
		<c:choose>
		<c:when test = "${num % 3==0 && num % 5==0 }">
				<c:set var = "fizzBuzz" value="fizzbuzz"/>
					<li class="${fizzBuzz}">FizzBuzz!</li>
			</c:when>
			<c:when test="${num % 3==0}">
				<c:set var = "fizzbuzz" value ="fizz"/>
				<li class="${fizzbuzz}">Fizz!</li>
			</c:when>
			<c:when test = "${num % 5==0}">
				<c:set var = "fizzbuzz" value = "buzz"/>
					<li class="${fizzbuzz}">Buzz!</li>
			</c:when>
			
			<c:otherwise>
			<c:set var="fizzbuzz" value=""/>
			<li class= "${fizzbuzz}">${num}</li>
			</c:otherwise>
		
		</c:choose>
		 </ul>
		</c:forEach>
	
			
		
	</body>
</html>