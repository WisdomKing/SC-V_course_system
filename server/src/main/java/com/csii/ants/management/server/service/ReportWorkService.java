package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.ReportWork;
import com.csii.ants.management.server.domain.ReportWorkExample;
import com.csii.ants.management.server.dto.ReportWorkDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.ReportWorkMapper;
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
public class ReportWorkService {
    @Resource
    private ReportWorkMapper reportWorkMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        ReportWorkExample reportWorkExample = new ReportWorkExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<ReportWork> reportWorkList = reportWorkMapper.selectByExample(reportWorkExample);

        PageInfo<ReportWork> pageInfo=new PageInfo<>(reportWorkList);
        pageDto.setTotal(pageInfo.getTotal());

        List<ReportWorkDto> reportWorkDtoList = new ArrayList<ReportWorkDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < reportWorkList.size(); i++) {
            ReportWork reportWork = reportWorkList.get(i);
            ReportWorkDto reportWorkDto = new ReportWorkDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(reportWork,reportWorkDto);
            reportWorkDtoList.add(reportWorkDto);
        }
        pageDto.setList(reportWorkDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param reportWorkDto
     */
    public void save(ReportWorkDto reportWorkDto){

        ReportWork reportWork= CopyUtil.copy(reportWorkDto,ReportWork.class);
        if (StringUtils.isEmpty(reportWorkDto.getJobNum())) {
            this.insert(reportWork);
        }else {
            this.update(reportWork);
        }
    }

    /**
     * 新增
     * @param reportWork
     */
    private void insert(ReportWork reportWork){
        Date now = new Date();
        reportWork.setJobNum(UuidUtil.getShortUuid());
        reportWorkMapper.insert(reportWork);
    }

    /**
     * 修改
     * @param reportWork
     */
    private void update(ReportWork reportWork){
        reportWorkMapper.updateByPrimaryKey(reportWork);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        reportWorkMapper.deleteByPrimaryKey(id);
    }
}
