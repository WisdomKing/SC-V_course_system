<template>
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
    <tr>
      <td class="center">
        <label class="pos-rel">
          <input type="checkbox" class="ace"/>
          <span class="lbl"></span>
        </label>
      </td>

      <td class="center">
        <div class="action-buttons">
          <a href="#" class="green bigger-140 show-details-btn" title="Show Details">
            <i class="ace-icon fa fa-angle-double-down"></i>
            <span class="sr-only">Details</span>
          </a>
        </div>
      </td>

      <td>
        <a href="#">ace.com</a>
      </td>
      <td>$45</td>
      <td class="hidden-480">3,330</td>
      <td>Feb 12</td>

      <td class="hidden-480">
        <span class="label label-sm label-warning">Expiring</span>
      </td>

      <td>
        <div class="hidden-sm hidden-xs btn-group">
          <button class="btn btn-xs btn-success">
            <i class="ace-icon fa fa-check bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-info">
            详情
<!--            <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>-->
          </button>

          <button class="btn btn-xs btn-danger">
            <i class="ace-icon fa fa-trash-o bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-warning">
            <i class="ace-icon fa fa-flag bigger-120"></i>
          </button>
        </div>

        <div class="hidden-md hidden-lg">
          <div class="inline pos-rel">
            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
              <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
            </button>

            <ul
              class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
              <li>
                <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
  <span class="blue">
  <i class="ace-icon fa fa-search-plus bigger-120"></i>
  </span>
                </a>
              </li>

              <li>
                <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
  <span class="green">
  <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
  </span>
                </a>
              </li>

              <li>
                <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
  <span class="red">
  <i class="ace-icon fa fa-trash-o bigger-120"></i>
  </span>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>123</td>
      <td>3,330</td>
      <td>Feb 12</td>
      <td></td>
      <td>
        <div class="hidden-sm hidden-xs btn-group">
          <button class="btn btn-xs btn-success">
            <i class="ace-icon fa fa-check bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-info">
            <i class="ace-icon fa fa-pencil bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-danger">
            <i class="ace-icon fa fa-trash-o bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-warning">
            <i class="ace-icon fa fa-flag bigger-120"></i>
          </button>
        </div>

        <div class="hidden-md hidden-lg">
          <div class="inline pos-rel">
            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
              <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
            </button>

            <ul
              class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
              <li>
                <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
  <span class="blue">
  <i class="ace-icon fa fa-search-plus bigger-120"></i>
  </span>
                </a>
              </li>

              <li>
                <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
  <span class="green">
  <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
  </span>
                </a>
              </li>

              <li>
                <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
  <span class="red">
  <i class="ace-icon fa fa-trash-o bigger-120"></i>
  </span>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </td>
    </tr>

    </tbody>
  </table>
</template>

<script>
  export default {
    name: 'announcement',
    data:function(){
      return{
        announcements:[]
      }
    },
    mounted: function () {
      let _this=this;
      _this.list();
      //Sidebar激活样式方法1
      // this.$parent.activeSidebar("business-announcement-sidebar");   //以后通过watch监听来激活菜单了，不再通过这条语句去激活，免于每一个页面都要写
    },
    methods: {
      list(){
        let _this=this;
        _this.$ajax.get('http://127.0.0.1:9000/business/admin/announcement/list').then((respond)=>{
          console.log("查询公告列表结果:",respond);
          _this.announcements=respond.data;
        })
      }
    }
  }
</script>