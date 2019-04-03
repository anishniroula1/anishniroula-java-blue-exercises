<template>
    <div class="search">
        
        <input v-on:keyup="handleFilter" type="text" id="search" name="search" v-model="searchText" placeholder="Search Todo's..."/>

    </div>
</template>

<script>
export default {
    data(){
        return{
            searchText: ''
        }
    },
    methods: {
        handleFilter(){
            this.$emit('filter', this.searchText);
        }

    }
}
</script>

<style>
#search {
    width:100%;
    font-size:24px;
    font-family: 'Roboto Condensed', sans-serif;
    padding:10px;
}

</style>