<template>
  <div>
    <div id="navbar" class="navbar navbar-default ace-save-state">
      <div class="navbar-container ace-save-state" id="navbar-container">
        <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
          <span class="sr-only">Toggle sidebar</span>

          <span class="icon-bar"></span>

          <span class="icon-bar"></span>

          <span class="icon-bar"></span>
        </button>

        <div class="navbar-header pull-left">
          <a href="index.html" class="navbar-brand">
            <small>
              <i class="fa fa-leaf"></i>
              管理子模块
            </small>
          </a>
        </div>

        <div class="navbar-buttons navbar-header pull-right" role="navigation">
          <ul class="nav ace-nav">

            <li class="light-blue dropdown-modal">
              <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                <img class="nav-user-photo" src="../../public/ace/assets/images/avatars/user.jpg" alt="Jason's Photo" />
                <span class="user-info">
									<small>Welcome</small>
									{{loginUser.name}}
								</span>

                <i class="ace-icon fa fa-caret-down"></i>
              </a>

              <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
<!--                <li>-->
<!--                  <a href="#">-->
<!--                    <i class="ace-icon fa fa-cog"></i>-->
<!--                    系统设置-->
<!--                  </a>-->
<!--                </li>-->

<!--                <li>-->
<!--                  <a href="profile.html">-->
<!--                    <i class="ace-icon fa fa-user"></i>-->
<!--                    个人信息-->
<!--                  </a>-->
<!--                </li>-->

<!--                <li class="divider"></li>-->

                <li>
                  <a v-on:click="logout()" href="#">
                    <i class="ace-icon fa fa-power-off"></i>
                    退出登录
                  </a>
                </li>
              </ul>
            </li>
          </ul>
        </div>
      </div><!-- /.navbar-container -->
    </div>

    <div class="main-container ace-save-state" id="main-container">

      <div id="sidebar" class="sidebar responsive ace-save-state">

        <div class="sidebar-shortcuts" id="sidebar-shortcuts">
          <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
            <button class="btn btn-success">
              <i class="ace-icon fa fa-signal"></i>
            </button>

            <button class="btn btn-info">
              <i class="ace-icon fa fa-pencil"></i>
            </button>

            <button class="btn btn-warning">
              <i class="ace-icon fa fa-users"></i>
            </button>

            <button class="btn btn-danger">
              <i class="ace-icon fa fa-cogs"></i>
            </button>
          </div>

          <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
            <span class="btn btn-success"></span>

            <span class="btn btn-info"></span>

            <span class="btn btn-warning"></span>

            <span class="btn btn-danger"></span>
          </div>
        </div><!-- /.sidebar-shortcuts -->

        <ul class="nav nav-list">
          <li class="" id="welcome-sidebar">
            <router-link to="/welcome">
              <i class="menu-icon fa fa-tachometer"></i>
              <span class="menu-text"> 欢迎&nbsp;:&nbsp;{{loginUser.name}}</span>
            </router-link>

            <b class="arrow"></b>
          </li>

          <li v-show="hasResource('01')" class="" >
            <a href="#" class="dropdown-toggle">
              <i class="menu-icon fa fa-list"></i>
              <span class="menu-text"> 系统管理 </span>
              <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">

              <li v-show="hasResource('0101')" class="" id="system-user-sidebar">
                <router-link to="/system/user">
                  <i class="menu-icon fa fa-caret-right"></i>
                  用户管理
                </router-link>
                <b class="arrow"></b>
              </li>

              <li v-show="hasResource('0102')" class="" id="system-resource-sidebar">
                <router-link to="/system/resource">
                  <i class="menu-icon fa fa-caret-right"></i>
                  资源管理
                </router-link>
                <b class="arrow"></b>
              </li>

              <li v-show="hasResource('0103')" class="" id="system-role-sidebar">
                <router-link to="/system/role">
                  <i class="menu-icon fa fa-caret-right"></i>
                  角色管理
                </router-link>
                <b class="arrow"></b>
              </li>
            </ul>
          </li>

          <li v-show="hasResource('02')" class="">
            <a href="#" class="dropdown-toggle">
              <i class="menu-icon fa fa-list"></i>
              <span class="menu-text"> 通知管理 </span>
              <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
              <li v-show="hasResource('0201')" class="" id="business-announcement-sidebar">
                <router-link to="/business/announcement">
                  <i class="menu-icon fa fa-caret-right"></i>
                  公司公告
                </router-link>
                <b class="arrow"></b>
              </li>

              <li v-show="hasResource('0202')" class="" id="business-headline-sidebar">
                <router-link to="/business/headline">
                  <i class="menu-icon fa fa-caret-right"></i>
                  公司头条
                </router-link>
                <b class="arrow"></b>
              </li>

              <li v-show="hasResource('0203')" class="" id="business-companyinfo-sidebar">
                <router-link to="/business/companyinfo">
                  <i class="menu-icon fa fa-caret-right"></i>
                  公司信息
                </router-link>

                <b class="arrow"></b>
              </li>
            </ul>
          </li>

          <li v-show="hasResource('03')" class="">
            <a href="#" class="dropdown-toggle">
              <i class="menu-icon fa fa-bullhorn"></i>
              <span class="menu-text"> 考勤管理 </span>
              <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
              <li v-show="hasResource('0301')" class="" id="business-reportwork-sidebar">
                <router-link to="/business/reportwork">
                  <i class="menu-icon fa fa-caret-right"></i>
                  考勤
                </router-link>
                <b class="arrow"></b>
              </li>

              <li v-show="hasResource('0302')" class="" id="business-calendar-sidebar">
                <router-link to="/business/calendar">
                  <i class="menu-icon fa fa-caret-right"></i>
                  日历
                </router-link>
                <b class="arrow"></b>
              </li>
            </ul>
          </li>

          <li v-show="hasResource('04')" class="">
            <a href="#" class="dropdown-toggle">
              <i class="menu-icon fa fa-bullhorn"></i>
              <span class="menu-text"> 个人信息管理 </span>
              <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
              <li v-show="hasResource('0401')" class="" id="business-personalinfo-sidebar">
                <router-link to="/business/personalinfo">
                  <i class="menu-icon fa fa-caret-right"></i>
                  个人信息
                </router-link>
                <b class="arrow"></b>
              </li>

              <li v-show="hasResource('0402')" class="" id="business-employeeinfo-sidebar">
                <router-link to="/business/employeeinfo">
                  <i class="menu-icon fa fa-caret-right"></i>
                  员工信息
                </router-link>
                <b class="arrow"></b>
              </li>
            </ul>
          </li>

          <li v-show="hasResource('05')" class="">
            <a href="#" class="dropdown-toggle">
              <i class="menu-icon fa fa-list"></i>
              <span class="menu-text"> 文件管理 </span>
              <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
              <li v-show="hasResource('0501')" class="active" id="file-file-sidebar">
                <router-link to="/file/file">
                  <i class="menu-icon fa fa-caret-right"></i>
                  文件管理
                </router-link>
                <b class="arrow"></b>
              </li>

            </ul>
          </li>

        </ul><!-- /.nav-list -->

        <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
          <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
        </div>
      </div>

      <div class="main-content">
        <div class="main-content-inner">
          <div class="page-content">
            <div class="row">
              <div class="col-xs-12">
                <!-- PAGE CONTENT BEGINS -->
                  <router-view/>
                <!-- PAGE CONTENT ENDS -->
              </div><!-- /.col -->
            </div><!-- /.row -->
          </div><!-- /.page-content -->
        </div>
      </div><!-- /.main-content -->

      <div class="footer">
        <div class="footer-inner">
          <div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">COCOLI</span>
							管理系统子平台 &copy; 2020-2021
						</span>

            &nbsp; &nbsp;
            <span class="action-buttons">
							<a href="https://twitter.com">
								<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
							</a>

							<a href="https://www.facebook.com/">
								<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
							</a>

							<a href="https://www.baidu.com/">
								<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
							</a>
						</span>
          </div>
        </div>
      </div>

      <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
      </a>
    </div><!-- /.main-container -->
  </div>
