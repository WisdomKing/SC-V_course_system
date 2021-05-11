package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.RoleUser;
import com.csii.ants.management.server.domain.RoleUserExample;
import com.csii.ants.management.server.dto.RoleUserDto;
import com.csii.ants.management.server.dto.PageDto;
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
public class RoleUserService {
    @Resource
    private RoleUserMapper roleUserMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        RoleUserExample roleUserExample = new RoleUserExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<RoleUser> roleUserList = roleUserMapper.selectByExample(roleUserExample);

        PageInfo<RoleUser> pageInfo=new PageInfo<>(roleUserList);
        pageDto.setTotal(pageInfo.getTotal());

        List<RoleUserDto> roleUserDtoList = new ArrayList<RoleUserDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < roleUserList.size(); i++) {
            RoleUser roleUser = roleUserList.get(i);
            RoleUserDto roleUserDto = new RoleUserDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(roleUser,roleUserDto);
            roleUserDtoList.add(roleUserDto);
        }
        pageDto.setList(roleUserDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param roleUserDto
     */
    public void save(RoleUserDto roleUserDto){

        RoleUser roleUser= CopyUtil.copy(roleUserDto,RoleUser.class);
        if (StringUtils.isEmpty(roleUserDto.getId())) {
            this.insert(roleUser);
        }else {
            this.update(roleUser);
        }
    }

    /**
     * 新增
     * @param roleUser
     */
    private void insert(RoleUser roleUser){
        roleUser.setId(UuidUtil.getShortUuid());
        roleUserMapper.insert(roleUser);
    }

    /**
     * 修改
     * @param roleUser
     */
    private void update(RoleUser roleUser){
        roleUserMapper.updateByPrimaryKey(roleUser);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        roleUserMapper.deleteByPrimaryKey(id);
    }
}
