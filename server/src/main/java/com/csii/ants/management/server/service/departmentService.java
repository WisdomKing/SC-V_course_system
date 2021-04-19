package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.department;
import com.csii.ants.management.server.domain.departmentExample;
import com.csii.ants.management.server.domain.project;
import com.csii.ants.management.server.dto.departmentDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.departmentMapper;
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
public class departmentService {
    @Resource
    private departmentMapper departmentMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        departmentExample departmentExample = new departmentExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<department> departmentList = departmentMapper.selectByExample(departmentExample);

        PageInfo<department> pageInfo=new PageInfo<>(departmentList);
        pageDto.setTotal(pageInfo.getTotal());

        List<departmentDto> departmentDtoList = new ArrayList<departmentDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < departmentList.size(); i++) {
            department department = departmentList.get(i);
            departmentDto departmentDto = new departmentDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(department,departmentDto);
            departmentDtoList.add(departmentDto);
        }
        pageDto.setList(departmentDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param departmentDto
     */
    public void save(departmentDto departmentDto){

        department department= CopyUtil.copy(departmentDto,department.class);
        this.replace(department);
//        if (StringUtils.isEmpty(departmentDto.getDepid())) {
//            this.insert(department);
//        }else {
//            this.update(department);
//        }
    }

    /**
     * replace存在就更新,不存在就添加
     */
    public void replace(department department){
        departmentMapper.replaceByPrimaryKey(department);
    }

    /**
     * 删除
     * @param depid
     */
    public void delete(String depid) {
        departmentMapper.deleteByPrimaryKey(depid);
    }

    /**
     * 新增
     * @param department
     */
    private void insert(department department){

        department.setDepid(department.getDepid());
        departmentMapper.insert(department);
    }

    /**
     * 修改
     * @param department
     */
    private void update(department department){
        departmentMapper.updateByPrimaryKey(department);
    }

}
