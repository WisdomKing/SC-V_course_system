<template>
  <div>
    <!-- 刷新按钮 -->
    <p>
    <button v-on:click="add()" class="btn btn-white btn-default btn-round">
      <i class="ace-icon fa fa-edit"></i>
      新增
    </button>
      &nbsp;
    <button v-on:click="list(1)" class="btn btn-white btn-default btn-round">
      <i class="ace-icon fa fa-refresh"></i>
      刷新
    </button>
    </p>
    <!-- 分页插件 -->
    <pagination ref="pagination" v-bind:list="list" v-bind:item-count="5"></pagination>
    <!-- 表单数据 -->
    <table id="simple-table" class="table  table-bordered table-hover">
      <thead>
      <tr>
        <th>工号</th>
        <th>请假类型</th>
        <th>请假时间开始</th>
        <th>请假时间结束</th>
        <th>请假审批状态</th>
        <th>是否销假</th>
        <th>请假说明</th>
        <th>操作按钮</th>
      </tr>
      </thead>

      <tbody>
      <tr v-for="askforleave in askforleaves">
        <td>{{askforleave.jobNum}}</td>
        <td>{{LEAVE_TYPE | optionKV(askforleave.leavetype)}}</td>
        <td>{{askforleave.leavetimebengin}}</td>
        <td>{{askforleave.leavetimeending}}</td>
        <td>{{LEAVE_STATUS | optionKV(askforleave.leavestatus)}}</td>
        <td>{{CANCELLATION_LEAVE | optionKV(askforleave.cancellationleave)}}</td>
        <td>{{askforleave.details}}</td>
        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(askforleave)" class="btn btn-xs btn-info">
              <!--详情-->
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(askforleave.id)" class="btn btn-xs btn-danger">
              <i class="ace-icon fa fa-trash-o bigger-120"></i>
            </button>
          </div>
        </td>
      </tr>
      </tbody>
    </table>

    <!-- 模态框 -->
    <div id="form-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">请假</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
                <div class="form-group">
                  <label class="col-sm-2 control-label">工号</label>
                  <div class="col-sm-10">
                    <input v-model="askforleave.jobNum" class="form-control" placeholder="工号">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">请假类型</label>
                  <div class="col-sm-10">
                    <select v-model="askforleave.leavetype" class="form-control">
                      <option v-for="o in LEAVE_TYPE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">请假时间开始</label>
                  <div class="col-sm-10">
                    <input v-model="askforleave.leavetimebengin" class="form-control" placeholder="请假时间开始">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">请假时间结束</label>
                  <div class="col-sm-10">
                    <input v-model="askforleave.leavetimeending" class="form-control" placeholder="请假时间结束">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">请假审批状态</label>
                  <div class="col-sm-10">
                    <select v-model="askforleave.leavestatus" class="form-control">
                      <option v-for="o in LEAVE_STATUS" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">是否销假</label>
                  <div class="col-sm-10">
                    <select v-model="askforleave.cancellationleave" class="form-control">
                      <option v-for="o in CANCELLATION_LEAVE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">请假说明</label>
                  <div class="col-sm-10">
                    <input v-model="askforleave.details" class="form-control" placeholder="请假说明">
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
  import Pagination from "../../components/pagination";
  export default {
    name: 'business-askforleave',
    components: {Pagination},
    data:function(){
      return{
        askforleave:{},
        askforleaves:[],
        LEAVE_TYPE:LEAVE_TYPE,
        LEAVE_STATUS:LEAVE_STATUS,
        CANCELLATION_LEAVE:CANCELLATION_LEAVE,
      }
    },
    mounted: function () {
      let _this=this;
      //自定义初始每页5条
      _this.$refs.pagination.size=5;
      _this.list();
      },
    methods: {
      /**
       * 点击新增
       */
      add(){
        let _this=this;
        //模态框打开时清空上次的数据
        _this.askforleave={}
        $("#form-modal").modal("show");
      },
      /**
       * 点击编辑
       */
      edit(askforleave){
        let _this=this;
        //将数据带到模态框里
        _this.askforleave=$.extend({},askforleave);
        $("#form-modal").modal("show");
      },
      /**
       * 列表查询
       */
      list(page){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/askforleave/list',{
          page:page,
          size:_this.$refs.pagination.size,
        }).then((respond)=>{
          Loading.hide();
          let resp=respond.data;
          _this.askforleaves=resp.content.list;
          //重新渲染？5.5-1155
          _this.$refs.pagination.render(page,resp.content.total);
        })
      },
      /**
       * 点击保存
       */
      save(page){
        let _this=this;
        // 保存校验，非空和长度
        if (1 != 1
          || !Validator.require(_this.askforleave.jobNum, "工号")
          || !Validator.length(_this.askforleave.jobNum, "工号", 5, 5)
          || !Validator.require(_this.askforleave.leavetype, "请假类型")
          || !Validator.require(_this.askforleave.leavetimebengin, "请假时间开始")
          || !Validator.require(_this.askforleave.leavetimeending, "请假时间结束")
          || !Validator.require(_this.askforleave.details, "请假说明")
          || !Validator.length(_this.askforleave.details, "请假说明", 1, 100)
        ) {
          return;
        }

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/askforleave/save',
_this.askforleave).then((respond)=>{
          Loading.hide();
          // console.log("保存请假列表结果:",respond);
          let resp=respond.data;
          if (resp.success){
            //如果成功了，隐藏modal和刷新列表
            $("#form-modal").modal("hide");
            _this.list(1);
            Toast.success("保存成功");
          }else {
            Toast.warning(resp.message)
          }
        })
      },
      /**
       * 点击删除
       */
      del(id){
        let _this=this;
        Confirm.show("删除请假后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/business/admin/askforleave/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除请假列表结果:",respond);
            let resp=respond.data;
            if (resp.success){
              _this.list(1);
              Toast.success("删除成功");
            }
          })
        });
      }
    }
  }
</script>