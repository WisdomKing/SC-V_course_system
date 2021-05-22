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
    <el-table
      :data="employeeinfos"
      border
      style="width: 100%">

      <el-table-column
        fixed
        label="姓名"
        :show-overflow-tooltip="true"
        width="120"
        prop="name">
        <template slot-scope="scope">
          {{(scope.row.name)}}
        </template>
      </el-table-column>

      <el-table-column
        label="工号"
        width="80">
        <template slot-scope="scope">
          {{(scope.row.jobNum)}}
        </template>
      </el-table-column>

      <el-table-column
        label="归属公司"
        width="80">
        <template slot-scope="scope">
          {{BASE | optionKV(scope.row.base)}}
        </template>
      </el-table-column>

      <el-table-column
        label="企业邮箱"
        width="200">
        <template slot-scope="scope">
          {{(scope.row.companyemail)}}
        </template>
      </el-table-column>

      <el-table-column
        label="所属部门"
        width="120">
        <template slot-scope="scope">
          {{(scope.row.dependenceDep)}}
        </template>
      </el-table-column>

      <el-table-column
        label="职位"
        width="200">
        <template slot-scope="scope">
          {{(scope.row.position)}}
        </template>
      </el-table-column>

      <el-table-column
        label="部门总监"
        width="120">
        <template slot-scope="scope">
          {{(scope.row.depDirector)}}
        </template>
      </el-table-column>

      <el-table-column
        label="入职方式"
        width="80">
        <template slot-scope="scope">
          {{ENTRY_TYPE | optionKV(scope.row.entryType)}}
        </template>
      </el-table-column>

      <el-table-column
        label="入职地点"
        width="120">
        <template slot-scope="scope">
          {{BASE | optionKV(scope.row.entryAddress)}}
        </template>
      </el-table-column>

      <el-table-column
        label="实习起始日"
        width="180">
        <template slot-scope="scope">
          {{(scope.row.internshipbegin)}}
        </template>
      </el-table-column>

      <el-table-column
        label="实习到期日"
        width="180">
        <template slot-scope="scope">
          {{(scope.row.internshipending)}}
        </template>
      </el-table-column>

      <el-table-column
        label="转正日期"
        width="180">
        <template slot-scope="scope">
          {{(scope.row.conversionregTime)}}
        </template>
      </el-table-column>

      <el-table-column
        label="合同签订日"
        width="180">
        <template slot-scope="scope">
          {{(scope.row.contractsigning)}}
        </template>
      </el-table-column>

      <el-table-column
        label="合同截止日"
        width="180">
        <template slot-scope="scope">
          {{(scope.row.contractending)}}
        </template>
      </el-table-column>

      <el-table-column
        label="福利地区"
        width="120">
        <template slot-scope="scope">
          {{BASE | optionKV(scope.row.welfarearea)}}
        </template>
      </el-table-column>

      <el-table-column
        label="操作按钮"
        width="120"
        fixed="right">
        <template slot-scope="scope">
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(scope.row)" class="btn btn-xs btn-info">
              <!--详情-->
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(scope.row.id)" class="btn btn-xs btn-danger">
              <i class="ace-icon fa fa-trash-o bigger-120"></i>
            </button>
          </div>
        </template>
      </el-table-column>

    </el-table>


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
            <el-form ref="employeeinfo" :rules="rules" :model="employeeinfo" label-width="120px">

              <el-form-item label="姓名">
                <el-input v-model="employeeinfo.name"></el-input>
              </el-form-item>

              <el-form-item label="工号">
                <el-input v-model="employeeinfo.jobNum"></el-input>
              </el-form-item>

              <el-form-item label="归属公司" >
                <el-select v-model="employeeinfo.base" filterable placeholder="请选择归属公司">
                  <el-option
                    v-for="o in BASE"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="企业邮箱" prop="companyemail">
                <el-input v-model="employeeinfo.companyemail"></el-input>
              </el-form-item>

              <el-form-item label="所属部门">
                <el-input v-model="employeeinfo.dependenceDep"></el-input>
              </el-form-item>

              <el-form-item label="职位">
                <el-input v-model="employeeinfo.position"></el-input>
              </el-form-item>

              <el-form-item label="部门总监">
                <el-input v-model="employeeinfo.depDirector"></el-input>
              </el-form-item>

              <el-form-item label="入职方式" >
                <el-select v-model="employeeinfo.entryType" filterable placeholder="请选择入职方式">
                  <el-option
                    v-for="o in ENTRY_TYPE"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="入职地点" >
                <el-select v-model="employeeinfo.entryAddress" filterable placeholder="请选择入职地点">
                  <el-option
                    v-for="o in BASE"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="实习起止日">
                <el-date-picker
                  v-model="internship_date"
                  type="daterange"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  range-separator="-"
                  :editable="false"
                  start-placeholder="实习起始日"
                  end-placeholder="实习到期日">
                </el-date-picker>
              </el-form-item>

              <el-form-item label="转正日期">
                <el-input v-model="employeeinfo.conversionregTime"></el-input>
              </el-form-item>

              <el-form-item label="合同起止日">
                <el-date-picker
                  v-model="contract_date"
                  type="daterange"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  range-separator="-"
                  :editable="false"
                  start-placeholder="合同签订日"
                  end-placeholder="合同截止日">
                </el-date-picker>
              </el-form-item>

              <el-form-item label="福利地区" >
                <el-select v-model="employeeinfo.welfarearea" filterable placeholder="请选择福利地区">
                  <el-option
                    v-for="o in BASE"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

            </el-form>
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
  import ElementUI from "element-ui";
  export default {
    name: 'business-employeeinfo',
    components: {Pagination,ElementUI},
    data:function(){

      const checkEmail = (rule, value, callback) => {
        const mailReg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
        if (!value) {
          return callback(new Error('邮箱不能为空'))
        }
        setTimeout(() => {
          if (mailReg.test(value)) {
            callback()
          } else {
            callback(new Error('请输入正确的邮箱格式'))
          }
        }, 100)
      };
      return{
        employeeinfo:{},
        employeeinfos:[],
        contract_date:'',
        internship_date:'',
        BASE:BASE,
        ENTRY_TYPE:ENTRY_TYPE,
        rules: {
          companyemail: [
            { validator: checkEmail, trigger: 'blur' ,required: true,}
          ],
        },
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
        this.contract_date='';
        this.internship_date='';
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
        _this.employeeinfo.contractsigning = this.contract_date[0];
        _this.employeeinfo.contractending = this.contract_date[1];
        _this.employeeinfo.internshipbegin = this.internship_date[0];
        _this.employeeinfo.internshipending = this.internship_date[1];
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
          || !Validator.require(_this.employeeinfo.position, "职位")
          || !Validator.length(_this.employeeinfo.position, "职位", 1, 20)
          || !Validator.length(_this.employeeinfo.depDirector, "部门总监", 1, 20)
          || !Validator.require(_this.employeeinfo.entryAddress, "入职地点")
          || !Validator.length(_this.employeeinfo.welfarearea, "福利地区", 1, 20)
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