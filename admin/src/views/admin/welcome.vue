<template>
  <div style="background-color: #0f496a" >
<!--    <div class="background" >-->
<!--      <el-image :src="src" >-->
<!--      </el-image>-->
<!--    </div>-->
<!--    <div class="front">-->
    <div>
      <template  v-bind:list="list">
        <el-carousel :interval="4000" type="card" height="200px">
          <el-carousel-item v-for="announcement in announcements" :key="announcement">
            <h3 class="medium" :style="font_family">{{ announcement.announcementtitle+':'}}</h3>
            <h5 class="medium">{{ announcement.details }}</h5>
          </el-carousel-item>
        </el-carousel>
      </template>
    </div>
     <el-image :src="src" >
     </el-image>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        announcement:{},
        announcements:[],
        // src: 'https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg'),
        src:require('../../../public/static/image/背景图01.jpg'),
        font_family: "Helvetica Neue",
      }
    },
    mounted: function () {
      let _this=this;
      _this.list();
    },
    methods: {
      /**
       * 列表查询
       */
      list(){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/announcement/list',{
        }).then((respond)=>{
          Loading.hide();
          // console.log("查询公告列表结果:",respond);
          let resp=respond.data;
          _this.announcements=resp.content.list;
          //重新渲染？5.5-1155
          _this.$refs.pagination.render(resp.content.total);
        })
      },
    },
  }
</script>
<style>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 28px;
    opacity: 0.75;
    line-height: 50px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
  .background{
    width:100%;
    height:100%;  /**宽高100%是为了图片铺满屏幕 */
    z-index:-1;
    position: absolute;
  }

  .front{
    z-index:1;
    position: absolute;
  }
</style>
