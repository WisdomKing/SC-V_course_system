package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Role;
import com.csii.ants.management.server.domain.RoleExample;
import com.csii.ants.management.server.dto.RoleDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.RoleMapper;
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
}
