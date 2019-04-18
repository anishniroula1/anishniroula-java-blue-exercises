<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/admin/admin-common/admin-header.jsp"/>

<div class="body-main-container">
<div class="edit-vue-form">
<div id="app">
<c:url var="updateWorkout" value="/admin/editworkout"/>

<div class="vue-form">
  <form action="${updateWorkout}" method="POST">
	 <div>
        <label class="label" for="imageName">Image</label>
        <input type="hidden" name="code" value="${workout.code}"/>
		<input type="text" name="imageName" value="${workout.imageName}"/>
      </div>
    <div>
        <label class="label" for="workoutName">Workout Name</label>
        <input type="text" name="workoutName" value="${workout.workoutName}"/>
      </div>
    <div>
        <label class="label" for="instructions">Instructions</label>
        <textarea name="instructions" rows="40" cols="200">${workout.instructions}</textarea>
      </div>
    <div>
       <label class="label" for="videolink">Video Link</label>
        <input type="text" name="videolink" value="${workout.videolink}"/>
      </div>
    <div>
        <label class="label" for="timeLength">Time Duration</label>
        <input type="text" name="timeLength" value="${workout.timeLength}"/>
      </div>
      <div>
        <label class="label" for="bodyLocation">Body Location</label>
        <input type="text" name="bodyLocation" value="${workout.bodyLocation}"/>
      </div>
      <div>
        <label class="label" for="typesOfExercise">Types Of Exercise</label>
       <input type="text" name="typesOfExercise" value="${workout.typesOfExercise}"/>
      </div>
      
      <div>
        <label class="label" for="choiceThatFallUnder">Choice That Fall Under</label>
        <input type="text" name="choiceThatFallUnder" value="${workout.choiceThatFallUnder}"/>
      </div>
      <div>
        <label class="label" for="instructions">Choice That Fall Under</label>
        <c:forEach var="instruction" items="${instructions}">
        <input type="text" name="workoutInstruction" value="${instruction.workoutInstruction}"/>
        </c:forEach>
      </div>
     
        <input type="submit" value="Send Form">
      
  
  </form>
  </div>

 
  </div>
  </div>

<c:import url="/WEB-INF/jsp/admin/admin-common/admin-fotter.jsp"/>
