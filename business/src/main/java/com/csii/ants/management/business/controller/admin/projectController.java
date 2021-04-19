package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.projectDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.projectService;
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
@RequestMapping("/admin/project")
public class projectController {
    private static final Logger Log= LoggerFactory.getLogger(projectController.class);
    public static final String BUSINESS_NAME="项目";

    @Resource
    private projectService projectService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        projectService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param projectDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody projectDto projectDto) {
        Log.info("projectDto:{}",projectDto);

        // 保存校验
        ValidatorUtil.require(projectDto.getProid(), "项目id");
        ValidatorUtil.require(projectDto.getProname(), "项目名称");
        ValidatorUtil.length(projectDto.getProname(), "项目名称", 1, 20);
        ValidatorUtil.length(projectDto.getDepid(), "部门id", 1, 20);

        ResponseDto responseDto=new ResponseDto();
        projectService.save(projectDto);
        responseDto.setContent(projectDto);
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
        projectService.delete(id);
        return responseDto;
    }
}
