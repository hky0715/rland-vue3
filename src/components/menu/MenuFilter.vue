<script setup>
import { reactive, onMounted } from 'vue';

const model = reactive({
        list:[],
        count:0
    });

   // ----------------------- life cycle handler -------------------------------------------------
    
   onMounted(()=> {        
        // boot로 띄운 서버의 api를 가져오고 싶음
        // let response = await fetch("http://localhost:8080/menus")
        // list = await response.json();


        fetch("http://localhost:8080/categories")
        .then((resp)=>resp.json())
        .then((json)=>{
            model.list = json;
        });
    })


</script>
<template>
    <section class="menu-filter">
                    <h1>Rland Menu<span class="d:none">검색</span></h1>
            
                    <nav class="category-filter">              
                        
                        <h1 class="d:none">카테고리 검색 메뉴 목록</h1>
                        <ul>
                            <li><a class="sm:deco md:deco sm:icon-filter_list" href="list">전체메뉴</a></li>
                            <li v-for="m of model.list" :key="m"> <a class="d:none md:d:inline current" v-bind:href="`?c=${m.id}`">{{ m.name }}</a></li>
                        </ul>
                    </nav>
                    <section class="query-filter" id="query-form">
                        <h1 class="d:none">이름 검색 폼</h1>
                        <form action="list" method="get">
                            <fieldset>
                                <legend class="d:none">이름 검색</legend>
                                <input class="query-input" type="text" placeholder="메뉴 검색" name="q" value="">
                                <button class="icon icon-find">검색</button>
                            </fieldset>
                        </form>
                    </section>
                </section>
</template>


<style scoped>
    @import url(@/assets/css/menu/menu-filter.css);
</style>