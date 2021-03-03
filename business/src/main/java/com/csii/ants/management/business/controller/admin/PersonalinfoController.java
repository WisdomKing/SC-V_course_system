package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.PersonalinfoDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.PersonalinfoService;
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
@RequestMapping("/admin/personalinfo")
public class PersonalinfoController {
    private static final Logger Log= LoggerFactory.getLogger(PersonalinfoController.class);
    public static final String BUSINESS_NAME="个人信息";

    @Resource
    private PersonalinfoService personalinfoService;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        personalinfoService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param personalinfoDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody PersonalinfoDto personalinfoDto) {
        Log.info("personalinfoDto:{}",personalinfoDto);

        // 保存校验
        ValidatorUtil.require(personalinfoDto.getName(), "姓名");
        ValidatorUtil.length(personalinfoDto.getName(), "姓名", 1, 20);
        ValidatorUtil.require(personalinfoDto.getSex(), "性别");
        ValidatorUtil.require(personalinfoDto.getEthnicity(), "民族");
        ValidatorUtil.length(personalinfoDto.getEthnicity(), "民族", 1, 20);
        ValidatorUtil.require(personalinfoDto.getIdnum(), "身份证号");
        ValidatorUtil.length(personalinfoDto.getIdnum(), "身份证号", 1, 18);
        ValidatorUtil.length(personalinfoDto.getDateofbirth(), "出生日期", 1, 20);
        ValidatorUtil.require(personalinfoDto.getPersonalemail(), "个人邮箱");
        ValidatorUtil.length(personalinfoDto.getPersonalemail(), "个人邮箱", 1, 50);
        ValidatorUtil.length(personalinfoDto.getRegisType(), "户口性质", 1, 20);
        ValidatorUtil.length(personalinfoDto.getRegisResidence(), "户口所在地", 1, 50);
        ValidatorUtil.length(personalinfoDto.getGradUnversity(), "毕业院校", 1, 20);
        ValidatorUtil.length(personalinfoDto.getGradTime(), "毕业时间", 1, 20);
        ValidatorUtil.length(personalinfoDto.getSpeciality(), "专业", 1, 20);
        ValidatorUtil.length(personalinfoDto.getPresentaddress(), "现住址", 1, 50);
        ValidatorUtil.require(personalinfoDto.getTelephone(), "手机号");
        ValidatorUtil.length(personalinfoDto.getTelephone(), "手机号", 1, 18);
        ValidatorUtil.length(personalinfoDto.getQqnum(), "qq号", 1, 20);
        ValidatorUtil.length(personalinfoDto.getWechat(), "微信", 1, 20);
        ValidatorUtil.length(personalinfoDto.getEmergencycontactname(), "紧急联系人姓名", 1, 20);
        ValidatorUtil.length(personalinfoDto.getEmergencycontacttel(), "紧急联系人电话", 1, 18);

        ResponseDto responseDto=new ResponseDto();
        personalinfoService.save(personalinfoDto);
        responseDto.setContent(personalinfoDto);
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
        personalinfoService.delete(id);
        return responseDto;
    }
}
