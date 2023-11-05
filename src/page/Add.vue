<template>
  <div>
    <el-form :model="form">
      <el-form-item
        label="商品id"
        :label-width="formLabelWidth"
        :required="true"
      >
        <el-input v-model="form.shop_id" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="商品名称" :label-width="formLabelWidth">
        <el-input v-model="form.shop_name" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="商品价格" :label-width="formLabelWidth">
        <el-input v-model="form.shop_price" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="商品品牌" :label-width="formLabelWidth">
        <el-input v-model="form.shop_brand" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="商品号码" :label-width="formLabelWidth">
        <el-input v-model="form.shop_number" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="商品库存" :label-width="formLabelWidth">
        <el-input v-model="form.shop_inventory" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="商品售出" :label-width="formLabelWidth">
        <el-input v-model="form.shop_sales" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="商品状态" :label-width="formLabelWidth">
        <el-input v-model="form.shop_status" autocomplete="off"></el-input>
      </el-form-item>
    </el-form>
    <div slot="footer" class="dialog-footer" style="float: right">
      <el-button @click="cancel">取 消</el-button>
      <el-button type="primary" @click="submit">确 定</el-button>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      form: {
        shop_id: "",
        shop_name: "",
        shop_price: "",
        shop_brand: "",
        shop_number: "",
        shop_inventory: "",
        shop_sales: "",
        shop_status: "",
      },
      formLabelWidth: "120px",
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
    cancel() {
      this.form = {
        shop_id: "",
        shop_name: "",
        shop_price: "",
        shop_brand: "",
        shop_number: "",
        shop_inventory: "",
        shop_sales: "",
        shop_status: "",
      };
      this.$router.push("/List");
    },
    submit() {
      axios
        .post(`http://localhost:8080/shoptest_war_exploded/shop`, this.form)
        .then((res) => {
          if (res.data) {
            this.message = "插入成功！";
            this.open2();
          } else {
            this.message = "插入失败！";
            this.open4();
          }
          setTimeout(() => {
            location.reload();
          }, 1000);
        });
    },
  },
};
</script>

<style>
</style>