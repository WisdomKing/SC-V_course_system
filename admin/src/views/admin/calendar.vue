<template>
  <div>
    <el-calendar>
      <template slot="dateCell" slot-scope="{date, data}" class="calItem" v-bind:list="list">
        <div :class="data.isSelected ? 'is-selected' : ''" @click="calClick(data)">
          <!-- 显示日期 -->
          <p class="dayItem"  v-if="data.day.substr(-2) < 10">{{ data.day.substr(-1)}}</p>
          <p class="dayItem"  v-else>{{ data.day.substr(-2)}}</p>

          <div v-for="(item,index) in reportWorks" :key="index" >
            <!-- 判断clockDate的天是否和日历里的天一致，是就显示详情 -->
            <div v-if="
             ((item.clockDate).split('-').slice(2)[0].split(' ').slice(0)[0])===(data.day.split('-').slice(2).join('-'))
            ">
              <!-- 详情的提示框 -->
              <el-tooltip :content="item.details" placement="right">
                <div class="mark">{{item.details}}</div>
              </el-tooltip>

              <alert>{{ ((item.clockDate).split('-').slice(2)[0].split(' ').slice(0)[0]) +'|'}}</alert>
              <alert>{{ (data.day.split('-').slice(2).join('-')) }}</alert>

            </div>
            <div v-else></div>
          </div>
          <!--点击出现 添加 按钮-->
          <p class="addBtn" v-show="data.isSelected == true" @click="dialogVisible = true">添加日程</p>
        </div>
      </template>
    </el-calendar>

    <el-dialog
      :title="formData.data"
      :visible.sync="dialogVisible"
      width="30%"
      :before-close="handleClose">
      <el-form @submit.native.prevent>
        <el-form-item label="日程">
          <el-input v-model="formData.content"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
                <el-button @click="dialogVisible = false">取 消</el-button>
                <el-button type="primary" @click="dialogVisible = false,add()">确 定</el-button>
            </span>
    </el-dialog>

  </div>
</template>

<script>
  export default {
    name: "test",
    data:function (){
      return{
        reportWork:{},
        reportWorks:[],
        leave_datetime:'',
        formData:{
          data:'',
          content: ''
        },
        dialogVisible: false,
        clockIn: false,
        leave: false,

        calendarData: [
          // { years: ['2021'], months: ['05'], days: ['13'],details:'acc'},
          // { clockDate:reportWork.clockDate,details:reportWork.details},
        ],
        value: new Date()
      }
    },
    mounted: function () {
      let _this=this;
      //自定义初始每页5条
      // _this.$refs.pagination.size=5;
      _this.list();
    },
    methods: {
      calClick(item){
        console.log(item)
        this.formData.data = item.day
      },

      add(){
        var date = this.formData.data.split('-')
        var a =  {
          years: [date[0]],
          months: [date[1]],
          days: [date[2]],
          details: this.formData.content }
        this.calendarData.push(a)
      },

      /**
       * 列表查询
       */
      list(){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/reportWork/list',{
        }).then((respond)=>{
          Loading.hide();
          console.log("考勤数据:",respond);
          let resp=respond.data;
          _this.reportWorks=resp.content.list;


          //重新渲染？5.5-1155
          _this.$refs(resp.content.total);
        })
      },

    }
  }
</script>

<style scoped>
  .is-selected {
    color:#F8A535;
  }
  .mark{
    padding: 8px 8px 0 8px;
    color: #F8A535;
    z-index: -1;
  }
</style>