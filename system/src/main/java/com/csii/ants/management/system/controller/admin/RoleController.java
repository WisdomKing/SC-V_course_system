package com.csii.ants.management.system.controller.admin;

import com.csii.ants.management.server.dto.RoleDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.RoleService;
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
@RequestMapping("/admin/role")
public class RoleController {
    private static final Logger Log= LoggerFactory.getLogger(RoleController.class);
    public static final String BUSINESS_NAME="权限";

    @Resource
    private RoleService roleService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        roleService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param roleDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody RoleDto roleDto) {
        Log.info("roleDto:{}",roleDto);

        // 保存校验
        ValidatorUtil.require(roleDto.getJobNum(), "工号");
        ValidatorUtil.length(roleDto.getJobNum(), "工号", 1, 5);
        ValidatorUtil.require(roleDto.getRole(), "权限");

        ResponseDto responseDto=new ResponseDto();
        roleService.save(roleDto);
        responseDto.setContent(roleDto);
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
        roleService.delete(id);
        return responseDto;
    }
}
