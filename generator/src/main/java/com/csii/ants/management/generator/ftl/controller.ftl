package com.csii.ants.management.${module}.controller.admin;

import com.csii.ants.management.server.dto.${Domain}Dto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.${Domain}Service;
import com.csii.ants.management.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:公告模块
 */

@RestController
@RequestMapping("/admin/${domain}")
public class ${Domain}Controller {
    private static final Logger Log= LoggerFactory.getLogger(${Domain}Controller.class);
    public static final String BUSINESS_NAME="${tableNameCn}";

    @Resource
    private ${Domain}Service ${domain}Service;

    /**
     * 列表查询
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        ${domain}Service.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param ${domain}Dto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ${Domain}Dto ${domain}Dto) {
        Log.info("${domain}Dto:{}",${domain}Dto);

        // 保存校验
        <#list fieldList as field>
        <#if field.name!="id" && field.nameHump!="createdAt" && field.nameHump!="updatedAt" && field.nameHump!="sort">
            <#if !field.nullAble>
        ValidatorUtil.require(${domain}Dto.get${field.nameBigHump}(), "${field.nameCn}");
            </#if>
            <#if (field.length > 0)>
        ValidatorUtil.length(${domain}Dto.get${field.nameBigHump}(), "${field.nameCn}", 1, ${field.length?c});
            </#if>
        </#if>
        </#list>

        ResponseDto responseDto=new ResponseDto();
        ${domain}Service.save(${domain}Dto);
        responseDto.setContent(${domain}Dto);
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
        ${domain}Service.delete(id);
        return responseDto;
    }
}
