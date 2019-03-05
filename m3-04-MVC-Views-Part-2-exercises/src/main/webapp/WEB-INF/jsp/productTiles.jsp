<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
<c:param name="pageTitle" value="Product Tiles"/>
</c:import>

    <section id="main-content">
    <h1>Toy Department</h1>
<c:forEach var="product" items="${productList}">

<c:url var="productDetailURL" value="/productDetail">
		<c:param name="productId" value="${product.productId}"/>
		</c:url>


			<div class=tile-toyContainer>
				<a  class="tile-productImg" href="${productDetailURL}"><img src="img/${product.imageName}" /></a>

				<div class="tile-productInfo">
					<a class="tile-name" href="${productDetailURL}"><p>${product.name}</p></a>
				
					<c:if test="${product.topSeller==true}">
						<p class="tile-bestSeller">BEST SELLER!</p>
					</c:if>

					<c:choose>
					<c:when test="${product.remainingStock <= 2}">
					<p>By ${product.manufacturer}</p><p class="tile-stockLeft">Only ${product.remainingStock} left!</p><br>
					</c:when>
					<c:otherwise>
					<p>By ${product.manufacturer}</p><br>
					</c:otherwise>
					</c:choose>
					
					<p class="tile-price">$${product.price}</p>
					<p>Weight ${product.weightInLbs}lbs</p>
					 <img class="tile-starImg"
						src="img/<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" />-star.png" />
				</div>
			</div>

		</c:forEach>

       
	<c:import url="/WEB-INF/jsp/footer.jsp" />