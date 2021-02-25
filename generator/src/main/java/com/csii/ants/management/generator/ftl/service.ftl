package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.${Domain};
import com.csii.ants.management.server.domain.${Domain}Example;
import com.csii.ants.management.server.dto.${Domain}Dto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.${Domain}Mapper;
import com.csii.ants.management.server.util.CopyUtil;
import com.csii.ants.management.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZxM
 * @date 2021/2/19
 * @Description:
 */
@Service
public class ${Domain}Service {
    @Resource
    private ${Domain}Mapper ${domain}Mapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        ${Domain}Example ${domain}Example = new ${Domain}Example();
        List<${Domain}> ${domain}List = ${domain}Mapper.selectByExample(${domain}Example);

        PageInfo<${Domain}> pageInfo=new PageInfo<>(${domain}List);
        pageDto.setTotal(pageInfo.getTotal());

        List<${Domain}Dto> ${domain}DtoList = new ArrayList<${Domain}Dto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < ${domain}List.size(); i++) {
            ${Domain} ${domain} = ${domain}List.get(i);
            ${Domain}Dto ${domain}Dto = new ${Domain}Dto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(${domain},${domain}Dto);
            ${domain}DtoList.add(${domain}Dto);
        }
        pageDto.setList(${domain}DtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param ${domain}Dto
     */
    public void save(${Domain}Dto ${domain}Dto){
//        ${Domain} ${domain} = new ${Domain}();
//        BeanUtils.copyProperties(${domain}Dto,${domain});
//        ${domain}Mapper.insert(${domain});
        /* StringUtils.isEmpty在Spring5.3之后被弃用 */
        ${Domain} ${domain}= CopyUtil.copy(${domain}Dto,${Domain}.class);
//        if(${domain}Dto.getId()== null && ${domain}Dto.getId().equals("")){
        if (StringUtils.isEmpty(${domain}Dto.getId())) {
            this.insert(${domain});
        }else {
            this.update(${domain});
        }
    }

    /**
     * 新增
     * @param ${domain}
     */
    private void insert(${Domain} ${domain}){
        ${domain}.setId(UuidUtil.getShortUuid());
        ${domain}Mapper.insert(${domain});
    }

    /**
     * 修改
     * @param ${domain}
     */
    private void update(${Domain} ${domain}){
        ${domain}Mapper.updateByPrimaryKey(${domain});
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        ${domain}Mapper.deleteByPrimaryKey(id);
    }
}
