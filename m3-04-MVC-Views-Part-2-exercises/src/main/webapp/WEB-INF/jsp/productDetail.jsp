<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
<c:param name="detailPage" value="something"/>
<c:param name="pageTitle" value="Product Detail"/>
</c:import>

    <section id="main-content">
    
    <div class="container" >
   <img src="img/${product.imageName}" />
   
   <div class="details">
   <p class="detail-name">${product.name}</p>
   
   <c:if test="${product.topSeller==true}">
	<p class="detail-bestSeller">BEST SELLER!</p>
</c:if>
<p class="manufacture">by ${product.manufacturer}</p>
<img class="detail-starImg"
						src="img/<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" />-star.png" />
						
	<p class="detail-price">Price: $${product.price}</p>
	<p class="detail-weight"><b>Weight</b> ${product.weightInLbs}lbs</p>
	<p class="detail-description"><b>Description: </b>${product.description}</p>
</div>
</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />