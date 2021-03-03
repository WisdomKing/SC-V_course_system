package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.Employeeinfo;
import com.csii.ants.management.server.domain.EmployeeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeinfoMapper {
    long countByExample(EmployeeinfoExample example);

    int deleteByExample(EmployeeinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Employeeinfo record);

    int insertSelective(Employeeinfo record);

    List<Employeeinfo> selectByExample(EmployeeinfoExample example);

    Employeeinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Employeeinfo record, @Param("example") EmployeeinfoExample example);

    int updateByExample(@Param("record") Employeeinfo record, @Param("example") EmployeeinfoExample example);

    int updateByPrimaryKeySelective(Employeeinfo record);

    int updateByPrimaryKey(Employeeinfo record);
}