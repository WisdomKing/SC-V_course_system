Loading = {
  show: function () {
    $.blockUI({
      message: '<img src="/static/image/loading.gif" />',
      //让图片居中显示
      css: {
        zIndex: "10011",
        padding: "10px",
        left: "50%",
        width: "80px",
        marginLeft: "-40px",
      }
    });
  },
  hide: function () {
    // 本地查询速度太快，loading显示一瞬间，故意做个延迟
    setTimeout(function () {
      //实际上起作用的只有这句
      $.unblockUI();
    }, 50)
  }
};
