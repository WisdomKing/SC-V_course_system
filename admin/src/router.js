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
import Department from "./views/admin/department.vue"
import Project from "./views/admin/project.vue"
import Test from "./views/admin/test.vue"
import User from "./views/admin/user.vue"
// import Role from "./views/admin/role.vue"
import File from "./views/admin/file.vue"

import Calendar from "./views/admin/calendar.vue"

Vue.use(Router);
//不论输入什么都变成/login,然后跳转到Login
export default new Router({
    mode: "history",
    base: process.env.BASE_URL,
    routes: [{
        path: "*",
        redirect: "/login",
    },{
        path: "",
        component: Login
    },{
        path: "/login",
        component: Login
    },{
        path: "/",
        name: "admin",
        component: Admin,
        meta: {
            loginRequire: true
        },
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
        },{
            path: "business/calendar",
            name: "business/calendar",
            component: Calendar
        },{
            path: "business/department",
            name: "business/department",
            component: Department
        },{
            path: "business/project",
            name: "business/project",
            component: Project
        },{
            path: "business/test",
            name: "business/test",
            component: Test
        },{
            path: "business/file",
            name: "business/file",
            component: File
        },{
            path: "system/user",
            name: "system/user",
            component: User
        }]
    }]
})