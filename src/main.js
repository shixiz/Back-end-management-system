import Vue from 'vue'
import App from './App.vue'
import { image, Card, Breadcrumb, BreadcrumbItem, Col, RadioGroup, RadioButton, Table, TableColumn, Main, Form, FormItem, Input, Button, Row, Link, Alert, Message, Container, Aside, Menu, Submenu, MenuItemGroup, MenuItem, Header, Dropdown, DropdownItem, DropdownMenu } from 'element-ui';
import router from './router'
import axios from 'axios'
import store from './store';
Vue.prototype.axios = axios
Vue.use(image)
Vue.use(Card)
Vue.use(BreadcrumbItem)
Vue.use(Breadcrumb)
Vue.use(Col)
Vue.use(RadioGroup)
Vue.use(RadioButton)
Vue.use(Table)
Vue.use(TableColumn)
Vue.use(Main)
Vue.use(Form)
Vue.use(FormItem)
Vue.use(Input)
Vue.use(Button)
Vue.use(Row)
Vue.use(Link)
Vue.use(Alert)
Vue.use(Container)
Vue.use(Menu)
Vue.use(Submenu)
Vue.use(Aside)
Vue.use(MenuItemGroup)
Vue.use(MenuItem)
Vue.use(Header)
Vue.use(Dropdown)
Vue.use(DropdownItem)
Vue.use(DropdownMenu)
Vue.prototype.$message = Message;
Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  mounted() {
    Vue.prototype.$bus = this;
  },
  data() {
    return {
      label: "",
      label1: "首页"
    }
  },
  router,
  store
}).$mount('#app')
