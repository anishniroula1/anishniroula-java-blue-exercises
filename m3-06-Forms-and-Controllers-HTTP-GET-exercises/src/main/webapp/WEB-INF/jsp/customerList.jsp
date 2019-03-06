<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url var="customerSearch" value="/customerSearch" />

<form action="${customerSearch}" method="GET">
<input type="text" name="search" />

<label for="sort">Sort:</label>
<select name="sort" id="sort">
<option value="first_name">First Name</option>
<option value="last_name">Last Name</option>
<option value="email">Email</option>
<option value="activebool">Active</option>
</select>
<input type="submit" value="search">
</form>

<table class="table">
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Active</th>
  </tr>
  <c:forEach var="customer" items="${customers}">
  <tr>
  <td><c:out value="${customer.firstName}"/><c:out value=" ${customer.lastName}"/>
  <td><c:out value="${customer.email}"/>
  
  <c:choose>
  <c:when test="${customer.active == true }">
  <c:set var="yes" value="Yes" />
  <td><c:out value="${yes}"/>
  </c:when>
  <c:otherwise>
  <c:set var="no" value="No" />
  <td><c:out value="${no}"/>
  </c:otherwise>
  </c:choose>
  
  
  </tr>
  </c:forEach>
</table>

<%@include file="common/footer.jspf"%>