package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.departmentDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.departmentService;
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
@RequestMapping("/admin/department")
public class departmentController {
    private static final Logger Log= LoggerFactory.getLogger(departmentController.class);
    public static final String BUSINESS_NAME="部门";

    @Resource
    private departmentService departmentService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        departmentService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param departmentDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody departmentDto departmentDto) {
        Log.info("departmentDto:{}",departmentDto);

        // 保存校验
        ValidatorUtil.require(departmentDto.getDepid(), "部门id");
        ValidatorUtil.require(departmentDto.getDepname(), "部门名称");
        ValidatorUtil.length(departmentDto.getDepname(), "部门名称", 1, 20);
        ValidatorUtil.length(departmentDto.getDepdirector(), "部门总监", 1, 20);

        ResponseDto responseDto=new ResponseDto();
        departmentService.save(departmentDto);
        responseDto.setContent(departmentDto);
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
        departmentService.delete(id);
        return responseDto;
    }
}
