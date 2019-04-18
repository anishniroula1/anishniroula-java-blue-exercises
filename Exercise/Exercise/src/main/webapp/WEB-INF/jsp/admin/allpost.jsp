<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/admin/admin-common/admin-header.jsp"/>

<div class="body-main-container">

<c:url var="deletePost" value="/admin/allpost"/>
<c:url var="addPost" value="/admin/adminpost"/>

<table class="table-container">
	<thead>
		<tr>
			
			<th><h1>Workout Name</h1></th>
			<th><h1>Body Location</h1></th>
			<th><h1>Edit</h1></th>
			<th><h1>Delete</h1></th>
			<th><a href="${addPost}"><button>Add Post</button></a></th>
		</tr>
	</thead>
	<tbody>
		
		<c:forEach var="workout" items="${wokoutList}">
		<tr>
			<c:url var="workoutCode" value="/admin/editworkout">
				<c:param name="code" value="${workout.code}" />
			</c:url>
			
			<td><a href="${workoutCode}">${workout.workoutName}</a></td>
			
			<td>${workout.bodyLocation}</td>
			
			<td><a href="${workoutCode}"><button>Edit</button></a></td>
			
			<td><form action="${deletePost}" method="POST">
			<input type="hidden" name="code" value="${workout.code}"/>
			<button class="table-delete-button" type="submit">Delete</button>
			</form></td>
			</tr>
			</c:forEach>
	</tbody>
</table>
	
	
	
	

	
<c:import url="/WEB-INF/jsp/admin/admin-common/admin-fotter.jsp"/>
	