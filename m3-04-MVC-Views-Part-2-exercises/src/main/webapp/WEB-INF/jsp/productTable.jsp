<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
<c:param name="pageTitle" value="Product Table"/>
</c:import>

<section id="main-content">
	<h1>Toy Department</h1>
<div id="table-container">
	<table>
		<tr>
			<td><c:forEach var="product" items="${productList}">
				<c:url var="productDetailURL" value="/productDetail">
		<c:param name="productId" value="${product.productId}"/>
		</c:url>	
					
					<c:choose>
						<c:when test="${product.topSeller==true}">
							<td><a  class="productImg" href="${productDetailURL}"><img src="img/${product.imageName}" /></a><br>
							<p id=table-bestSeller>BEST SELLER!</p>
								</td>
						</c:when>
						<c:otherwise>
							<td><a  class="productImg" href="${productDetailURL}"><img src="img/${product.imageName}" /></a></td>
						</c:otherwise>
					</c:choose>
					
				</c:forEach></td>
		</tr>

		<tr id="fixHeight">
			<td >Name<c:forEach var="product" items="${productList}">
					
							<td id="fixMargin"><p id="table-name">${product.name}</p></td>
						
				</c:forEach></td>
		</tr>

		<tr id="fixHeight">
			<td>Rating<c:forEach var="product" items="${productList}">
					<td><img id="table-starImg"
						src="img/<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.averageRating}" />-star.png" /></td>
				</c:forEach></td>
		</tr>


		<tr id="fixHeight">
			<td >Mfr<c:forEach var="product" items="${productList}">
					<td id="fixMargin"><p>By ${product.manufacturer}</p></td>
				</c:forEach></td>
		</tr>

		<tr id="fixHeight">
			<td>Price<c:forEach var="product" items="${productList}">
					<td><p class="price">$${product.price}</p></td>
				</c:forEach></td>
		</tr>

		<tr id="fixHeight">
			<td >wt.(in lbs)<c:forEach var="product" items="${productList}">
					<td id="fixMargin"><p>
							<fmt:formatNumber type="number" maxFractionDigits="0"
								value="${product.weightInLbs}" />
						</p></td>
				</c:forEach></td>
		</tr>




	</table>
</div>

	<c:import url="/WEB-INF/jsp/footer.jsp" />