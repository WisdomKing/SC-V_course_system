package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.project;
import com.csii.ants.management.server.domain.projectExample;
import com.csii.ants.management.server.dto.projectDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.projectMapper;
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
public class projectService {
    @Resource
    private projectMapper projectMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        projectExample projectExample = new projectExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<project> projectList = projectMapper.selectByExample(projectExample);

        PageInfo<project> pageInfo=new PageInfo<>(projectList);
        pageDto.setTotal(pageInfo.getTotal());

        List<projectDto> projectDtoList = new ArrayList<projectDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < projectList.size(); i++) {
            project project = projectList.get(i);
            projectDto projectDto = new projectDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(project,projectDto);
            projectDtoList.add(projectDto);
        }
        pageDto.setList(projectDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增[应当修改为库里无值新增]
     * @param projectDto
     */
    public void save(projectDto projectDto){
        project project= CopyUtil.copy(projectDto,project.class);
        this.replace(project);
//        if (StringUtils.isEmpty(departmentDto.getProid())) {
//            this.insert(project);
//        }else {
//            this.update(project);
//        }
    }

    /**
     * replace存在就更新,不存在就添加
     */
    public void replace(project project){
        projectMapper.replaceByPrimaryKey(project);
    }

    /**
     * 删除
     * @param proid
     */
    public void delete(String proid) {
        projectMapper.deleteByPrimaryKey(proid);
    }

    /**
     * 新增
     * @param project
     */
    private void insert(project project){
        project.setProid(project.getProid());
        projectMapper.insert(project);
    }

    /**
     * 修改
     * @param project
     */
    private void update(project project){
        projectMapper.updateByPrimaryKey(project);
    }

}
