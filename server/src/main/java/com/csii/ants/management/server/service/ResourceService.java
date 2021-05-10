package com.csii.ants.management.server.service;

import com.alibaba.fastjson.JSON;
import com.csii.ants.management.server.domain.Resource;
import com.csii.ants.management.server.domain.ResourceExample;
import com.csii.ants.management.server.dto.ResourceDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.ResourceMapper;
import com.csii.ants.management.server.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
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

    private static final Logger LOG = LoggerFactory.getLogger(ResourceService.class);

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
     * 新增，ID是自定义好的，不是自动生成的
     * @param resource
     */
    private void insert(Resource resource){
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

    /**
     * 保存资源树
     * @param json
     */
    @Transactional
    public void saveJson(String json) {
        // 将劲松传转为list
        List<ResourceDto> jsonList = JSON.parseArray(json, ResourceDto.class);
        List<ResourceDto> list = new ArrayList<>();
        //将带有嵌套结构的jsonList里所有的节点取出来，组成简单的list
        if (!CollectionUtils.isEmpty(jsonList)) {
            for (ResourceDto d: jsonList) {
                d.setParent("");
                add(list, d);
            }
        }
        LOG.info("共{}条", list.size());

        //在使用前将数据库清空
        resourceMapper.deleteByExample(null);
        for (int i = 0; i < list.size(); i++) {
            this.insert(CopyUtil.copy(list.get(i), Resource.class));
        }
    }
    /**
     * 递归，将树型结构的节点全部取出来，放到list
     * @param list
     * @param dto
     */
    public void add(List<ResourceDto> list, ResourceDto dto) {
        list.add(dto);
        //判断是否有子节点
        if (!CollectionUtils.isEmpty(dto.getChildren())) {
            for (ResourceDto d: dto.getChildren()) {
                d.setParent(dto.getId());
                add(list, d);
            }
        }
    }
}
