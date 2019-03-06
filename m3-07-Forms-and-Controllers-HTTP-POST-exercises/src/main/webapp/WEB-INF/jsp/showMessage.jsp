<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  

<!DOCTYPE html>
<html>
	<head>
 	<link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css" />

		<title>Hello Spring MVC</title>
	</head>
	
	<body>
	<h4 id="review">Dummies Review</h4>
	<p id="link"><a href="/mvc-controllers-part2-exercises">Go Back to Submit A Review Again</a></p>

	<c:forEach var="review" items="${reviews}">
	<div class="borderLine">
	
	
	<div class="titlenusername">
	<p style="font-weight:bold;"><c:out value="${review.title}  "/></p>
	<p id="username"><c:out value="(${review.username})"/></p>
	</div>
	<fmt:parseDate var="parsedDate" pattern="yyyy-MM-dd" value="${review.dateSubmitted}"/>
<fmt:formatDate var="formattedDate" type="date" pattern="MM/dd/yyyy" value="${parsedDate}"/>
<c:out value="${formattedDate}"/><br>
<br>
	<c:choose>
	<c:when test="${review.rating == 1}">
	<img src="img/star.png">
	</c:when>
	<c:when test="${review.rating == 2}">
	<img src="img/star.png">
	<img src="img/star.png">
	</c:when>
	<c:when test="${review.rating == 3}">
	<img src="img/star.png">
	<img src="img/star.png">
	<img src="img/star.png">
	</c:when>
	<c:when test="${review.rating == 4}">
	<img src="img/star.png">
	<img src="img/star.png">
	<img src="img/star.png">
	<img src="img/star.png">
	</c:when>
	<c:otherwise>
	<img src="img/star.png">
	<img src="img/star.png">
	<img src="img/star.png">
	<img src="img/star.png">
	<img src="img/star.png">
	</c:otherwise>
	</c:choose>
	<br>
	<br>
	<c:out value="${review.text}"/>
	
	</div>
	</c:forEach>
		
		
	</body>
	
</html>