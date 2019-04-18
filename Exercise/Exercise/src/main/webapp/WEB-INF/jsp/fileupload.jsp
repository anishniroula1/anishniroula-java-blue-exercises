<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta charset="UTF-8">
<title>Upload File Here</title>
</head>
<body>
<h2>Upload File Here</h2>
<c:url var="fileUpload" value="/fileupload"/>

<c:if test="${not empty loginuser}">
    	<h2>User: ${loginuser.userName}</h2>
    </c:if>
User: ${loginuser.userName}</h2>
 <form method="POST" action="${fileUpload}" enctype="multipart/form-data">
    File Name: <input type="text" name="name" />
    
    File to upload: <input type="file" name="file" multiple/>
    <input type="hidden" name="userName" value="${loginuser.userName}">
    <br />
    <input type="submit" value="Upload">
</form>

<c:if test="${not empty message}">
    ${message} 
</c:if>
</body>
</html>