package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Resource;
import com.csii.ants.management.server.domain.ResourceExample;
import com.csii.ants.management.server.dto.ResourceDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.ResourceMapper;
import com.csii.ants.management.server.util.CopyUtil;
import com.csii.ants.management.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ZxM
 * @date 2021/2/19
 * @Description:
 */
@Service
public class ResourceService {
    @javax.annotation.Resource
    private ResourceMapper resourceMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        ResourceExample resourceExample = new ResourceExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Resource> resourceList = resourceMapper.selectByExample(resourceExample);

        PageInfo<Resource> pageInfo=new PageInfo<>(resourceList);
        pageDto.setTotal(pageInfo.getTotal());

        List<ResourceDto> resourceDtoList = new ArrayList<ResourceDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < resourceList.size(); i++) {
            Resource resource = resourceList.get(i);
            ResourceDto resourceDto = new ResourceDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(resource,resourceDto);
            resourceDtoList.add(resourceDto);
        }
        pageDto.setList(resourceDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param resourceDto
     */
    public void save(ResourceDto resourceDto){

        Resource resource= CopyUtil.copy(resourceDto,Resource.class);
        if (StringUtils.isEmpty(resourceDto.getId())) {
            this.insert(resource);
        }else {
            this.update(resource);
        }
    }

    /**
     * 新增
     * @param resource
     */
    private void insert(Resource resource){
        resource.setId(UuidUtil.getShortUuid());
        resourceMapper.insert(resource);
    }

    /**
     * 修改
     * @param resource
     */
    private void update(Resource resource){
        resourceMapper.updateByPrimaryKey(resource);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        resourceMapper.deleteByPrimaryKey(id);
    }
}
