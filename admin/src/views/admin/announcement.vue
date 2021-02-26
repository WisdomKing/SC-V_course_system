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
        <th>公告标题</th>
        <th>公告类型</th>
        <th>开始时间</th>
        <th>结束时间</th>
        <th>操作按钮</th>
      </tr>
      </thead>

      <tbody>
      <tr v-for="announcement in announcements">
        <td>{{announcement.announcementtitle}}</td>
        <td>{{announcement.announcementtype}}</td>
        <td>{{announcement.begintime}}</td>
        <td>{{announcement.endingtime}}</td>
        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(announcement)" class="btn btn-xs btn-info">
<!--              详情-->
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(announcement.id)" class="btn btn-xs btn-danger">
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
            <h4 class="modal-title">公告</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
              <div class="form-group">
                <label class="col-sm-2 control-label">公告标题</label>
                <div class="col-sm-10">
                  <input v-model="announcement.announcementtitle" class="form-control" placeholder="公告标题">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">公告类型</label>
                <div class="col-sm-10">
                  <input v-model="announcement.announcementtype" class="form-control" placeholder="公告类型">
                </div>
              </div>

              <div class="form-group">
                <label class="col-sm-2 control-label">开始时间</label>
                <div class="col-sm-10">
                  <input v-model="announcement.begintime" class="form-control" placeholder="开始时间">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">结束时间</label>
                <div class="col-sm-10">
                  <input v-model="announcement.endingtime" class="form-control" placeholder="结束时间">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">详情</label>
                <div class="col-sm-10">
<!--                  <input v-model="announcement.details" class="form-control" placeholder="详情，限50字">-->
                  <textarea v-model="announcement.details" class="form-control" placeholder="详情，限50字"/>
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
    name: 'announcement',
    components: {Pagination},
    data:function(){
      return{
        announcement:{},
        announcements:[]
      }
    },
    mounted: function () {
      let _this=this;
      //自定义初始每页5条
      _this.$refs.pagination.size=5;
      _this.list();
      //Sidebar激活样式方法1
      // this.$parent.activeSidebar("business-announcement-sidebar");   //以后通过watch监听来激活菜单了，不再通过这条语句去激活，免于每一个页面都要写
    },
    methods: {
      /**
       * 点击新增
       */
      add(){
        let _this=this;
        //模态框打开时清空上次的数据
        _this.announcement={}
        $("#form-modal").modal("show");
      },
      /**
       * 点击编辑
       */
      edit(announcement){
        let _this=this;
        //将数据带到模态框里
        _this.announcement=$.extend({},announcement);
        $("#form-modal").modal("show");
      },
      /**
       * 列表查询
       */
      list(page){
        let _this=this;
        _this.$ajax.get('http://127.0.0.1:9000/business/admin/announcement/list').then((respond)=>{
          console.log("查询公告列表结果:",respond);
          _this.announcements=respond.data;
        })
      },
      /**
       * 点击保存
       */
      save(page){
        let _this=this;
        // 保存校验，非空和长度
        if ( !Validator.require(_this.announcement.announcementtitle, "公告标题")
          || !Validator.length(_this.announcement.announcementtitle, "公告标题",1,20)

          || !Validator.require(_this.announcement.announcementtype, "公告类型")
          || !Validator.length(_this.announcement.announcementtype, "公告类型", 1, 20)

          || !Validator.require(_this.announcement.begintime, "开始时间")
          || !Validator.length(_this.announcement.begintime, "开始时间", 1, 10)

          || !Validator.require(_this.announcement.endingtime, "结束时间")
          || !Validator.length(_this.announcement.endingtime, "结束时间", 1, 10)

          || !Validator.require(_this.announcement.details, "详情")
          || !Validator.length(_this.announcement.details, "详情", 1, 50)
        ) {
          return;
        }

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/business/admin/announcement/save',
_this.announcement).then((respond)=>{
          Loading.hide();
          // console.log("保存公告列表结果:",respond);
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
        Confirm.show("删除公告后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/business/admin/announcement/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除公告列表结果:",respond);
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