package com.csii.ants.management.system.controller.admin;

import com.csii.ants.management.server.dto.userDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.userService;
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
@RequestMapping("/admin/user")
public class userController {
    private static final Logger Log= LoggerFactory.getLogger(userController.class);
    public static final String BUSINESS_NAME="用户";

    @Resource
    private userService userService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        userService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param userDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody userDto userDto) {
        Log.info("userDto:{}",userDto);

        // 保存校验
        ValidatorUtil.require(userDto.getJobNum(), "工号");
        ValidatorUtil.require(userDto.getCompanyemail(), "登陆名");
        ValidatorUtil.length(userDto.getCompanyemail(), "登陆名", 1, 50);
        ValidatorUtil.length(userDto.getName(), "昵称", 1, 50);
        ValidatorUtil.require(userDto.getPassword(), "密码");
        ValidatorUtil.require(userDto.getRole(), "权限");

        ResponseDto responseDto=new ResponseDto();
        userService.save(userDto);
        responseDto.setContent(userDto);
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
        userService.delete(id);
        return responseDto;
    }
}
