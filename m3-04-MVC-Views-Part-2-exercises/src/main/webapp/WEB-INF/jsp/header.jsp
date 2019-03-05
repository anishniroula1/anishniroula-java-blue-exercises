<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width" />
<c:url value="/css/site.css" var="cssURL" />
<link rel="stylesheet" type="text/css" href="${cssURL}">
<title>${param.pageTitle}</title>
</head>

<body>
	<c:url value="/productList" var="productList" />
	<c:url value="/productTiles" var="productTiles" />
	<c:url value="/productTable" var="productTable" />
	
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>
        <h1><c:out value="${param.detailPage}"/></h1>    
            
    </header>
    <nav>
        <ul>
            <li><a href="${productList}">Product List</a></li>
            <li><a href="${productTiles}">Product Tiles</a></li>
            <li><a href="${productTable}">Product Table</a></li>
        </ul>
        
    </nav>
    
    <h1 style="visibility: hidden;"><c:out value="${param.pageTitle}" /></h1>