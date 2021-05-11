package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Department;
import com.csii.ants.management.server.domain.DepartmentExample;
import com.csii.ants.management.server.dto.DepartmentDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.DepartmentMapper;
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
public class DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        DepartmentExample departmentExample = new DepartmentExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Department> departmentList = departmentMapper.selectByExample(departmentExample);

        PageInfo<Department> pageInfo=new PageInfo<>(departmentList);
        pageDto.setTotal(pageInfo.getTotal());

        List<DepartmentDto> departmentDtoList = new ArrayList<DepartmentDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < departmentList.size(); i++) {
            Department department = departmentList.get(i);
            DepartmentDto departmentDto = new DepartmentDto();
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
    public void save(DepartmentDto departmentDto){

        Department department= CopyUtil.copy(departmentDto,Department.class);
        if (StringUtils.isEmpty(departmentDto.getDepid())) {
            this.insert(department);
        }else {
            this.update(department);
        }
    }

    /**
     * 新增
     * @param department
     */
    private void insert(Department department){
        department.setDepid(UuidUtil.getShortUuid());
        departmentMapper.insert(department);
    }

    /**
     * 修改
     * @param department
     */
    private void update(Department department){
        departmentMapper.updateByPrimaryKey(department);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        departmentMapper.deleteByPrimaryKey(id);
    }
}
