import Vue from "vue"
import Router from "vue-router"
import Login from "./views/login.vue"
import Admin from "./views/admin.vue"

Vue.use(Router);
//不论输入什么都变成/login,然后跳转到Login
export default new Router({
    mode: "history",
    base: process.env.BASE_URL,
    routes: [{
        path: "*",
        redirect: "/login",
    },{
        path: "/login",
        component: Login
    },{
        path: "/admin",
        component: Admin
    }]
})
