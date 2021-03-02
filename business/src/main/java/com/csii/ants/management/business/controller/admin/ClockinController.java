package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.ClockinDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.ClockinService;
import com.csii.ants.management.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:公告模块
 */

@RestController
@RequestMapping("/admin/clockin")
public class ClockinController {
    private static final Logger Log= LoggerFactory.getLogger(ClockinController.class);
    public static final String BUSINESS_NAME="报工";

    @Resource
    private ClockinService clockinService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        clockinService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param clockinDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ClockinDto clockinDto) {
        Log.info("clockinDto:{}",clockinDto);

        // 保存校验
        ValidatorUtil.require(clockinDto.getProjectname(), "项目名称");
        ValidatorUtil.length(clockinDto.getProjectname(), "项目名称", 1, 50);
        ValidatorUtil.require(clockinDto.getManhourType(), "工时类型");
        ValidatorUtil.require(clockinDto.getManhour(), "工时");
        ValidatorUtil.length(clockinDto.getManhour(), "工时", 1, 20);
        ValidatorUtil.length(clockinDto.getDelayed(), "延时", 1, 20);
        ValidatorUtil.require(clockinDto.getWorklog(), "工作日志");
        ValidatorUtil.length(clockinDto.getWorklog(), "工作日志", 1, 100);

        ResponseDto responseDto=new ResponseDto();
        clockinService.save(clockinDto);
        responseDto.setContent(clockinDto);
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
        clockinService.delete(id);
        return responseDto;
    }
}
