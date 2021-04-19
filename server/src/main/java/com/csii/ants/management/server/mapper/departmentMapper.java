package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.department;
import com.csii.ants.management.server.domain.departmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface departmentMapper {
    long countByExample(departmentExample example);

    int deleteByExample(departmentExample example);

    int deleteByPrimaryKey(String depid);

    int insert(department record);

    int insertSelective(department record);

    List<department> selectByExample(departmentExample example);

    department selectByPrimaryKey(String depid);

    int updateByExampleSelective(@Param("record") department record, @Param("example") departmentExample example);

    int updateByExample(@Param("record") department record, @Param("example") departmentExample example);

    int updateByPrimaryKeySelective(department record);

    int updateByPrimaryKey(department record);

    int replaceByPrimaryKey(department record);
}