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

        <td>{{NATIONALITY | optionKV(personalinfo.ethnicity)}}</td>
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
    <div id="form-modal" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">个人信息-请认真核对个人信息</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <el-form ref="personalinfo" :rules="rules" :model="personalinfo" label-width="120px">

              <el-form-item label="姓名" prop="name">
                <el-input v-model="personalinfo.name"></el-input>
              </el-form-item>

              <el-form-item label="性别" prop="sex">
                <el-select v-model="personalinfo.sex" placeholder="请选择性别">
                  <el-option
                    v-for="o in SEX"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

<!--              <el-form-item label="民族" prop="ethnicity">-->
<!--                <el-input v-model="personalinfo.ethnicity"></el-input>-->
<!--              </el-form-item>-->

              <el-form-item label="民族" prop="ethnicity">
                <el-select v-model="personalinfo.ethnicity" placeholder="请选择">
                  <el-option
                    v-for="o in NATIONALITY"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="身份证号" prop="idnum">
                <el-input
                  v-model="personalinfo.idnum"
                  onkeyup="this.value=this.value.replace(/[^\X0-9]/g, '')">
                </el-input>
              </el-form-item>

              <el-form-item label="政治面貌">
                <el-select v-model="personalinfo.politicaloutlook" placeholder="请选择政治面貌">
                  <el-option
                    v-for="o in POLITICAL_OUTLOOK"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="出生日期">
                <el-input v-model="personalinfo.dateofbirth"></el-input>
              </el-form-item>

              <el-form-item label="个人邮箱" prop="personalemail">
                <el-input v-model="personalinfo.personalemail"></el-input>
              </el-form-item>

              <el-form-item label="户口性质">
                <el-input v-model="personalinfo.regisType"></el-input>
              </el-form-item>

              <el-form-item label="户口所在地">
                <el-input v-model="personalinfo.regisResidence"></el-input>
              </el-form-item>

              <el-form-item label="婚否">
                <el-select v-model="personalinfo.maritalstatus" placeholder="请选择婚否">
                  <el-option
                    v-for="o in MARITAL_STATUS"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="毕业院校">
                <el-input v-model="personalinfo.gradUnversity"></el-input>
              </el-form-item>

              <el-form-item label="毕业时间">
                <el-input v-model="personalinfo.gradTime"></el-input>
              </el-form-item>

              <el-form-item label="专业">
                <el-input v-model="personalinfo.speciality"></el-input>
              </el-form-item>

              <el-form-item label="学历">
                <el-select v-model="personalinfo.degree" placeholder="请选择学历">
                  <el-option
                    v-for="o in DEGREE"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="籍贯" >
                <el-select v-model="personalinfo.nativeplace" filterable placeholder="请选择籍贯">
                  <el-option
                    v-for="o in PROVINCE"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="现住址">
                <el-input v-model="personalinfo.presentaddress"></el-input>
              </el-form-item>

              <el-form-item label="手机号" prop="telephone">
                <el-input v-model="personalinfo.telephone"></el-input>
              </el-form-item>

              <el-form-item label="qq号">
                <el-input v-model="personalinfo.qqnum"></el-input>
              </el-form-item>

              <el-form-item label="微信">
                <el-input v-model="personalinfo.wechat"></el-input>
              </el-form-item>

              <el-form-item label="紧急联系人关系">
                <el-select v-model="personalinfo.emergencycontactrel" placeholder="请选择">
                  <el-option
                    v-for="o in EMERGENCY_CONTACT_REL"
                    :key="o.value"
                    :label="o.value"
                    :value="o.key">
                  </el-option>
                </el-select>
              </el-form-item>

              <el-form-item label="紧急联系人姓名">
                <el-input v-model="personalinfo.emergencycontactname"></el-input>
              </el-form-item>

              <el-form-item label="紧急联系人电话">
                <el-input v-model="personalinfo.emergencycontacttel"></el-input>
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
    name: 'business-personalinfo',
    components: {Pagination,ElementUI},
    data:function() {
      //
      var checkIdnum = (rule, value, callback) => {
        if (!value) {
          return callback(new Error("身份证号不能为空"));
        }
        if (!/(^\d{15}$)|(^\d{17}(\d|X|x)$)/.test(value)) {
          callback(new Error("你输入的身份证长度或格式错误"));
        }
        //身份证城市
        var aCity = {
          11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古",
          21: "辽宁", 22: "吉林", 23: "黑龙江",
          31: "上海", 32: "江苏", 33: "浙江", 34: "安徽", 35: "福建", 36: "江西", 37: "山东",
          41: "河南", 42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南",
          50: "重庆", 51: "四川", 52: "贵州", 53: "云南", 54: "西藏",
          61: "陕西", 62: "甘肃", 63: "青海", 64: "宁夏", 65: "新疆",
          71: "台湾", 81: "香港", 82: "澳门", 91: "国外"
        };
        if (!aCity[parseInt(value.substr(0, 2))]) {
          callback(new Error("你的身份证地区非法"));
        }
        // 出生日期验证
        var sBirthday = (
            value.substr(6, 4) +
            "-" +
            Number(value.substr(10, 2)) +
            "-" +
            Number(value.substr(12, 2))
          ).replace(/-/g, "/"),
          d = new Date(sBirthday);
        if (
          sBirthday !=
          d.getFullYear() + "/" + (d.getMonth() + 1) + "/" + d.getDate()
        ) {
          callback(new Error("身份证上的出生日期非法"));
        }

        // 身份证号码校验
        var sum = 0,
          weights = [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2],
          codes = "10X98765432";
        for (var i = 0; i < value.length - 1; i++) {
          sum += value[i] * weights[i];
        }
        var last = codes[sum % 11]; //计算出来的最后一位身份证号码
        if (value[value.length - 1] != last) {
          callback(new Error("你输入的身份证号非法"));
        }
        callback();
      };

      const checkPhone = (rule, value, callback) => {
        const phoneReg = /^1[3|4|5|7|8|9][0-9]{9}$/
        if (!value) {
          return callback(new Error('电话号码不能为空'))
        }
        setTimeout(() => {
          // Number.isInteger是es6验证数字是否为整数的方法,但是我实际用的时候输入的数字总是识别成字符串
          // 所以我就在前面加了一个+实现隐式转换
          if (!Number.isInteger(+value)) {
            callback(new Error('请输入数字值'))
          } else {
            if (phoneReg.test(value)) {
              callback()
            } else {
              callback(new Error('电话号码格式/长度不正确'))
            }
          }
        }, 100)
      }
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
//

      return {
        personalinfo:{},
        personalinfos:[],
        SEX:SEX,
        EMERGENCY_CONTACT_REL:EMERGENCY_CONTACT_REL,
        DEGREE:DEGREE,
        MARITAL_STATUS:MARITAL_STATUS,
        POLITICAL_OUTLOOK:POLITICAL_OUTLOOK,
        PROVINCE:PROVINCE,
        NATIONALITY:NATIONALITY,
        rules: {
          telephone: [
            { validator: checkPhone, trigger: 'blur' ,required: true,}
          ],
          personalemail: [
            { validator: checkEmail, trigger: 'blur' ,required: true,}
          ],
          name: [
            { trigger: 'blur' ,required: true,}
          ],
          sex: [
            { trigger: 'blur' ,required: true,}
          ],
          ethnicity: [
            { trigger: 'blur' ,required: true,}
          ],
          idnum: [
            { validator : checkIdnum, trigger: 'blur' ,required: true,}
          ],
        },

      };
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
        // this.relation=_this.personalinfo.emergencycontactrel;
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
      },
    }
  }
</script>
