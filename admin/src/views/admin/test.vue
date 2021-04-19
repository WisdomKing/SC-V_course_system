<template>
  <div>
    <el-calendar first-day-of-week="7">
      <template slot="dateCell" slot-scope="{date, data}">
        <div :class="data.isSelected ? 'is-selected' : ''" @click="calClick(data)">
<!--          {{ data.day.split('-').slice(1).join('-') }} {{ data.isSelected ? '✔️' : ''}}-->
          <p v-if="data.day.substr(-2)<10">{{data.day.substr(-1)}}</p>
          <p v-else>{{ data.day.substr(-2)}}</p>
          <div v-for="(item,index) in calendarData" :key="index">
            <div v-if="(item.years).indexOf(data.day.split('-').slice(0)[0])!=-1 && (item.months).indexOf(data.day.split('-').slice(1)[0])!=-1 && (item.days).indexOf(data.day.split('-').slice(2).join('-'))!=-1">
              <el-tooltip :content="item.things" placement="right">
                <div class="mark">{{item.things}}</div>
              </el-tooltip>
            </div>
            <div v-else></div>
          </div>
          <p class="addBtn" v-show="data.isSelected == true" @click="dialogVisible = true">添加日程</p>
        </div>
      </template>
    </el-calendar>

    <el-dialog
      :title="formData.data+'报工'"
      :visible.sync="dialogVisible"
      width="50%"
      :before-close="handleClose">
      <el-form @submit.native.prevent>
        <el-form-item>
<!--          <el-input v-model="formData.content"></el-input>-->
          <!-- 表单 -->
          <el-form ref="clockin" :rules="rules" :model="clockin" label-width="120px">
            <el-form-item label="项目名称" prop="name">
              <el-input v-model="clockin.projectname"></el-input>
            </el-form-item>
            <el-form-item label="工时类型" prop="name">
              <el-select v-model="clockin.manhourType" placeholder="请选择工时类型">
                <el-option
                  v-for="o in MANHOUR_TYPE"
                  :key="o.value"
                  :label="o.value"
                  :value="o.key">
                </el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="工时" prop="name">
              <el-input v-model="clockin.manhour"></el-input>
            </el-form-item>
            <el-form-item label="延时" prop="name">
              <el-input v-model="clockin.delayed"></el-input>
            </el-form-item>
            <el-form-item label="工作日志" prop="name">
              <el-input v-model="clockin.worklog"></el-input>
            </el-form-item>
          </el-form>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="dialogVisible = false,add()">确 定</el-button>
      </span>
    </el-dialog>

  </div>
</template>

<script>
  export default {
    name: "test",
    data:function (){
      return{
        clockin:{},
        clockins:[],
        MANHOUR_TYPE,
        CLOCKIN_STATUS,
        formData:{
          data:'',
          content: ''
        },
        dialogVisible: false,
        calendarData: [
          { years: ['2021'], months: ['04', '11'],days: ['13'],things: 'U享存补签' },
          { years: ['2021'], months: ['04', '11'], days: ['12'],things: 'U享存补签' },
          { years: ['2021'], months: ['04'], days: ['15'],things: '招生官测试' },
          { years: ['2021'], months: ['04'], days: ['16'],things: '招生官测试' },
          { years: ['2021'], months: ['04'], days: ['14'],things: '招生官测试' }
        ],
        value: new Date()
      }
    },
    methods: {
      calClick(item){
        console.log(item)
        this.formData.data = item.day
      },
      handleClose(done){
        done()
      },
      add(){
        var date = this.formData.data.split('-')
        var a =  {
          years: [date[0]],
          months: [date[1]],
          days: [date[2]],
          things: this.formData.content }
        this.calendarData.push(a)
      }
    }
  }
</script>

<style scoped>
  .is-selected {
    color:#F8A535;
  }
  .mark{
    padding: 8px 8px 0 8px;
    color: #F8A535;
    z-index: -1;
  }
</style>