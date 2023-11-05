<template>
  <el-row>
    <el-col :span="9" style="padding-right: 10px;">
      <el-card>
        <div class="user">
          <img src="../assets/user.jpg">
          <div class="userinfo">
            <p class="name">Admin</p>
            <p class="access">超级管理员</p>
          </div>
        </div>
        <div class="login-info">
          <p>上次登录时间:<span>2023-6-8</span></p>
          <p>上次登录地点:<span>岳阳</span></p>
        </div>
      </el-card>
      <el-card style="margin-top: 20px;height: 450px;">
        <el-table :data="tableData" style="width: 100%" :header-cell-style="{ 'text-align': 'center' }" :cell-style="{ 'text-align': 'center' }">
          <el-table-column v-for="item,index in tableData[0]" :key="index" :prop="index" :label="index">
          </el-table-column>
        </el-table>
      </el-card>
    </el-col>
    <el-col :span="15" style="padding-left: 10px;">
      <div class="num">
        <el-card class="card" v-for="item in countData" :key="item.name" :body-style="{display:'flex',padding:0}">
          <i class="icon" :class="`el-icon-${item.icon  }`" :style="{background:item.color}"></i>
          <div class="detail">
            <p class="price">￥{{ item.value }}</p>
            <p class="desc">{{ item.name }}</p>
          </div>
        </el-card>
      </div>
      <el-card>
        <div>
          <el-table :data="tableData" style="width: 100%" :header-cell-style="{ 'text-align': 'center' }" :cell-style="{ 'text-align': 'center' }" height="250">
            <el-table-column v-for="item,index in tableData[0]" :key="index" :prop="index" :label="index">
            </el-table-column>
          </el-table>
        </div>
      </el-card>
      <div class="graph" style="height: 260px;">
        <el-card style="width: 48%;">
          <div class="block">
            <span class="demonstration">左边</span>
            <el-image :src="src">
              <div slot="placeholder" class="image-slot">
                加载中<span class="dot">...</span>
              </div>
            </el-image>
          </div>
        </el-card>
        <el-card style="width: 48%;">
          <div class="block">
            <span class="demonstration">右边</span>
            <el-image :src="src">
              <div slot="placeholder" class="image-slot">
                加载中<span class="dot">...</span>
              </div>
            </el-image>
          </div>
        </el-card>
      </div>
    </el-col>
  </el-row>
</template>

<script>
import axios from 'axios';
export default {
  data() {
    return {
      tableData: [],
      countData: [],
      src: 'https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg'
    }
  },
  methods: {
    getSales() {
      axios.get(`http://localhost:8080/shoptest_war_exploded/sales`).then(res => {
        this.tableData = res.data
      })
    },
    getCount() {
      axios.get(`http://localhost:8080/shoptest_war_exploded/count`).then(res => {
        this.countData = res.data
      })
    }
  },
  created() {
    this.getCount(),
      this.getSales()
  }
};
</script>

<style lang="less" scoped>
.el-row {
  height: 100vh;
}
.user {
  display: flex;
  align-items: center;
  padding-bottom: 20px;
  margin-bottom: 20px;
  border-bottom: 1px solid #ccc;
  img {
    margin-right: 40px;
    height: 150px;
    width: 150px;
    border-radius: 50%;
  }
  .userinfo {
    .name {
      font-size: 32px;
      margin-bottom: 10px;
    }
    .access {
      color: #9999;
    }
  }
}
.login-info {
  p {
    line-height: 28px;
    font-size: 14px;
    color: #999999;
    span {
      margin-left: 60px;
      color: #666666;
    }
  }
}
.num {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  .card {
    width: 32%;
    margin-bottom: 20px;
  }
  .icon {
    width: 80px;
    height: 80px;
    font-size: 30px;
    text-align: center;
    line-height: 80px;
    color: white;
  }
  .detail {
    display: flex;
    flex-direction: column;
    justify-content: center;
    margin-left: 15px;
    .price {
      font-size: 30px;
      margin-bottom: 10px;
      height: 30px;
      line-height: 30px;
    }
    .desc {
      font-size: 14px;
      color: #999;
      text-align: center;
    }
  }
}
.graph {
  margin-top: 20px;
  display: flex;
  justify-content: space-between;
}
.block {
  span {
    display: block;
    text-align: center;
    font-size: 14px;
    color: #999999;
  }
}
</style>