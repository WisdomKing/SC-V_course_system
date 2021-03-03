import Vue from "vue"
import Router from "vue-router"
import Login from "./views/login.vue"
import Admin from "./views/admin.vue"
import Welcome from "./views/admin/welcome.vue"
import Announcement from "./views/admin/announcement.vue"
import Headline from "./views/admin/headline.vue"
import Companyinfo from "./views/admin/companyinfo.vue"
import Clockin from "./views/admin/clockin.vue"
import Askforleave from "./views/admin/askforleave.vue"
import Personalinfo from "./views/admin/personalinfo.vue"
import Employeeinfo from "./views/admin/employeeinfo.vue"

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
        path: "/",
        name: "admin",
        component: Admin,
        children:[{
            path: "welcome",
            name: "welcome",
            component: Welcome
        },{
            path: "business/announcement",
            name: "business/announcement",
            component: Announcement
        },{
            path: "business/headline",
            name: "business/headline",
            component: Headline
        },{
            path: "business/companyinfo",
            name: "business/companyinfo",
            component: Companyinfo
        },{
            path: "business/clockin",
            name: "business/clockin",
            component: Clockin
        },{
            path: "business/askforleave",
            name: "business/askforleave",
            component: Askforleave
        },{
            path: "business/personalinfo",
            name: "business/personalinfo",
            component: Personalinfo
        },{
            path: "business/employeeinfo",
            name: "business/employeeinfo",
            component: Employeeinfo
        }]
    }]
})