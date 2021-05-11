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
import java.util.List;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:模块
 */

@RestController
@RequestMapping("/admin/role")
public class RoleController {
    private static final Logger Log= LoggerFactory.getLogger(RoleController.class);
    public static final String BUSINESS_NAME="角色";

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
        ValidatorUtil.require(roleDto.getName(), "角色");
        ValidatorUtil.length(roleDto.getName(), "角色", 1, 50);
        ValidatorUtil.require(roleDto.getDesc(), "描述");
        ValidatorUtil.length(roleDto.getDesc(), "描述", 1, 100);

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

    /**
     * 保存资源
     * @param roleDto
     */
    @PostMapping("/save-resource")
    public ResponseDto saveResource(@RequestBody RoleDto roleDto) {
        Log.info("保存角色资源关联开始");
        ResponseDto<RoleDto> responseDto = new ResponseDto<>();
        roleService.saveResource(roleDto);
        responseDto.setContent(roleDto);
        return responseDto;
    }
    /**
     * 加载已关联的资源
     */
    @GetMapping("/list-resource/{roleId}")
    public ResponseDto listResource(@PathVariable String roleId) {
        Log.info("加载资源开始");
        ResponseDto responseDto = new ResponseDto<>();
        List<String> resourceIdList = roleService.listResource(roleId);
        responseDto.setContent(resourceIdList);
        return responseDto;
    }
    /**
     * 保存用户
     * @param roleDto
     */
    @PostMapping("/save-user")
    public ResponseDto saveUser(@RequestBody RoleDto roleDto) {
        Log.info("保存角色用户关联开始");
        ResponseDto<RoleDto> responseDto = new ResponseDto<>();
        roleService.saveUser(roleDto);
        responseDto.setContent(roleDto);
        return responseDto;
    }
}
