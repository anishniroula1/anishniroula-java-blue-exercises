
<script>
import TodoList from './components/TodoList';
export default {
  components: {
  TodoList
}
}

</script>

<style>

</style>

<template>
  <div id="todo-app">
    <todo-list></todo-list>
  </div>
</template>

<script>


export default {
  name: 'app',
  components: {
   
  }
}
</script>

<style>
body {
background: rgb(74,162,244);
background: radial-gradient(circle, rgba(74,162,244,1) 0%, rgba(54,131,240,1) 100%);}
</style>
