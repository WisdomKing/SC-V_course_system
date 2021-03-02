package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.HeadlineDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.HeadlineService;
import com.csii.ants.management.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:头条模块
 */

@RestController
@RequestMapping("/admin/headline")
public class HeadlineController {
    private static final Logger Log= LoggerFactory.getLogger(HeadlineController.class);
    public static final String BUSINESS_NAME="头条";

    @Resource
    private HeadlineService headlineService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        headlineService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param headlineDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody HeadlineDto headlineDto) {
        Log.info("headlineDto:{}",headlineDto);

        // 保存校验
        ValidatorUtil.length(headlineDto.getDetails(), "详情", 1, 50);

        ResponseDto responseDto=new ResponseDto();
        headlineService.save(headlineDto);
        responseDto.setContent(headlineDto);
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
        headlineService.delete(id);
        return responseDto;
    }
}
