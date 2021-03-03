package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Employeeinfo;
import com.csii.ants.management.server.domain.EmployeeinfoExample;
import com.csii.ants.management.server.dto.EmployeeinfoDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.EmployeeinfoMapper;
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

        import java.util.Date;

/**
 * @author ZxM
 * @date 2021/2/19
 * @Description:
 */
@Service
public class EmployeeinfoService {
    @Resource
    private EmployeeinfoMapper employeeinfoMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        EmployeeinfoExample employeeinfoExample = new EmployeeinfoExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Employeeinfo> employeeinfoList = employeeinfoMapper.selectByExample(employeeinfoExample);

        PageInfo<Employeeinfo> pageInfo=new PageInfo<>(employeeinfoList);
        pageDto.setTotal(pageInfo.getTotal());

        List<EmployeeinfoDto> employeeinfoDtoList = new ArrayList<EmployeeinfoDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < employeeinfoList.size(); i++) {
            Employeeinfo employeeinfo = employeeinfoList.get(i);
            EmployeeinfoDto employeeinfoDto = new EmployeeinfoDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(employeeinfo,employeeinfoDto);
            employeeinfoDtoList.add(employeeinfoDto);
        }
        pageDto.setList(employeeinfoDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param employeeinfoDto
     */
    public void save(EmployeeinfoDto employeeinfoDto){

        Employeeinfo employeeinfo= CopyUtil.copy(employeeinfoDto,Employeeinfo.class);
        if (StringUtils.isEmpty(employeeinfoDto.getId())) {
            this.insert(employeeinfo);
        }else {
            this.update(employeeinfo);
        }
    }

    /**
     * 新增
     * @param employeeinfo
     */
    private void insert(Employeeinfo employeeinfo){
        Date now = new Date();
        employeeinfo.setId(UuidUtil.getShortUuid());
        employeeinfoMapper.insert(employeeinfo);
    }

    /**
     * 修改
     * @param employeeinfo
     */
    private void update(Employeeinfo employeeinfo){
        employeeinfoMapper.updateByPrimaryKey(employeeinfo);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        employeeinfoMapper.deleteByPrimaryKey(id);
    }
}
