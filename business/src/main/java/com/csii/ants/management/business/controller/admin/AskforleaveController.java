package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.AskforleaveDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.AskforleaveService;
import com.csii.ants.management.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:模块
 */

@RestController
@RequestMapping("/admin/askforleave")
public class AskforleaveController {
    private static final Logger Log= LoggerFactory.getLogger(AskforleaveController.class);
    public static final String BUSINESS_NAME="请假";

    @Resource
    private AskforleaveService askforleaveService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        askforleaveService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param askforleaveDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody AskforleaveDto askforleaveDto) {
        Log.info("askforleaveDto:{}",askforleaveDto);

        // 保存校验
        ValidatorUtil.require(askforleaveDto.getJobNum(), "工号");
        //对于数字的，因为freemark自身的原因，使用"field.length"会将"2000"变成"2,000"
        //,应该使用"field.length?c",小写的"c"的意思是将数值转成字符串的一个函数
        ValidatorUtil.length(askforleaveDto.getJobNum(), "工号", 1, 5);
        ValidatorUtil.require(askforleaveDto.getLeavetype(), "请假类型");
        ValidatorUtil.require(askforleaveDto.getLeavetimebengin(), "请假时间开始");
        ValidatorUtil.require(askforleaveDto.getLeavetimeending(), "请假时间结束");
        ValidatorUtil.require(askforleaveDto.getDetails(), "请假说明");
        //对于数字的，因为freemark自身的原因，使用"field.length"会将"2000"变成"2,000"
        //,应该使用"field.length?c",小写的"c"的意思是将数值转成字符串的一个函数
        ValidatorUtil.length(askforleaveDto.getDetails(), "请假说明", 1, 100);

        ResponseDto responseDto=new ResponseDto();
        askforleaveService.save(askforleaveDto);
        responseDto.setContent(askforleaveDto);
        return responseDto;
    }

    /**
     * 删除
     * @param id
     * @return responseDto
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable String id) {
        Log.info("id:{}",id);
        ResponseDto responseDto=new ResponseDto();
        askforleaveService.delete(id);
        return responseDto;
    }
}
