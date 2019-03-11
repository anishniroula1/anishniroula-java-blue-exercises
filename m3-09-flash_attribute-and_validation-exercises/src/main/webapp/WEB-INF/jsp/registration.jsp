<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="New User Registration"/>
<%@include file="common/header.jspf" %>

<style>
.error{
color:red;
}
</style>

<h2>New User Registration</h2>

<c:url var="registration" value="/registration"/>

<form:form action="${registration}" method="POST" modelAttribute="registration">
	<label for="firstName">First Name</label>
<form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error"/>
	
	<label for="lastName">Last Name</label>
	<form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
	
	<label for="email">Email</label>
	<form:input path="email"/>
	<form:errors path="email" cssClass="error"/>
    <form:errors path="emailMatching" cssClass="error"/>
	
	<label for="verifyEmail">Confirm Email</label>
	<form:input path="verifyEmail"/>
	<form:errors path="email" cssClass="error"/>
	
	<label for="password">Password</label>
	<form:password path="password"/>
	<form:errors path="password" cssClass="error"/>
	<form:errors path="passwordMatching" cssClass="error"/>
	
	<label for="verifyPassword">Confirm</label>
	<form:password path="verifyPassword"/>
	<form:errors path="verifyPassword" cssClass="error"/>
	
	<label for="birthDate">Birth Date</label>
	<form:input path="birthDate"/>
	<form:errors path="birthDate" cssClass="error"/>
	
	<label for="numberOfTicket"># of Tickets</label>
	<form:input path="numberOfTicket"/>
	<form:errors path="numberOfTicket" cssClass="error"/>
	
	<input type="submit" value="Submit">
</form:form>



<%@include file="common/footer.jspf" %>
