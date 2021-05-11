package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.*;
import com.csii.ants.management.server.dto.RoleDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.RoleMapper;
import com.csii.ants.management.server.mapper.RoleResourceMapper;
import com.csii.ants.management.server.mapper.RoleUserMapper;
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
public class RoleService {
    @Resource
    private RoleMapper roleMapper;

    @Resource
    private RoleResourceMapper roleResourceMapper;

    @Resource
    private RoleUserMapper roleUserMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        RoleExample roleExample = new RoleExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Role> roleList = roleMapper.selectByExample(roleExample);

        PageInfo<Role> pageInfo=new PageInfo<>(roleList);
        pageDto.setTotal(pageInfo.getTotal());

        List<RoleDto> roleDtoList = new ArrayList<RoleDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < roleList.size(); i++) {
            Role role = roleList.get(i);
            RoleDto roleDto = new RoleDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(role,roleDto);
            roleDtoList.add(roleDto);
        }
        pageDto.setList(roleDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param roleDto
     */
    public void save(RoleDto roleDto){

        Role role= CopyUtil.copy(roleDto,Role.class);
        if (StringUtils.isEmpty(roleDto.getId())) {
            this.insert(role);
        }else {
            this.update(role);
        }
    }

    /**
     * 新增
     * @param role
     */
    private void insert(Role role){
        role.setId(UuidUtil.getShortUuid());
        roleMapper.insert(role);
    }

    /**
     * 修改
     * @param role
     */
    private void update(Role role){
        roleMapper.updateByPrimaryKey(role);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 按角色保存资源
     */
    public void saveResource(RoleDto roleDto) {
        String roleId = roleDto.getId();
        List<String> resourceIds = roleDto.getResourceIds();
        // 清空库中所有的当前角色下的记录
        RoleResourceExample example = new RoleResourceExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        roleResourceMapper.deleteByExample(example);

        // 保存角色资源
        for (int i = 0; i < resourceIds.size(); i++) {
            RoleResource roleResource = new RoleResource();
            roleResource.setId(UuidUtil.getShortUuid());
            roleResource.setRoleId(roleId);
            roleResource.setResourceId(resourceIds.get(i));
            roleResourceMapper.insert(roleResource);
        }
    }
    /**
     * 按角色加载资源
     * @param roleId
     */
    public List<String> listResource(String roleId) {
        RoleResourceExample example = new RoleResourceExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<RoleResource> roleResourceList = roleResourceMapper.selectByExample(example);
        List<String> resourceIdList = new ArrayList<>();
        for (int i = 0, l = roleResourceList.size(); i < l; i++) {
            resourceIdList.add(roleResourceList.get(i).getResourceId());
        }
        return resourceIdList;
    }

    /**
     * 按角色保存用户
     */
    public void saveUser(RoleDto roleDto) {
        String roleId = roleDto.getId();
        List<String> jobNumList = roleDto.getJobNums();
        // 清空库中所有的当前角色下的记录
        RoleUserExample example = new RoleUserExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        roleUserMapper.deleteByExample(example);

        // 保存角色用户
        for (int i = 0; i < jobNumList.size(); i++) {
            RoleUser roleUser = new RoleUser();
            roleUser.setId(UuidUtil.getShortUuid());
            roleUser.setRoleId(roleId);
            roleUser.setUserId(jobNumList.get(i));
            roleUserMapper.insert(roleUser);
        }
    }
}
