package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Project;
import com.csii.ants.management.server.domain.ProjectExample;
import com.csii.ants.management.server.dto.ProjectDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.ProjectMapper;
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
public class ProjectService {
    @Resource
    private ProjectMapper projectMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        ProjectExample projectExample = new ProjectExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Project> projectList = projectMapper.selectByExample(projectExample);

        PageInfo<Project> pageInfo=new PageInfo<>(projectList);
        pageDto.setTotal(pageInfo.getTotal());

        List<ProjectDto> projectDtoList = new ArrayList<ProjectDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < projectList.size(); i++) {
            Project project = projectList.get(i);
            ProjectDto projectDto = new ProjectDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(project,projectDto);
            projectDtoList.add(projectDto);
        }
        pageDto.setList(projectDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param projectDto
     */
    public void save(ProjectDto projectDto){

        Project project= CopyUtil.copy(projectDto,Project.class);
        if (StringUtils.isEmpty(projectDto.getProid())) {
            this.insert(project);
        }else {
            this.update(project);
        }
    }

    /**
     * 新增
     * @param project
     */
    private void insert(Project project){
        project.setProid(UuidUtil.getShortUuid());
        projectMapper.insert(project);
    }

    /**
     * 修改
     * @param project
     */
    private void update(Project project){
        projectMapper.updateByPrimaryKey(project);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        projectMapper.deleteByPrimaryKey(id);
    }
}
