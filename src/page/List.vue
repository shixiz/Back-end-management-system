<template>
  <div class="List">
    <div class="List-t">
      <el-row>
        <el-col :span="12">
          <i class="el-icon-search"></i>
          <span>筛选搜索</span>
        </el-col>
        <el-col :span="12">
          <el-button type="primary" size="mini" @click="select"
            >查询结果</el-button
          >
          <el-button size="mini" @click="reset">重置</el-button>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="24">
          输入搜索：
          <el-input v-model="input" placeholder="请输入商品名称"></el-input>
        </el-col>
      </el-row>
    </div>
    <div class="List-m">
      <el-row>
        <el-col :span="12"
          ><i class="el-icon-s-unfold"></i><span>数据列表</span></el-col
        >
        <el-col :span="12"
          ><el-button size="mini" @click="add">添加</el-button></el-col
        >
      </el-row>
    </div>
    <div class="List-b">
      <el-table
        :data="tableData"
        style="width: 100%"
        :header-cell-style="{ 'text-align': 'center' }"
        :cell-style="{ 'text-align': 'center' }"
      >
        <el-table-column
          v-for="(item, index) in tableData[0]"
          :key="index"
          :prop="index"
          :label="index"
          width="auto"
        >
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)"
              >编辑</el-button
            >
            <el-button
              size="mini"
              type="danger"
              @click="handleDelete(scope.$index, scope.row)"
              >删除</el-button
            >
          </template>
        </el-table-column>
      </el-table>
    </div>
  </div>
</template>
  
  <script>
import axios from "axios";
export default {
  data() {
    return {
      input: "",
      tableData: [],
    };
  },
  methods: {
    open2() {
      this.$message({
        message: this.message,
        type: "success",
      });
    },
    //失败消息弹框
    open4() {
      this.$message.error("错了哦，这是一条错误消息");
    },
    handleEdit(index, row) {
      console.log(index, row);
      this.$router.push({ path: "/Update", query: row });
    },
    handleDelete(index, row) {
      console.log(index, "index", row, "row");
      axios
        .delete(
          `http://localhost:8080/shoptest_war_exploded/shop/${row.shop_id}`
        )
        .then((res) => {
          if (res.data) {
            this.message = "删除成功！";
            this.open2();
            setTimeout(() => {
              location.reload();
            }, 1000);
          } else {
            this.message = "删除失败！";
            this.open4();
          }
        });
    },
    reset() {
      this.input = "";
    },
    select() {
      axios
        .get(`http://localhost:8080/shoptest_war_exploded/shop/${this.input}`)
        .then((res) => {
          this.tableData = res.data;
        });
    },
    getShop() {
      axios
        .get(`http://localhost:8080/shoptest_war_exploded/shop/`)
        .then((res) => {
          this.tableData = res.data;
        });
    },
    add() {
      this.$router.push("/Add");
    },
  },
  created() {
    this.getShop();
  },
};
</script>
  
  <style scoped>
.List-t,
.List-m {
  margin-top: 40px;
  border: 1px solid lightgray;
  padding-bottom: 20px;
}
.List-b {
  margin-top: 40px;
  border: 1px solid lightgray;
  margin-bottom: 40px;
}
.el-row {
  padding-top: 20px;
  font-size: 15px;
  padding-left: 20px;
}
.el-col .el-button {
  float: right;
  margin-right: 20px;
}
.el-input {
  width: 200px;
}
.el-row span {
  font-size: 18px;
}
.el-table {
  text-align: center;
}
</style>