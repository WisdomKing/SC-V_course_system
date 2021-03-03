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
        <th>姓名</th>
        <th>工号</th>
        <th>归属公司</th>
        <th>企业邮箱</th>
        <th>所属部门</th>
        <th>上级部门</th>
        <th>职位</th>
        <th>部门总监</th>
        <th>入职时间</th>
        <th>入职方式</th>
        <th>入职地点</th>
        <th>实习起始日</th>
        <th>实习到期日</th>
        <th>转正日期</th>
        <th>合同签订日</th>
        <th>合同截止日</th>
        <th>试用到期日</th>
        <th>人员状态</th>
        <th>合同续签</th>
        <th>福利地区</th>
        <th>我的角色</th>
        <th>员工CCC</th>
        <th>备注</th>
        <th>操作按钮</th>
      </tr>
      </thead>

      <tbody>
      <tr v-for="employeeinfo in employeeinfos">
        <td>{{employeeinfo.name}}</td>
        <td>{{employeeinfo.jobNum}}</td>
        <td>{{BASE | optionKV(employeeinfo.base)}}</td>
        <td>{{employeeinfo.companyemail}}</td>
        <td>{{employeeinfo.dependenceDep}}</td>
        <td>{{employeeinfo.superiordep}}</td>
        <td>{{employeeinfo.position}}</td>
        <td>{{employeeinfo.depDirector}}</td>
        <td>{{employeeinfo.entryTime}}</td>
        <td>{{ENTRY_TYPE | optionKV(employeeinfo.entryType)}}</td>
        <td>{{BASE | optionKV(employeeinfo.entryAddress)}}</td>
        <td>{{employeeinfo.internshipbegin}}</td>
        <td>{{employeeinfo.internshipending}}</td>
        <td>{{employeeinfo.conversionregTime}}</td>
        <td>{{employeeinfo.contractsigning}}</td>
        <td>{{employeeinfo.contractending}}</td>
        <td>{{employeeinfo.probationexpDate}}</td>
        <td>{{employeeinfo.employeestatus}}</td>
        <td>{{employeeinfo.contractrenew}}</td>
        <td>{{BASE | optionKV(employeeinfo.welfarearea)}}</td>
        <td>{{employeeinfo.myrole}}</td>
        <td>{{employeeinfo.employeeccc}}</td>
        <td>{{employeeinfo.comment}}</td>
        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(employeeinfo)" class="btn btn-xs btn-info">
              <!--详情-->
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(employeeinfo.id)" class="btn btn-xs btn-danger">
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
            <h4 class="modal-title">员工信息</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
                <div class="form-group">
                  <label class="col-sm-2 control-label">姓名</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.name" class="form-control" placeholder="姓名">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">工号</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.jobNum" class="form-control" placeholder="工号">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">归属公司</label>
                  <div class="col-sm-10">
                    <select v-model="employeeinfo.base" class="form-control">
                      <option v-for="o in BASE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">企业邮箱</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.companyemail" class="form-control" placeholder="企业邮箱">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">所属部门</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.dependenceDep" class="form-control" placeholder="所属部门">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">上级部门</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.superiordep" class="form-control" placeholder="上级部门">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">职位</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.position" class="form-control" placeholder="职位">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">部门总监</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.depDirector" class="form-control" placeholder="部门总监">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">入职时间</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.entryTime" class="form-control" placeholder="入职时间">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">入职方式</label>
                  <div class="col-sm-10">
                    <select v-model="employeeinfo.entryType" class="form-control">
                      <option v-for="o in ENTRY_TYPE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">入职地点</label>
                  <div class="col-sm-10">
                    <select v-model="employeeinfo.entryAddress" class="form-control">
                      <option v-for="o in BASE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">实习起始日</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.internshipbegin" class="form-control" placeholder="实习起始日">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">实习到期日</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.internshipending" class="form-control" placeholder="实习到期日">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">转正日期</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.conversionregTime" class="form-control" placeholder="转正日期">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">合同签订日</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.contractsigning" class="form-control" placeholder="合同签订日">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">合同截止日</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.contractending" class="form-control" placeholder="合同截止日">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">试用到期日</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.probationexpDate" class="form-control" placeholder="试用到期日">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">人员状态</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.employeestatus" class="form-control" placeholder="人员状态">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">合同续签</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.contractrenew" class="form-control" placeholder="合同续签">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">福利地区</label>
                  <div class="col-sm-10">
                    <select v-model="employeeinfo.welfarearea" class="form-control">
                      <option v-for="o in BASE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">我的角色</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.myrole" class="form-control" placeholder="我的角色">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">员工CCC</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.employeeccc" class="form-control" placeholder="员工CCC">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">备注</label>
                  <div class="col-sm-10">
                    <input v-model="employeeinfo.comment" class="form-control" placeholder="备注">
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
    name: 'business-employeeinfo',
    components: {Pagination},
    data:function(){
      return{
        employeeinfo:{},
        employeeinfos:[],
        BASE,
        ENTRY_TYPE,
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
        _this.employeeinfo={}
        $("#form-modal").modal("show");
      },
      /**
       * 点击编辑
       */
      edit(employeeinfo){
        let _this=this;
        //将数据带到模态框里
        _this.employeeinfo=$.extend({},employeeinfo);
        $("#form-modal").modal("show");
      },
      /**
       * 列表查询
       */
      list(page){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/employeeinfo/list',{
          page:page,
          size:_this.$refs.pagination.size,
        }).then((respond)=>{
          Loading.hide();
          let resp=respond.data;
          _this.employeeinfos=resp.content.list;
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
          || !Validator.require(_this.employeeinfo.name, "姓名")
          || !Validator.length(_this.employeeinfo.name, "姓名", 1, 20)
          || !Validator.require(_this.employeeinfo.jobNum, "工号")
          || !Validator.length(_this.employeeinfo.jobNum, "工号", 1, 5)
          || !Validator.require(_this.employeeinfo.base, "归属公司")
          || !Validator.require(_this.employeeinfo.companyemail, "企业邮箱")
          || !Validator.length(_this.employeeinfo.companyemail, "企业邮箱", 1, 50)
          || !Validator.require(_this.employeeinfo.dependenceDep, "所属部门")
          || !Validator.length(_this.employeeinfo.dependenceDep, "所属部门", 1, 20)
          || !Validator.length(_this.employeeinfo.superiordep, "上级部门", 1, 20)
          || !Validator.require(_this.employeeinfo.position, "职位")
          || !Validator.length(_this.employeeinfo.position, "职位", 1, 20)
          || !Validator.length(_this.employeeinfo.depDirector, "部门总监", 1, 20)
          || !Validator.require(_this.employeeinfo.entryTime, "入职时间")
          || !Validator.require(_this.employeeinfo.entryAddress, "入职地点")
          || !Validator.length(_this.employeeinfo.employeestatus, "人员状态", 1, 20)
          || !Validator.length(_this.employeeinfo.contractrenew, "合同续签", 1, 20)
          || !Validator.length(_this.employeeinfo.welfarearea, "福利地区", 1, 20)
          || !Validator.length(_this.employeeinfo.myrole, "我的角色", 1, 20)
          || !Validator.length(_this.employeeinfo.employeeccc, "员工CCC", 1, 20)
          || !Validator.length(_this.employeeinfo.comment, "备注", 1, 50)
        ) {
          return;
        }

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/employeeinfo/save',
_this.employeeinfo).then((respond)=>{
          Loading.hide();
          // console.log("保存员工信息列表结果:",respond);
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
        Confirm.show("删除员工信息后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/business/admin/employeeinfo/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除员工信息列表结果:",respond);
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