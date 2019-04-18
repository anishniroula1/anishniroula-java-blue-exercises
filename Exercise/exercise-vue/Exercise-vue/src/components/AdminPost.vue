<template>
  <div class="body-main-container">
    <div id="app">
      <div class="vue-form">
        <div>
          <label class="label">Image Name</label>
          <input type="text" v-model="workoutPost.imageName">
        </div>
        <div>
          <label class="label">Workout Name</label>
          <input type="text" v-model="workoutPost.workoutName">
        </div>
        <div>
          <label class="label">Instructions</label>
          <textarea v-model="workoutPost.instructions" rows="5" cols="30"></textarea>
        </div>
        <div>
          <label class="label">Video Link</label>
          <input type="text" v-model="workoutPost.videolink">
        </div>
        <div>
          <label class="label">Time Length</label>
          <input type="text" v-model="workoutPost.timeLength">
        </div>
        <div>
          <label class="label">Body Location</label>
          <input type="text" v-model="workoutPost.bodyLocation">
        </div>
        <div>
          <label class="label">Typers Of Exercise</label>
          <input type="text" v-model="workoutPost.typesOfExercise">
        </div>
        <div>
          <label class="label">Choice That Fall Under</label>
          <input type="text" v-model="workoutPost.choiceThatFallUnder">
        </div>
        <button :disabled="!isValidForm" v-on:click="createWorkout">Submit Workout</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    apiUrl: String
  },
  data() {
    return {
      workoutPost: {
        imageName: "",
        workoutName: "",
        instructions: "",
        videolink: "",
        timeLength: "",
        bodyLocation: "",
        typesOfExercise: "",
        choiceThatFallUnder: ""
      }
    };
  },
  computed:{
    isValidForm(){
      if(this.workoutPost.imageName != '' && this.workoutPost.workoutName !='' &&
      this.workoutPost.instructions != '' && this.workoutPost.videolink !='' &&
      this.workoutPost.timeLength != '' && this.workoutPost.bodyLocation != ''&&
      this.workoutPost.typesOfExercise !='' && this.workoutPost.choiceThatFallUnder !=''){
        return true;
      } 
      else{
        return false;
      }
    }
  },
  methods: {
    createWorkout() {
      fetch(this.apiUrl, {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(this.workoutPost)
      })
        .then(response => {
          if (response.ok) {
            console.log("Done");
          }
        })
        .catch(err => {
          console.error(err);
        });
    }
  }
};
</script>

<style>
</style>

