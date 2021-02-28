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
<#list fieldList as field>
          <#if field.nameHump!="createdAt" && field.nameHump!="updatedAt">
        <th>${field.nameCn}</th>
          </#if>
        </#list>
        <th>操作按钮</th>
      </tr>
      </thead>

      <tbody>
      <tr v-for="${domain} in ${domain}s">
        <#list fieldList as field>
          <#if field.nameHump!="createdAt" && field.nameHump!="updatedAt">
        <td>{{${domain}.${field.nameHump}}}</td>
          </#if>
        </#list>
        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(${domain})" class="btn btn-xs btn-info">
              <!--详情-->
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(${domain}.id)" class="btn btn-xs btn-danger">
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
            <h4 class="modal-title">${tableNameCn}</h4>
          </div>
          <div class="modal-body">
            <!-- 表单 -->
            <form class="form-horizontal">
              <#list fieldList as field>
                <#if field.name!="id" && field.nameHump!="createdAt" && field.nameHump!="updatedAt">
                <div class="form-group">
                  <label class="col-sm-2 control-label">${field.nameCn}</label>
                  <div class="col-sm-10">
                    <input v-model="${domain}.${field.nameHump}" class="form-control" placeholder="${field.nameCn}">
                  </div>
                </div>
                </#if>
              </#list>
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
    name: '${domain}',
    components: {Pagination},
    data:function(){
      return{
        ${domain}:{},
        ${domain}s:[]
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
        _this.${domain}={}
        $("#form-modal").modal("show");
      },
      /**
       * 点击编辑
       */
      edit(${domain}){
        let _this=this;
        //将数据带到模态框里
        _this.${domain}=$.extend({},${domain});
        $("#form-modal").modal("show");
      },
      /**
       * 列表查询
       */
      list(page){
        let _this=this;
        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/${module}/admin/${domain}/list',{
          page:page,
          size:_this.$refs.pagination.size,
        }).then((respond)=>{
          Loading.hide();
          let resp=respond.data;
          _this.${domain}s=resp.content.list;
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
        <#list fieldList as field>
          <#if field.name!="id" && field.nameHump!="createdAt" && field.nameHump!="updatedAt" && field.nameHump!="sort">
            <#if !field.nullAble>
          || !Validator.require(_this.${domain}.${field.nameHump}, "${field.nameCn}")
            </#if>
            <#if (field.length > 0)>
          || !Validator.length(_this.${domain}.${field.nameHump}, "${field.nameCn}", 1, ${field.length?c})
            </#if>
          </#if>
        </#list>
        ) {
          return;
        }

        Loading.show();
        _this.$ajax.post(process.env.VUE_APP_SERVER+'/${module}/admin/${domain}/save',
_this.${domain}).then((respond)=>{
          Loading.hide();
          // console.log("保存${tableNameCn}列表结果:",respond);
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
        Confirm.show("删除${tableNameCn}后不可恢复，确认删除?",function () {
          Loading.show();
          _this.$ajax.delete(process.env.VUE_APP_SERVER+'/${module}/admin/${domain}/delete/'+id).then((respond)=>{
            Loading.hide();
            // console.log("删除${tableNameCn}列表结果:",respond);
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