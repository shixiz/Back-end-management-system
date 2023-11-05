<template>
  <div id="app">
    <el-form class="box" :model="ruleForm" status-icon :rules="rules" ref="ruleForm">
      <h1 class="title">用户登录</h1>
      <el-form-item prop="username">
        <el-input type="text" v-model="ruleForm.username" autocomplete="off" placeholder="用户账号"></el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input type="password" v-model="ruleForm.password" autocomplete="off" placeholder="用户密码"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="doLogin()" style="width: 48%">
          登录
        </el-button>
        <el-button type="primary" @click="doRegister" style="width: 49%">
          注册
        </el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: `Login`,
  data() {
    var checkusername = (rule, value, callback) => {
      if (!value) {
        return callback(new Error("用户不能为空"));
      }
      setTimeout(() => {
        if (value.length < 5 || value.length > 16) {
          callback(new Error("用户长度必须在5-16之间"));
        } else {
          callback();
        }
      }, 1000);
    };
    var validatePass = (rule, value, callback) => {
      if (value === "") {
        callback(new Error("请输入密码"));
      }
      setTimeout(() => {
        if (value.length < 8 || value.length > 16) {
          callback(new Error("密码长度必须在8-16之间"));
        } else {
          callback();
        }
      }, 1000);
    };
    return {
      flag: true,
      ruleForm: {
        username: "",
        password: "",
      },
      rules: {
        username: [{ validator: checkusername, trigger: "blur" }],
        password: [{ validator: validatePass, trigger: "blur" }],
      },
    };
  },
  methods: {
    open4() {
      this.$message.error("账号或者密码错误");
    },
    open3() {
      this.$message.error("账户或密码不符合规范");
    },
    open2() {
      this.$message({
        message: "注册成功",
        type: "success",
      });
    },
    doLogin() {
      axios
        .put("http://localhost:8080/shoptest_war_exploded/user/", this.ruleForm)
        .then((res) => {
          if (res.data.length > 0) {
            this.$router.push("/Home");
          } else {
            this.open4();
          }
        })
        .catch((err) => {
          console.error(err);
        });
    },
    doRegister() {
      this.$router.push('/Register')
    },
  },
};
</script>

<style scoped>
#app {
  background: linear-gradient(to right, #9fe1fa, #f4edc9);
  box-sizing: border-box;
  width: 100%;
  height: 100vh;
  padding-top: 10%;
}
.box {
  border-radius: 10px;
  margin: 0px auto;
  width: 350px;
  padding: 30px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  text-align: left;
  box-shadow: 0 0 20px 2px rgba(0, 0, 0, 0.1);
}
.title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #505458;
}
</style>