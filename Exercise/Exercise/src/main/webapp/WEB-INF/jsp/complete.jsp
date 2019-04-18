<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Thanks for Signing up ${fileLocation}</h1>
<c:if test="${not empty loginuser}">
    	<h2>User: ${loginuser.userName}</h2>
    </c:if>
</body>
</html>