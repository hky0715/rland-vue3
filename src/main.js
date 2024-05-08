import { createMemoryHistory, createWebHistory, createRouter } from 'vue-router'
import { createApp } from 'vue'

// public/images들을 사용하기 위해서 import함. browser없이 script만으로 실행시키기 위해?
// 전역에서 사용하려면 main에서 import해야함!
import './assets/css/icon.css'

import App from './App.vue'
import Layout from './components/inc/Layout.vue'
import Index from './components/Index.vue'
import MenuList from './components/menu/List.vue'
import MenuDetail from './components/menu/Detail.vue'

import AdminLayout from './components/admin/inc/Layout.vue'
import AdminIndex from './components/admin/Index.vue'

// router를 만듦! 라우터를 사용하는 주체는 vue app임
const router = createRouter({
    history: createWebHistory(),
    routes:[
        // 1. 객체를 둔다. path & component.
        // {path:"/", component:Layout},
        // {path:"/index", component:Index},
        // {path:"/menu/list", component:MenuList},
        // {path:"/menu/detail", component:MenuDetail},

        /* component: 내 페이지에서 달라지지 않는 부분? */
        {path:"/", redirect:"/index", component:Layout, children:[
          {path:"index", component:Index},
          {path:"menu", children:[
            {path:"list", component:MenuList},
            {path:"detail", component:MenuDetail, children:[
              {path:"comment", component:Comment}
            ]}
          ]}  
        ]},
        {path:"/admin", component:AdminLayout, children:[
          {path:"index", component:AdminIndex}
        ]}
        
    ],
  })

// router 장착!
createApp(App)
.use(router)    
.mount('#app')
