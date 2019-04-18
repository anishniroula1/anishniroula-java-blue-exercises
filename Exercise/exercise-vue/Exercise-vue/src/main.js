import Vue from 'vue'
import admin from './admin.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(admin)
}).$mount('#app')