</template>

<script>
  export default {
    name: 'admin',
    data: function() {
      return {
        loginUser: {},
      }
    },
    mounted:function() {
      let  _this=this;
      $('body').removeClass('login-layout light-login');
      $('body').attr('class', 'no-skin');
      // console.log("admin");
      //Sidebar激活样式方法2
      _this.activeSidebar(_this.$route.name.replace("/", "-") + "-sidebar");

      $.getScript('/ace/assets/js/ace.min.js');
      _this.loginUser = Tool.getLoginUser();
      },
    watch:{
      $route:{
        handler:function(val, oldVal){
          // sidebar激活样式方法二
          console.log("---->页面跳转：", val, oldVal);
          let _this = this;
          _this.$nextTick(function(){  //页面加载完成后执行
            _this.activeSidebar(_this.$route.name.replace("/", "-") + "-sidebar");
          })
        }
      }
    },
    methods:{
      /**
       * 查找是否有权限,没有权限就不显示相应的资源
       * @param id
       */
      hasResource(id) {
        return Tool.hasResource(id);
      },
      /**
       * 登录
       */
      login(){
        this.$router.push("/admin")
      },
      /**
       * 菜单激活样式，id是当前点击菜单的id
       * @param id
       */
      activeSidebar:function (id) {
        //兄弟菜单去掉active、
        // 样式，自身增加active样式
        $("#"+id).siblings().removeClass("active");
        $("#"+id).siblings().find("li").removeClass("active");
        $("#"+id).addClass("active");

        //如果有父菜单，父菜单的兄弟菜单去掉open active，父菜单增加open active
        let parentLi=$("#"+id).parent("li");
        if (parentLi){
          parentLi.siblings().removeClass("open active");
          parentLi.siblings().find("li").removeClass("active");
          parentLi.addClass("active");
        }
      },
      logout () {
        let _this = this;
        Loading.show();
        _this.$ajax.get(process.env.VUE_APP_SERVER + '/system/admin/user/logout/' + _this.loginUser.token).then((response)=>{
          Loading.hide();
          let resp = response.data;
          if (resp.success) {
            Tool.setLoginUser(null);
            _this.$router.push("/login")
          } else {
            Toast.warning(resp.message)
          }
        });
      },
    }
  }
</script>