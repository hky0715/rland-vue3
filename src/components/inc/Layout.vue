<!-- 레이아웃에서 가장 중요한 것은 틀임. 틀=template -->
<!-- 레이아웃에 다른 vue 파일을 붙일때면 script block에서 선언해주고 template에서 tag로 가져다 쓴다-->
<script setup>
import Header from "./Header.vue"
import Footer from "./Footer.vue"
</script>

<template>
    <!-- root Header -->
    <Header />
    <RouterView />
    <Footer />
</template>