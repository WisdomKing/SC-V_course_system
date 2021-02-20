<template>
  <div>
    <h1>hello,welcome</h1>
  </div>
</template>
<script>
  export default {
    name: 'welcome',
    mounted:function() {
      this.$parent.activeSidebar("welcoe-sidebar");
    },
    methods:{
    }
  }
</script>