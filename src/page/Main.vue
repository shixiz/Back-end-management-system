<template>
  <el-container>
    <el-aside :width="isCollapse ? 'auto' : '200px'">
      <Aside></Aside>
    </el-aside>
    <el-container>
      <el-header>
        <Header></Header>
      </el-header>
      <el-main><router-view></router-view></el-main>
    </el-container>
  </el-container>
</template>
  <script>
import Aside from "../components/Aside.vue";
import Header from "../components/Header.vue";
export default {
  name: "Main",
  components: { Aside, Header },
  data() {
    return {};
  },
  methods: {},
  computed: {
    // 无子菜单
    isCollapse() {
      return this.$store.state.tab.isCollapse;
    },
  },
};
</script>
    
    <style>
.el-container {
  height: 100vh;
}
.el-header {
  background-color: white;
  color: #333;
  border-bottom: 1px solid lightgray;
  padding: 0;
}
.el-aside {
  color: #333;
  height: 100vh;
  transition: width 0.15s;
  -webkit-transition: width 0.15s;
  -moz-transition: width 0.15s;
  -webkit-transition: width 0.15s;
  -o-transition: width 0.15s;
}
</style>