<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: "App",
};
</script>

<style>
* {
  margin: 0 0;
  padding: 0 0;
}
body,
html {
  height: 100%;
  margin: 0px;
  padding: 0px;
}
#app {
  width: 100%;
  min-height: 100%;
}
a {
  text-decoration: none;
}
li {
  list-style: none;
}
</style>