export default {
    state: {
        isCollapse: false,   //控制菜单
        // tabsList: [{
        //     path: "/Home",
        //     name: "home",
        //     label: "首页",
        //     icon: "s-home",
        //     url: "Home/Home",
        // },]//面包屑的数据
    },
    mutations: {
        CollapseMenu(state) {
            state.isCollapse = !state.isCollapse
        },
        selectMenu(state, val) {
            // if (val.name != 'home') {
            //     const index = state.tabsList.findIndex(item => {
            //         item.name == val.name
            //     })
            // if (index == -1 && state.tabsList.length < 2) {

            //     // state.tabsList.push(val)
            //     // state.tabsList.shift()
            // } else {
            // this.$bus.label = val
            // }
            // }
            // console.log(state.tabsList);
        }
    }
}