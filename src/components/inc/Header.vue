<script setup>
    
</script>

<template>
    <header  class="n-header">
        <h1>Rland</h1>

        <nav>
            <h1 class="d:none">메인메뉴</h1>
            <ul>
                <!-- <li><a href=""></a></li> -->
                <li><RouterLink class="icon icon:house d:none md:d:inline-block mr:1" to="/index">home</RouterLink></li>
                <li><RouterLink class="icon icon:list md:d:none mr:1" to="/menu/list">메뉴</RouterLink></li>
                <li><RouterLink class="icon icon:local-cafe d:none md:d:inline-block mr:1" to="/menu/list">메뉴</RouterLink></li>
                <li><RouterLink class="icon icon:user d:none md:d:inline-block mr:1" to="/admin">관리자</RouterLink></li>
            </ul>
        </nav>
    </header>
</template>