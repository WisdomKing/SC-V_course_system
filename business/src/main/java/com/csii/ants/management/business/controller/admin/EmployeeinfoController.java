package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.EmployeeinfoDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.EmployeeinfoService;
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
@RequestMapping("/admin/employeeinfo")
public class EmployeeinfoController {
    private static final Logger Log= LoggerFactory.getLogger(EmployeeinfoController.class);
    public static final String BUSINESS_NAME="员工信息";

    @Resource
    private EmployeeinfoService employeeinfoService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        employeeinfoService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param employeeinfoDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody EmployeeinfoDto employeeinfoDto) {
        Log.info("employeeinfoDto:{}",employeeinfoDto);

        // 保存校验
        ValidatorUtil.require(employeeinfoDto.getName(), "姓名");
        ValidatorUtil.length(employeeinfoDto.getName(), "姓名", 1, 20);
        ValidatorUtil.require(employeeinfoDto.getJobNum(), "工号");
        ValidatorUtil.length(employeeinfoDto.getJobNum(), "工号", 1, 5);
        ValidatorUtil.require(employeeinfoDto.getBase(), "归属公司");
        ValidatorUtil.require(employeeinfoDto.getCompanyemail(), "企业邮箱");
        ValidatorUtil.length(employeeinfoDto.getCompanyemail(), "企业邮箱", 1, 50);
        ValidatorUtil.require(employeeinfoDto.getDependenceDep(), "所属部门");
        ValidatorUtil.length(employeeinfoDto.getDependenceDep(), "所属部门", 1, 20);
        ValidatorUtil.length(employeeinfoDto.getSuperiordep(), "上级部门", 1, 20);
        ValidatorUtil.require(employeeinfoDto.getPosition(), "职位");
        ValidatorUtil.length(employeeinfoDto.getPosition(), "职位", 1, 20);
        ValidatorUtil.length(employeeinfoDto.getDepDirector(), "部门总监", 1, 20);
        ValidatorUtil.require(employeeinfoDto.getEntryTime(), "入职时间");
        ValidatorUtil.require(employeeinfoDto.getEntryAddress(), "入职地点");
        ValidatorUtil.length(employeeinfoDto.getEmployeestatus(), "人员状态", 1, 20);
        ValidatorUtil.length(employeeinfoDto.getContractrenew(), "合同续签", 1, 20);
        ValidatorUtil.length(employeeinfoDto.getWelfarearea(), "福利地区", 1, 20);
        ValidatorUtil.length(employeeinfoDto.getMyrole(), "我的角色", 1, 20);
        ValidatorUtil.length(employeeinfoDto.getEmployeeccc(), "员工CCC", 1, 20);
        ValidatorUtil.length(employeeinfoDto.getComment(), "备注", 1, 50);

        ResponseDto responseDto=new ResponseDto();
        employeeinfoService.save(employeeinfoDto);
        responseDto.setContent(employeeinfoDto);
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
        employeeinfoService.delete(id);
        return responseDto;
    }
}
