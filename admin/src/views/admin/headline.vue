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
    <div class="row">
      <div v-for="headline in headlines" class="col-md-3">
        <div>
          <span class="profile-picture">
            <img v-show="!headline.image" class="editable img-responsive editable-click editable-empty" src="/static/image/头像1.jpg" v-bind:title="headline.title"/>
            <img v-show="headline.image" class="editable img-responsive editable-click editable-empty" v-bind:src="headline.image" v-bind:title="headline.title"/>
          </span>

          <div class="space-4"></div>

          <div class="width-85 label label-info label-xlg arrowed-in arrowed-in-right">
            <div class="inline position-relative">
              <a href="javascript:;" class="user-title-label dropdown-toggle" data-toggle="dropdown">
                <i class="ace-icon fa fa-circle light-green"></i>
                &nbsp;
                <span class="white">{{headline.title}}</span>
              </a>
            </div>
          </div>
        </div>

        <div class="space-6"></div>

        <div class="text-center">
          <a href="javascript:;" class="text-info bigger-110" v-bind:title="headline.title">
            <i class="ace-icon fa fa-user"></i>
            {{headline.createdtime}}|{{headline.updatedtime}}
          </a>
        </div>

        <div class="space-6"></div>

        <div class="profile-social-links align-center">
          <button v-on:click="edit(headline)" class="btn btn-xs btn-info">
            <i class="ace-icon fa fa-pencil bigger-120"></i>
          </button>
          &nbsp;
          <button v-on:click="del(headline.id)" class="btn btn-xs btn-danger">
            <i class="ace-icon fa fa-trash-o bigger-120"></i>
          </button>
        </div>

        <div class="hr hr16 dotted"></div>

      </div>
    </div>

    <!-- 模态框 -->
    <div id="form-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">头条</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <el-form ref="headline" :rules="rules" :model="headline" label-width="120px">

              <el-form-item label="标题">
                <el-input v-model="headline.title"></el-input>
              </el-form-item>

              <el-form-item label="详情">
                <el-input v-model="headline.details"></el-input>
              </el-form-item>

              <el-form-item label="图片">
                <file v-bind:id="'image-upload'"
                      v-bind:text="'上传头像'"
                      v-bind:suffixs="['jpg', 'jpeg', 'png']"
                      v-bind:after-upload="afterUpload"></file>
              </el-form-item>

<!--              <div class="form-group">-->
<!--                <label class="col-sm-2 control-label">图片</label>-->
<!--                <div class="col-sm-10">-->
<!--                  <file v-bind:id="'image-upload'"-->
<!--                        v-bind:text="'上传头像'"-->
<!--                        v-bind:suffixs="['jpg', 'jpeg', 'png']"-->
<!--                        v-bind:after-upload="afterUpload"></file>-->
<!--                </div>-->
<!--              </div>-->
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
  import File from "../../components/file";
  export default {
    name: 'business-headline',
    components: {File, Pagination},
    data:function(){
      return{
        headline:{},
        headlines:[]
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
        _this.headline={}
        // _this.headline.createdtime=new Date();

        $("#form-modal").modal("show");
      },
      /**
       * 点击编辑
       */
      edit(headline){
        let _this=this;
        //将数据带到模态框里
        _this.headline=$.extend({},headline);
        $("#form-modal").modal("show");
      },
      /**
       * 列表查询
       */
      list(page){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/headline/list',{
          page:page,
          size:_this.$refs.pagination.size,
        }).then((respond)=>{
          Loading.hide();
          let resp=respond.data;
          _this.headlines=resp.content.list;
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
          || !Validator.length(_this.headline.details, "详情", 1, 50)
        ) {
          return;
        }

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/headline/save',
_this.headline).then((respond)=>{
          Loading.hide();
          // console.log("保存头条列表结果:",respond);
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
        Confirm.show("删除头条后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/business/admin/headline/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除头条列表结果:",respond);
            let resp=respond.data;
            if (resp.success){
              _this.list(1);
              Toast.success("删除成功");
            }
          })
        });
      },
      afterUpload(resp) {
        let _this = this;
        let image = resp.content.path;
        _this.headline.image = image;
      }
    }
  }
</script>
<!-- 视频样式调整，暂时不用 -->
<style scoped>
  video {
    width: 100%;
    height: auto;
    margin-top: 10px;
  }
</style>