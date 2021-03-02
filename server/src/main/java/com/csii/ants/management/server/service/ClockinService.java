package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Clockin;
import com.csii.ants.management.server.domain.ClockinExample;
import com.csii.ants.management.server.dto.ClockinDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.ClockinMapper;
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
public class ClockinService {
    @Resource
    private ClockinMapper clockinMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        ClockinExample clockinExample = new ClockinExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Clockin> clockinList = clockinMapper.selectByExample(clockinExample);

        PageInfo<Clockin> pageInfo=new PageInfo<>(clockinList);
        pageDto.setTotal(pageInfo.getTotal());

        List<ClockinDto> clockinDtoList = new ArrayList<ClockinDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < clockinList.size(); i++) {
            Clockin clockin = clockinList.get(i);
            ClockinDto clockinDto = new ClockinDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(clockin,clockinDto);
            clockinDtoList.add(clockinDto);
        }
        pageDto.setList(clockinDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param clockinDto
     */
    public void save(ClockinDto clockinDto){

        Clockin clockin= CopyUtil.copy(clockinDto,Clockin.class);
        if (StringUtils.isEmpty(clockinDto.getId())) {
            this.insert(clockin);
        }else {
            this.update(clockin);
        }
    }

    /**
     * 新增
     * @param clockin
     */
    private void insert(Clockin clockin){
        Date now = new Date();
        clockin.setClockinTime(now);
        clockin.setId(UuidUtil.getShortUuid());
        clockinMapper.insert(clockin);
    }

    /**
     * 修改
     * @param clockin
     */
    private void update(Clockin clockin){
        Date now = new Date();
        clockin.setClockinTime(now);
        clockinMapper.updateByPrimaryKey(clockin);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        clockinMapper.deleteByPrimaryKey(id);
    }
}
