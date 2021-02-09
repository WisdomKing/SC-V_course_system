import Vue from 'vue'
import $ from 'jquery'
import App from './app.vue'
import router from './router'

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
