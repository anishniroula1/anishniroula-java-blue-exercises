<template>
  <div class="main">
        <h2>Welcome to Admin Dashboard</h2>
      <admin-post
        :apiUrl="apiUrl"/>
    <div v-for="review in showListOfWorkout" :key="review.code">
      <ul class="review">
        <li>{{review.workoutName}}</li>
      </ul>
    </div>
  </div>
</template>

<script>
import AdminPost from "@/components/AdminPost"
export default {
    components: {
        AdminPost
    },
  data() {
    return {
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
};
</script>

<style scoped>

</style>

