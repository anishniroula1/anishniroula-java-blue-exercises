<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Exercise 2 - Fibonacci 25</title>
<style>
li {
	list-style-type: none;
}
</style>
</head>
<body>
	<h1>Exercise 2 - Fibonacci 25</h1>

	<c:set var="currentVal" value="1" />
	<c:set var="previousVal" value="0" />
	<c:forEach begin="1" end="25">
		<c:set var="temp" value="${currentVal}" />
		<c:set var="currentVal" value="${temp + previousVal}" />
		<c:set var="previousVal" value="${temp}" />
		<c:set var="Fibonacci" value ="li"/> 
		<ul>
			<li class = "${Fibonacci}">${currentVal}</li>
		</ul>
	</c:forEach>



	<%--
			a = 0;
			b=1;
			c= 0;
			for(int i = 0; i<25; i++){
			a = b;
			b=c;
			c = a + b;
			}
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>

</body>
</html>