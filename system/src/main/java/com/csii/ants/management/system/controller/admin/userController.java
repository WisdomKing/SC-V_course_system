package com.csii.ants.management.system.controller.admin;

import com.alibaba.fastjson.JSON;
import com.csii.ants.management.server.dto.*;
import com.csii.ants.management.server.service.userService;
import com.csii.ants.management.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

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
        //二次加密
        userDto.setPassword(DigestUtils.md5DigestAsHex(userDto.getPassword().getBytes()));
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
    @DeleteMapping("/delete/{jobNum}")
    public ResponseDto delete(@PathVariable String jobNum) {
        Log.info("jobNum:{}",jobNum);
        ResponseDto responseDto=new ResponseDto();
        userService.delete(jobNum);
        return responseDto;
    }

    /**
     * 重置密码
     * @param userDto
     * @return responseDto
     */
    @PostMapping("/save-password")
    public ResponseDto savePassword(@RequestBody userDto userDto) {
        Log.info("userDto:{}",userDto);
        //二次加密
        userDto.setPassword(DigestUtils.md5DigestAsHex(userDto.getPassword().getBytes()));

        ResponseDto responseDto=new ResponseDto();
        userService.savePassword(userDto);
        responseDto.setContent(userDto);
        return responseDto;
    }

    /**
     * 登录
     * @param userDto
     * @return
     */
    @PostMapping("/login")
    public ResponseDto login(@RequestBody userDto userDto,HttpServletRequest request) {
//        Log.info("用户登录开始");
        userDto.setPassword(DigestUtils.md5DigestAsHex(userDto.getPassword().getBytes()));
        ResponseDto responseDto = new ResponseDto();
        LoginUserDto loginUserDto=userService.login(userDto);
        //得到当前月份的会话缓存
        //将loginUserDto放到这个Constants.LOGIN_USER key里面
        request.getSession().setAttribute(Constants.LOGIN_USER,loginUserDto);
        responseDto.setContent(loginUserDto);
        return responseDto;
    }

    /**
     * 退出登录
     * @param token
     * @return
     */
    @GetMapping("/logout")
    public ResponseDto logout(HttpServletRequest request) {
        ResponseDto responseDto = new ResponseDto();
        request.getSession().removeAttribute(Constants.LOGIN_USER);
//        request.getSession().removeAttribute("loginUser");
        return responseDto;
    }
}
