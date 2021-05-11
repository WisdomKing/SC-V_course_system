package com.csii.ants.management.system.controller.admin;

import com.csii.ants.management.server.dto.RoleUserDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.RoleUserService;
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
@RequestMapping("/admin/roleUser")
public class RoleUserController {
    private static final Logger Log= LoggerFactory.getLogger(RoleUserController.class);
    public static final String BUSINESS_NAME="角色用户关联";

    @Resource
    private RoleUserService roleUserService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        roleUserService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param roleUserDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody RoleUserDto roleUserDto) {
        Log.info("roleUserDto:{}",roleUserDto);

        // 保存校验
        ValidatorUtil.require(roleUserDto.getRoleId(), "角色");
        ValidatorUtil.require(roleUserDto.getUserId(), "用户");

        ResponseDto responseDto=new ResponseDto();
        roleUserService.save(roleUserDto);
        responseDto.setContent(roleUserDto);
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
        roleUserService.delete(id);
        return responseDto;
    }
}
