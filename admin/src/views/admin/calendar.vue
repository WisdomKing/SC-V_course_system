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
             ((item.clockDate).split('-').slice(0)[0])===(data.day.split('-').slice(0)[0]) &&
             ((item.clockDate).split('-').slice(1)[0])===(data.day.split('-').slice(1)[0]) &&
             ((item.clockDate).split('-').slice(2)[0].split(' ').slice(0)[0])===(data.day.split('-').slice(2).join('-'))
            ">
              <!-- 详情的提示框 -->
              <el-tooltip :content="item.details" placement="right">
                <div class="mark">{{item.details}}</div>
              </el-tooltip>
              <p class="addBtn" v-show="data.isSelected == true" @click="edit(item)">编辑日程</p>
            </div>
            <div v-else>
            </div>
          </div>
            <p class="addBtn" v-show="data.isSelected == true" @click="add()">编辑日程</p>
        </div>
      </template>


    </el-calendar>

    <div id="form-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">考勤选择</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
              <el-button type="primary" @click="clockInadd()">报工</el-button>
              <el-button type="primary" @click="leaveadd()">请假</el-button>

              <el-button type="primary"
                         @click="del(reportWork.id)">删除</el-button>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          </div>
        </div>
      </div>
    </div>

    <!-- 报工 -->
    <div id="clockIn-form-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">考勤</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
              <div class="form-group">
                <label class="col-sm-2 control-label">工号</label>
                <div class="col-sm-10">
                  <input v-model="reportWork.jobNum" class="form-control" placeholder="工号">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">项目组名称</label>
                <div class="col-sm-10">
                  <input v-model="reportWork.proname" class="form-control" placeholder="项目组名称">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">工时</label>
                <div class="col-sm-10">
                  <input v-model="reportWork.workingHours" class="form-control" placeholder="工时">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">延时</label>
                <div class="col-sm-10">
                  <input v-model="reportWork.delayed" class="form-control" placeholder="延时">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">工作日志</label>
                <div class="col-sm-10">
                  <textarea v-model="reportWork.details" :rows="5" class="form-control" placeholder="工作日志、请假理由"></textarea>
                </div>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button v-on:click="save()" type="button" class="btn btn-primary">保存</button>
          </div>
        </div>
      </div>
    </div>

    <!-- 请假 -->
    <div id="leave-form-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">考勤</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
              <div class="form-group">
                <label class="col-sm-2 control-label">工号</label>
                <div class="col-sm-10">
                  <input v-model="reportWork.jobNum" class="form-control" placeholder="工号">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">项目组名称</label>
                <div class="col-sm-10">
                  <input v-model="reportWork.proname" class="form-control" placeholder="项目组名称">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">请假理由</label>
                <div class="col-sm-10">
                  <input v-model="reportWork.details" class="form-control" placeholder="工作日志、请假理由">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">起止时间</label>
                <div class="col-sm-10">
                  <el-date-picker
                    v-model="leave_datetime"
                    type="datetimerange"
                    start-placeholder="开始日期"
                    end-placeholder="结束日期"
                    :default-time="['09:00:00']">
                  </el-date-picker>
                </div>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button v-on:click="save()" type="button" class="btn btn-primary">保存</button>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<script>
  export default {
    name: "test",
    data:function (){
      return{
        reportWork:{},
        reportWorks:[],
        user:{},
        users:[],
        leave_datetime:'',
        REPORT_WORK,
        formData:{
          data:'',
          content: ''
        },
        dialogVisible: false,
        clockIn: false,
        leave: false,

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
        console.log(item,'data');
        this.formData.data = item.day;
      },
      /**
       * 点击添加日程
       */
      add(){
        let _this=this;
        //模态框打开时清空上次的数据
        _this.reportWork={};
        $("#form-modal").modal("show");
      },
      /**
       * 点击添加日程
       */
      edit(item){
        let _this=this;
        //模态框打开时清空上次的数据
        _this.reportWork={};
        _this.reportWork=item;

        $("#form-modal").modal("show");

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
      /**
       * 点击保存
       */
      save(){
        let _this=this;
        // 保存校验，非空和长度
        if (1 != 1 || !Validator.require(_this.reportWork.jobNum, "工号")) {
          //判断是否是请假
          if(_this.reportWork.clockState=="02"){
            _this.reportWork.benginTime = this.leave_datetime[0];
            _this.reportWork.endingTime = this.leave_datetime[1];
            return;
          }else {
            return;
          }
        }

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/reportWork/save',_this.reportWork).then((respond)=>{
          Loading.hide();
          // console.log("保存考勤列表结果:",respond);
          let resp=respond.data;
          if (resp.success){
            //如果成功了，隐藏modal和刷新列表
            $("#clockIn-form-modal").modal("hide");
            $("#leave-form-modal").modal("hide");
            _this.list(1);
            Toast.success("保存成功");
          }else {
            Toast.warning(resp.message)
          }
        })
      },
      clockInadd(){
        $("#form-modal").modal("hide");
        let _this=this;
        //模态框打开时清空上次的数据
        _this.reportWork={};
        //表单数据填入报工状态和日历日期
        _this.reportWork.clockState="01";
        _this.reportWork.clockDate=_this.formData.data+" 00:00:00";

        $("#clockIn-form-modal").modal("show");
      },
      leaveadd(){
        $("#form-modal").modal("hide");
        let _this=this;
        //模态框打开时清空上次的数据
        _this.reportWork={};
        //表单数据填入报工状态和日历日期

        _this.reportWork.clockState="01";
        _this.reportWork.clockDate=_this.formData.data+" 00:00:00";
        $("#leave-form-modal").modal("show");
      },
      /**
       * 点击删除
       */
      del(id){
        // console.log(id);
        let _this=this;
        Confirm.show("删除考勤后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/business/admin/reportWork/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除考勤列表结果:",respond);
            let resp=respond.data;
            if (resp.success){
              _this.list();
              Toast.success("删除成功");
              $("#form-modal").modal("hide");
            }
          })
        });
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