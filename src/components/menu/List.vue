<script setup>
    /*options에서는 model에 있는 모든 data가 react한데...
    composition에서는 그러치않다.........*/
    
    const list = [{},{}];
</script>

<template>
    <div class="n-main">
        <main>
            <section v-for="">
                <h1>메뉴 목록</h1>
                <div class="n-list">
                    <section>
                        <h1>아메리카노</h1>
                        <h2>Americano</h2>
                        <div>가격</div>
                        <div>이미지</div>
                        <div>좋아요 7</div>
                        <!-- inline은 block을 감쌀 수 없는데 a는 다르다-->
                        <div><a href="">담기</a></div>
                    </section>
                </div>
            </section>
        </main>
    </div>
</template>

<style>
</style>