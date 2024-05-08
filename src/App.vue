<script setup>
import Header from "./components/inc/Header.vue"
import Layout from "./components/inc/Layout.vue"
</script>

<template>
    
    <RouterView />
</template>

<!-- https://vue-loader-v14.vuejs.org/kr/features/scoped-css.html -->
<style scoped>
    .n-list {
        background-color: red;
    }
</style>