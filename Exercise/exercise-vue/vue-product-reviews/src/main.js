import Vue from 'vue'
import AdminHandle from './components/AdminHandle.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(AdminHandle)
}).$mount('#app')
