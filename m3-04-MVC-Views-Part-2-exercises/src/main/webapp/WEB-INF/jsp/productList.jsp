<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
<c:param name="pageTitle" value="Product List" />
</c:import>


	<section id="main-content">
		<h1>Toy Department</h1>

		<c:forEach var="product" items="${productList}">
		
		<c:set var="description" value="${product.description}"/>
		
		<c:url var="productDetailURL" value="/productDetail">
		<c:param name="productId" value="${product.productId}"/>
		</c:url>
		
			<div class=toyContainer>
				<a  class="productImg" href="${productDetailURL}"><img src="img/${product.imageName}" /></a>
				<div class="productInfo">
					
				<p class="name"><a href="${productDetailURL}">${product.name}</a></p>
				
				
					<c:if test="${product.topSeller==true}">
						<p class="bestSeller">BEST SELLER!</p>
					</c:if>
					
					
					<p>by ${product.manufacturer}</p>
					
					<c:if test="${product.remainingStock <= 2}">
					<p class="stockLeft">Only ${product.remainingStock} left!</p>
					</c:if>
					
					<p class="price">$${product.price}</p>
					<p>Weight ${product.weightInLbs}lbs</p>
					 <img class="starImg"
						src="img/<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" />-star.png" />
				</div>
			</div>

		</c:forEach>


<c:import url="/WEB-INF/jsp/footer.jsp" />