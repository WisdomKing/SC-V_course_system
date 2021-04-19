package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.project;
import com.csii.ants.management.server.domain.projectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface projectMapper {
    long countByExample(projectExample example);

    int deleteByExample(projectExample example);

    int deleteByPrimaryKey(String proid);

    int insert(project record);

    int insertSelective(project record);

    List<project> selectByExample(projectExample example);

    project selectByPrimaryKey(String proid);

    int updateByExampleSelective(@Param("record") project record, @Param("example") projectExample example);

    int updateByExample(@Param("record") project record, @Param("example") projectExample example);

    int updateByPrimaryKeySelective(project record);

    int updateByPrimaryKey(project record);

    int replaceByPrimaryKey(project record);
}