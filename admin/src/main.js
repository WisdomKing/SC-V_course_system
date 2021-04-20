import Vue from 'vue'
import $ from 'jquery'
import App from './app.vue'
import router from './router'
import axios from 'axios'
import filter from './filter/filter'
import FullCalendar from 'vue-full-calendar'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.config.productionTip = false;
Vue.prototype.$ajax=axios;
Vue.use(FullCalendar);
Vue.use(ElementUI);

// 解决每次ajax请求，对应的sessionId不一致的问题
axios.defaults.withCredentials = true;

/**
 * axios拦截器
 */
axios.interceptors.request.use(function (config) {
  console.log("请求：", config);
  let token = Tool.getLoginUser().token;
  if (Tool.isNotEmpty(token)) {
    config.headers.token = token;
    console.log("请求headers增加token:", token);
  }
  return config;
}, error => {});
axios.interceptors.response.use(function (response) {
  console.log("返回结果：", response);
  return response;
}, error => {});

// 全局过滤器
Object.keys(filter).forEach(key => {
  Vue.filter(key, filter[key])
});
// 在Vue构造函数时，需要配置一个el属性，如果没有没有el属性时，可以使用.$mount('#app')进行挂载。
new Vue({
  el:"#app",
  router,
  render: h => h(App),
});

// // 路由跳转之前拦截
router.beforeEach((to, from, next) => {
  // 要不要对meta.loginRequire属性做监控拦截
  if (to.matched.some(function (item) {
    return item.meta.loginRequire
  })) {
    let loginUser = Tool.getLoginUser();
    if (Tool.isEmpty(loginUser)) {
      next('/login');
    } else {
      next();
    }
  } else {
    next();
  }
});

// new Vue({
//   router,
//   render: h => h(App),
// }).$mount('#app');

console.log("环境:",process.env.NODE_ENV);