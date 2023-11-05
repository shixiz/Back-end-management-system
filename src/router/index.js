import Vue from "vue";
import VueRouter from "vue-router";
Vue.use(VueRouter)

const ly = new VueRouter({
    mode: 'hash',
    routes: [
        {
            name: 'Login',
            path: '/Login',
            component: () => import('@/page/Login.vue')
        },
        {
            name: 'Register',
            path: '/Register',
            component: () => import('@/page/Register.vue')
        },
        {
            name: 'Index',
            path: '/Index',
            component: () => import('@/page/Index.vue')
        },
        {
            name: 'Main',
            path: '/Main',
            component: () => import('@/page/Main.vue'),
            meta: { title: '商品' },
            children: [{
                path: '/List',
                component: () => import('@/page/List.vue'),
            },
            {
                path: '/Home',
                component: () => import('@/page/Home.vue'),
            },
            {
                path: '/Add',
                component: () => import('@/page/Add.vue'),
            },
            {
                path: '/Update',
                component: () => import('@/page/Update.vue')
            }
            ]
        },
        {
            path: '*',
            redirect: '/Login',
        }
    ]
})
export default ly;