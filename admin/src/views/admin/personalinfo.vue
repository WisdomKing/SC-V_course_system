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
        <th>性别</th>
        <th>民族</th>
        <th>身份证号</th>
        <th>政治面貌</th>
        <th>出生日期</th>
        <th>个人邮箱</th>
        <th>户口性质</th>
        <th>户口所在地</th>
        <th>婚否</th>
        <th>毕业院校</th>
        <th>毕业时间</th>
        <th>专业</th>
        <th>学历</th>
        <th>籍贯</th>
        <th>现住址</th>
        <th>手机号</th>
        <th>qq号</th>
        <th>微信</th>
        <th>紧急联系人关系</th>
        <th>紧急联系人姓名</th>
        <th>紧急联系人电话</th>
        <th>操作按钮</th>
      </tr>
      </thead>

      <tbody>
      <tr v-for="personalinfo in personalinfos">
        <td>{{personalinfo.name}}</td>
        <td>{{SEX | optionKV(personalinfo.sex)}}</td>

        <td>{{personalinfo.ethnicity}}</td>
        <td>{{personalinfo.idnum}}</td>
        <td>{{POLITICAL_OUTLOOK | optionKV(personalinfo.politicaloutlook)}}</td>

        <td>{{personalinfo.dateofbirth}}</td>
        <td>{{personalinfo.personalemail}}</td>
        <td>{{personalinfo.regisType}}</td>
        <td>{{personalinfo.regisResidence}}</td>
        <td>{{MARITAL_STATUS | optionKV(personalinfo.maritalstatus)}}</td>
        <td>{{personalinfo.gradUnversity}}</td>
        <td>{{personalinfo.gradTime}}</td>
        <td>{{personalinfo.speciality}}</td>
        <td>{{DEGREE | optionKV(personalinfo.degree)}}</td>

        <td>{{PROVINCE | optionKV(personalinfo.nativeplace)}}</td>
        <td>{{personalinfo.presentaddress}}</td>
        <td>{{personalinfo.telephone}}</td>
        <td>{{personalinfo.qqnum}}</td>
        <td>{{personalinfo.wechat}}</td>
        <td>{{EMERGENCY_CONTACT_REL | optionKV(personalinfo.emergencycontactrel)}}</td>

        <td>{{personalinfo.emergencycontactname}}</td>
        <td>{{personalinfo.emergencycontacttel}}</td>
        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(personalinfo)" class="btn btn-xs btn-info">
              <!--详情-->
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(personalinfo.id)" class="btn btn-xs btn-danger">
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
            <h4 class="modal-title">个人信息</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
                <div class="form-group">
                  <label class="col-sm-2 control-label">姓名</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.name" class="form-control" placeholder="姓名">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">性别</label>
                  <div class="col-sm-10">
                    <select v-model="personalinfo.sex" class="form-control">
                      <option v-for="o in SEX" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">民族</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.ethnicity" class="form-control" placeholder="民族">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">身份证号</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.idnum" class="form-control" placeholder="身份证号">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">政治面貌</label>
                  <div class="col-sm-10">
                    <select v-model="personalinfo.politicaloutlook" class="form-control">
                      <option v-for="o in POLITICAL_OUTLOOK" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">出生日期</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.dateofbirth" class="form-control" placeholder="出生日期">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">个人邮箱</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.personalemail" class="form-control" placeholder="个人邮箱">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">户口性质</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.regisType" class="form-control" placeholder="户口性质">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">户口所在地</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.regisResidence" class="form-control" placeholder="户口所在地">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">婚否</label>
                  <div class="col-sm-10">
                    <select v-model="personalinfo.maritalstatus" class="form-control">
                      <option v-for="o in MARITAL_STATUS" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">毕业院校</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.gradUnversity" class="form-control" placeholder="毕业院校">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">毕业时间</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.gradTime" class="form-control" placeholder="毕业时间">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">专业</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.speciality" class="form-control" placeholder="专业">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">学历</label>
                  <div class="col-sm-10">
                    <select v-model="personalinfo.degree" class="form-control">
                      <option v-for="o in DEGREE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">籍贯</label>
                  <div class="col-sm-10">
                    <select v-model="personalinfo.nativeplace" class="form-control">
                      <option v-for="o in PROVINCE" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">现住址</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.presentaddress" class="form-control" placeholder="现住址">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">手机号</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.telephone" class="form-control" placeholder="手机号">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">qq号</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.qqnum" class="form-control" placeholder="qq号">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">微信</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.wechat" class="form-control" placeholder="微信">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">紧急联系人关系</label>
                  <div class="col-sm-10">
                    <select v-model="personalinfo.emergencycontactrel" class="form-control">
                      <option v-for="o in EMERGENCY_CONTACT_REL" v-bind:value="o.key">{{o.value}}</option>
                    </select>
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">紧急联系人姓名</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.emergencycontactname" class="form-control" placeholder="紧急联系人姓名">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label">紧急联系人电话</label>
                  <div class="col-sm-10">
                    <input v-model="personalinfo.emergencycontacttel" class="form-control" placeholder="紧急联系人电话">
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
    name: 'business-personalinfo',
    components: {Pagination},
    data:function(){
      return{
        personalinfo:{},
        personalinfos:[],
        SEX,
        EMERGENCY_CONTACT_REL,
        DEGREE,
        MARITAL_STATUS,
        POLITICAL_OUTLOOK,
        PROVINCE,
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
        _this.personalinfo={}
        $("#form-modal").modal("show");
      },
      /**
       * 点击编辑
       */
      edit(personalinfo){
        let _this=this;
        //将数据带到模态框里
        _this.personalinfo=$.extend({},personalinfo);
        $("#form-modal").modal("show");
      },
      /**
       * 列表查询
       */
      list(page){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/personalinfo/list',{
          page:page,
          size:_this.$refs.pagination.size,
        }).then((respond)=>{
          Loading.hide();
          let resp=respond.data;
          _this.personalinfos=resp.content.list;
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
          || !Validator.require(_this.personalinfo.name, "姓名")
          || !Validator.length(_this.personalinfo.name, "姓名", 1, 20)
          || !Validator.require(_this.personalinfo.sex, "性别")
          || !Validator.require(_this.personalinfo.ethnicity, "民族")
          || !Validator.length(_this.personalinfo.ethnicity, "民族", 1, 20)
          || !Validator.require(_this.personalinfo.idnum, "身份证号")
          || !Validator.length(_this.personalinfo.idnum, "身份证号", 1, 18)
          || !Validator.length(_this.personalinfo.dateofbirth, "出生日期", 1, 20)
          || !Validator.require(_this.personalinfo.personalemail, "个人邮箱")
          || !Validator.length(_this.personalinfo.personalemail, "个人邮箱", 1, 50)
          || !Validator.length(_this.personalinfo.regisType, "户口性质", 1, 20)
          || !Validator.length(_this.personalinfo.regisResidence, "户口所在地", 1, 50)
          || !Validator.length(_this.personalinfo.gradUnversity, "毕业院校", 1, 20)
          || !Validator.length(_this.personalinfo.gradTime, "毕业时间", 1, 20)
          || !Validator.length(_this.personalinfo.speciality, "专业", 1, 20)
          || !Validator.length(_this.personalinfo.nativeplace, "籍贯", 1, 50)
          || !Validator.length(_this.personalinfo.presentaddress, "现住址", 1, 50)
          || !Validator.require(_this.personalinfo.telephone, "手机号")
          || !Validator.length(_this.personalinfo.telephone, "手机号", 1, 18)
          || !Validator.length(_this.personalinfo.qqnum, "qq号", 1, 20)
          || !Validator.length(_this.personalinfo.wechat, "微信", 1, 20)
          || !Validator.length(_this.personalinfo.emergencycontactname, "紧急联系人姓名", 1, 20)
          || !Validator.length(_this.personalinfo.emergencycontacttel, "紧急联系人电话", 1, 18)
        ) {
          return;
        }

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/personalinfo/save',
_this.personalinfo).then((respond)=>{
          Loading.hide();
          // console.log("保存个人信息列表结果:",respond);
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
        Confirm.show("删除个人信息后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/business/admin/personalinfo/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除个人信息列表结果:",respond);
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