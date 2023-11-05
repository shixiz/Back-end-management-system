<template>
  <el-menu :default-active="$route.path" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="isCollapse" background-color=" rgb(48, 65, 86)" text-color="#fff" active-text-color="rgb(64, 158, 255)" >
    <el-menu-item @click="clickMenu(item)" v-for="item in noChildren" :key="item.name" :index="item.name">
      <i :class="`el-icon-${item.icon}`"></i>
      <span slot="title">{{ item.label }}</span>
    </el-menu-item>
    <el-submenu v-for="item in hasChildren" :key="item.label" :index="item.label">
      <template slot="title">
        <i :class="`el-icon-${item.icon}`"></i>
        <span slot="title">{{ item.label }}</span>
      </template>
      <el-menu-item-group v-for="item1 in item.children" :key="item1.path">
        <el-menu-item @click="clickMenu(item1)" :index="item1.path">
          <i :class="`el-icon-${item1.icon}`"></i>
          {{ item1.label }}</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
  </el-menu>
</template>

<script>
export default {
  name: "Aside",
  data() {
    return {
      menuData: [
        {
          path: "/Home",
          name: "home",
          label: "首页",
          icon: "s-home",
        },
        {
          path: "/Main",
          label: "商品",
          icon: "shopping-bag-2",
          children: [
            {
              path: "/List",
              name: "list",
              label: "商品列表",
              icon: "s-grid",
            },
            {
              path: "/Add",
              name: "add",
              label: "添加商品",
              icon: "folder-add",
            },
          ],
        },
      ],
    };
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    clickMenu(item) {
      if (this.$route.path !== item.path) {
        this.$router.push(item.path);
      }
      // this.$store.commit("selectMenu", item);
      if (item.label != "首页") {
        this.$bus.label = item.label;
      } else {
        this.$bus.label = "";
      }
    },
  },
  computed: {
    // 无子菜单
    noChildren() {
      return this.menuData.filter((item) => !item.children);
    },
    // 有子菜单
    hasChildren() {
      return this.menuData.filter((item) => item.children);
    },
    isCollapse() {
      return this.$store.state.tab.isCollapse;
    },
  },
};
</script>

<style lang="less" scoped>
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 200px;
  height: 100%;
  border: none;
}
.el-menu {
  height: 100%;
}
.el-submenu:hover,
.el-menu-item:hover {
  outline: 0 !important;
  background: rgb(38, 52, 69) !important;
}
</style>