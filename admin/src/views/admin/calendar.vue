<template>
  <div>
    <div class="block">
      <el-date-picker
        v-model="value1"
        type="daterange"
        range-separator="-"
        :editable="false"
        size="large"
        start-placeholder="开始日期"
        end-placeholder="结束日期">
      </el-date-picker>
    </div>
  </div>
</template>

<script>
  import ElementUI from "element-ui";

  export default {
    name: 'announcement',
    components: {
      ElementUI
    },
    data() {
      return {
        value1: '',
        value2: ''
      };
    },
    methods:{
      selectTime(value1){
        console.log(value1)
      },


    }
  };
</script>