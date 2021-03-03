package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Personalinfo;
import com.csii.ants.management.server.domain.PersonalinfoExample;
import com.csii.ants.management.server.dto.PersonalinfoDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.PersonalinfoMapper;
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
public class PersonalinfoService {
    @Resource
    private PersonalinfoMapper personalinfoMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        PersonalinfoExample personalinfoExample = new PersonalinfoExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Personalinfo> personalinfoList = personalinfoMapper.selectByExample(personalinfoExample);

        PageInfo<Personalinfo> pageInfo=new PageInfo<>(personalinfoList);
        pageDto.setTotal(pageInfo.getTotal());

        List<PersonalinfoDto> personalinfoDtoList = new ArrayList<PersonalinfoDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < personalinfoList.size(); i++) {
            Personalinfo personalinfo = personalinfoList.get(i);
            PersonalinfoDto personalinfoDto = new PersonalinfoDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(personalinfo,personalinfoDto);
            personalinfoDtoList.add(personalinfoDto);
        }
        pageDto.setList(personalinfoDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param personalinfoDto
     */
    public void save(PersonalinfoDto personalinfoDto){

        Personalinfo personalinfo= CopyUtil.copy(personalinfoDto,Personalinfo.class);
        if (StringUtils.isEmpty(personalinfoDto.getId())) {
            this.insert(personalinfo);
        }else {
            this.update(personalinfo);
        }
    }

    /**
     * 新增
     * @param personalinfo
     */
    private void insert(Personalinfo personalinfo){
        personalinfo.setId(UuidUtil.getShortUuid());
        personalinfoMapper.insert(personalinfo);
    }

    /**
     * 修改
     * @param personalinfo
     */
    private void update(Personalinfo personalinfo){
        personalinfoMapper.updateByPrimaryKey(personalinfo);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        personalinfoMapper.deleteByPrimaryKey(id);
    }
}
