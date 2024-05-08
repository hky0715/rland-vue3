<script setup>  
    import BasketStatus from "./BasketStatus.vue"
    import MenuFilter from "./MenuFilter.vue"
    import Pager from "../inc/Pager.vue"
    
    const list = [{},{}];
</script>

<template>
    <main>
        <section class="menu-list">
        <h1 class="d:none">메뉴 검색 목록</h1>
            <div>
                <!--------------------- MenuFilter 영역 -------------------->
                <MenuFilter />

                <!-- ------------------------------------------------------ -->

                <section class="menu-card-list" id="menu-card-list">
                    <h1 class="d:none">메뉴 목록</h1>
                    <div class="content fade">
                        <section class="menu-card" v-for="m of list" :key="m">
                            <h1>
                                <a class="heading-3" href="detail.html">카페라떼1</a></h1>
                            <h2 class="heading-2 font-weight:normal color:base-5">Cafe Latte</h2>
                            <div class="price-block d:flex align-items:flex-end"><span class="font-weight:bold">4,500</span>원<span class="soldout-msg ml:auto mr:auto md:d:none">SOLD OUT</span></div>
                            <div class="img-block">
                                <a href="detail.html?id=1">
                                    <img src="" />                                      
                                </a>
                            </div>
                            <div class="like-block d:flex justify-content:flex-end">
                                <a class="icon icon-heart icon-color:base-4" href="">좋아요</a>
                                <span class="font-weight:bold ml:1">2</span>                                
                            </div>
                            <div>
                                <button>삭제</button>
                            </div>
                            <div class="pay-block d:flex">
                                <!-- <a class="icon md:icon:none icon-cart icon-color:base-0 color:base-0 btn-type:icon btn-cart md:btn-type:text" href="">담기</a> -->
                                <form action="/cart/add-menu" method="post">
                                    <input type="hidden" name="id">
                                    
                                    <button                                                                             
                                        class="icon md:icon:none icon-cart icon-color:base-0 color:base-0 btn-type:icon btn-cart md:btn-type:text">
                                        담기
                                    </button>
                                </form>
                                <a class="icon md:icon:none icon-card icon-color:base-0 color:base-0 btn-type:icon btn-card md:btn-type:text" href="">주문하기</a>
                            </div>
                        </section>                        
                    </div>
                </section>
            </div>
        </section>

    <!--------------------------- pager 영역 -------------------------->
    <Pager />

    <!----------------------- basket-status 영역 ---------------------->
    <BasketStatus />
    </main>
</template>

<!-- css의 독립화 쿄쿄 -->
<style scoped>
    @import url(@/assets/css/menu/card.css);
    @import url(@/assets/css/menu/list.css);
    @import url(@/assets/css/menu/rcmd-menu-list.css);

</style>