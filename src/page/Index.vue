<template>
  <div class=".all">
    <el-carousel indicator-position="outside">
      <el-carousel-item v-for="item in 4" :key="item">
        <h3>{{ item }}</h3>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>
  
  <script>
export default {
  name: "Index",
  data() {
    return {
      bookinfo: [
        { img: require('../assets/show1.jpg') },
        { img: require('../assets/show2.jpeg') },
        { img: require('../assets/show3.webp') },
        { img: require('../assets/show4.webp') },
        { img: require('../assets/show5.webp') },
        { img: require('../assets/show6.webp') },
        { img: require('../assets/show7.webp') },
        { img: require('../assets/show8.webp') },
      ],
    };
  },
  methods: {
  }
};
</script>
  
  <style scoped>
</style>