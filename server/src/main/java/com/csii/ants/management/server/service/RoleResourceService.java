package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.RoleResource;
import com.csii.ants.management.server.domain.RoleResourceExample;
import com.csii.ants.management.server.dto.RoleResourceDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.RoleResourceMapper;
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
public class RoleResourceService {
    @Resource
    private RoleResourceMapper roleResourceMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        RoleResourceExample roleResourceExample = new RoleResourceExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<RoleResource> roleResourceList = roleResourceMapper.selectByExample(roleResourceExample);

        PageInfo<RoleResource> pageInfo=new PageInfo<>(roleResourceList);
        pageDto.setTotal(pageInfo.getTotal());

        List<RoleResourceDto> roleResourceDtoList = new ArrayList<RoleResourceDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < roleResourceList.size(); i++) {
            RoleResource roleResource = roleResourceList.get(i);
            RoleResourceDto roleResourceDto = new RoleResourceDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(roleResource,roleResourceDto);
            roleResourceDtoList.add(roleResourceDto);
        }
        pageDto.setList(roleResourceDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param roleResourceDto
     */
    public void save(RoleResourceDto roleResourceDto){

        RoleResource roleResource= CopyUtil.copy(roleResourceDto,RoleResource.class);
        if (StringUtils.isEmpty(roleResourceDto.getId())) {
            this.insert(roleResource);
        }else {
            this.update(roleResource);
        }
    }

    /**
     * 新增
     * @param roleResource
     */
    private void insert(RoleResource roleResource){
        roleResource.setId(UuidUtil.getShortUuid());
        roleResourceMapper.insert(roleResource);
    }

    /**
     * 修改
     * @param roleResource
     */
    private void update(RoleResource roleResource){
        roleResourceMapper.updateByPrimaryKey(roleResource);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        roleResourceMapper.deleteByPrimaryKey(id);
    }
}
