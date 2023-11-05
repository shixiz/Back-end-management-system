<template>
  <div class="header-container">
    <el-button @click="handleMenu" icon="el-icon-menu" size="mini"></el-button>
    <el-breadcrumb separator="/">
      <el-breadcrumb-item>{{ $bus.label1 }}</el-breadcrumb-item>
      <el-breadcrumb-item>{{ $bus.label }}</el-breadcrumb-item>
    </el-breadcrumb>
  </div>
</template>

<script>
import { mapState } from "vuex";
export default {
  name: "Header",
  data() {
    return {
      breadList: [],
    };
  },
  computed: {
    ...mapState({ tags: (state) => state.tab.tabsList }),
  },
  methods: {
    handleMenu() {
      this.$store.commit("CollapseMenu");
    },
  },
};
</script>

<style lang="less" scoped>
.header-container {
  padding: 15px 20px;
  display: flex;
  align-items: center;
}
.el-breadcrumb {
  font-size: 14px;
  font-weight: bold;
  margin-left: 10px;
}
</style>