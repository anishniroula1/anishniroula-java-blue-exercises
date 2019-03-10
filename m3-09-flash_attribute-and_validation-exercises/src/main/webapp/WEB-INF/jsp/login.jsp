<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>Login Page</h2>

<c:url var="login" value="/login"/>

<form:form action="${login}" method="POST" modelAttribute="login">
	<label for="email">Email:</label><br>
	<form:input path="email"/>
	<form:errors path="email" cssClass="error"/>
	
	<label for="password">Password:</label><br>
	<form:password path="password" />
	<form:errors path="password" cssClass="error"/><br>
	
	<input type="submit" value="Login">
</form:form>



<%@include file="common/footer.jspf" %>
