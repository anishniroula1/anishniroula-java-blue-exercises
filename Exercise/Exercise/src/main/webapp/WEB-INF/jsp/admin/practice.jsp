<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Product Reviews</title>
   
</head>
<body>
<template>
<div class="main">
<div v-for="review in showListOfWorkout" :key="review.code">
      <ul class="review">
        <li>{{review.workoutName}}</li>
      </ul>
    </div>
    </div>
  
</template>
        </div>
    </div>

    <script src="https://unpkg.com/vue/dist/vue.js"></script>
<script>    
var vueItems = new Vue({
    el: '#vue-test',
    data: {
    	 apiUrl: 'http://localhost:8080/Exercise/api/workout/',
    	    showListOfWorkout: [],
    	    code: ''
    	    };
    	  },
    	  created() {
    	    // load the workout
    	    fetch(this.apiUrl)
    	      .then(response => {
    	        return response.json();
    	      })
    	      .then(showAllworkout => {
    	        this.showListOfWorkout = showAllworkout;
    	      })
    	      .catch(err => console.error(err));
    	  }
});
</script>
</body>
</html>