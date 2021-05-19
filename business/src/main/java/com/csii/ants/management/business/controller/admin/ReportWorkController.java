package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.ReportWorkDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.ReportWorkService;
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
@RequestMapping("/admin/reportWork")
public class ReportWorkController {
    private static final Logger Log= LoggerFactory.getLogger(ReportWorkController.class);
    public static final String BUSINESS_NAME="考勤";

    @Resource
    private ReportWorkService reportWorkService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        reportWorkService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param reportWorkDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ReportWorkDto reportWorkDto) {
        Log.info("reportWorkDto:{}",reportWorkDto);

        // 保存校验
        ValidatorUtil.require(reportWorkDto.getJobNum(), "工号");

        ResponseDto responseDto=new ResponseDto();
        reportWorkService.save(reportWorkDto);
        responseDto.setContent(reportWorkDto);
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
        reportWorkService.delete(id);
        return responseDto;
    }
}
