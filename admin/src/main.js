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

//axios拦截器
axios.interceptors.request.use(function (config) {
  console.log("请求：",config);
  return config;
}, error => {});
axios.interceptors.response.use(function (response) {
  console.log("返回结果：",response);
  return response;
},error => {});

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

// new Vue({
//   router,
//   render: h => h(App),
// }).$mount('#app');

console.log("环境:",process.env.NODE_ENV);