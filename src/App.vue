// options API

{/* <script>
    import {ref} from 'vue'

    export default {
        // composition API를 이렇게 함께 쓸 수 있어!
        setup() {
            let x = 50;    
            return {x}
        },
        data() {
            return {
                // x: 30
            }
        },
        
    }
</script> */}

// composition API
<script setup>
    let x = ref(50);
    let y = 30;

    function btnClickHandler() {
        console.log(x);
    }
</script>

<template>
    <section>
        <!-- 1way binding, 얘는 그냥 x를 첨에 꽂아넣기만 하고.. x의 변화를 감지하지는 못함 -->
        <h1>하하하 {{x}}</h1>
        <div>
            <!-- 2way binding-->
            <input v-model="x">
            <button @click.prevent="btnClickHandler">클릭</button>
        </div>
    </section>
</template>