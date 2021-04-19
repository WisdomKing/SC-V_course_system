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
        <th>登陆名</th>
        <th>昵称</th>
        <th>密码</th>
        <th>权限</th>
        <th>操作按钮</th>
      </tr>
      </thead>

      <tbody>
      <tr v-for="user in users">
        <td>{{user.jobNum}}</td>
        <td>{{user.companyemail}}</td>
        <td>{{user.name}}</td>
        <td>{{user.password}}</td>
        <td>{{ROLE | optionKV(user.role)}}</td>
        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(user)" class="btn btn-xs btn-info">
              <!--详情-->
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(user.id)" class="btn btn-xs btn-danger">
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
            <h4 class="modal-title">用户</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
                <div class="form-group">
                  <label class="col-sm-2 control-label">工号</label>
                  <div class="col-sm-10">
                    <input v-model="user.jobNum" class="form-control" placeholder="工号">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">登陆名</label>
                  <div class="col-sm-10">
                    <input v-model="user.companyemail" v-bind:disabled="user.companyemail" class="form-control" placeholder="登陆名">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">昵称</label>
                  <div class="col-sm-10">
                    <input v-model="user.name" class="form-control" placeholder="昵称">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">密码</label>
                  <div class="col-sm-10">
                    <input v-model="user.password" class="form-control" placeholder="密码">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">权限</label>
                  <div class="col-sm-10">
                    <input v-model="user.role" class="form-control" placeholder="权限">
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
    name: 'system-user',
    components: {Pagination},
    data:function(){
      return{
        user:{},
        users:[],
        ROLE:ROLE,
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
        _this.user={}
        $("#form-modal").modal("show");
      },
      /**
       * 点击编辑
       */
      edit(user){
        let _this=this;
        //将数据带到模态框里
        _this.user=$.extend({},user);
        $("#form-modal").modal("show");
      },
      /**
       * 列表查询
       */
      list(page){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/system/admin/user/list',{
          page:page,
          size:_this.$refs.pagination.size,
        }).then((respond)=>{
          Loading.hide();
          let resp=respond.data;
          _this.users=resp.content.list;
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
          || !Validator.require(_this.user.jobNum, "工号")
          || !Validator.require(_this.user.companyemail, "登陆名")
          || !Validator.length(_this.user.companyemail, "登陆名", 1, 50)
          || !Validator.length(_this.user.name, "昵称", 1, 50)
          || !Validator.require(_this.user.password, "密码")
          || !Validator.require(_this.user.role, "权限")
        ) {
          return;
        }
        //对密码加密
        _this.user.password=hex_md5(_this.user.password + KEY);

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/system/admin/user/save',
_this.user).then((respond)=>{
          Loading.hide();
          // console.log("保存用户列表结果:",respond);
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
        Confirm.show("删除用户后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/system/admin/user/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除用户列表结果:",respond);
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