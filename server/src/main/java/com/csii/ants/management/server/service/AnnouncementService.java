package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Announcement;
import com.csii.ants.management.server.domain.AnnouncementExample;
import com.csii.ants.management.server.dto.AnnouncementDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.AnnouncementMapper;
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
public class AnnouncementService {
    @Resource
    private AnnouncementMapper announcementMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        AnnouncementExample announcementExample = new AnnouncementExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Announcement> announcementList = announcementMapper.selectByExample(announcementExample);

        PageInfo<Announcement> pageInfo=new PageInfo<>(announcementList);
        pageDto.setTotal(pageInfo.getTotal());

        List<AnnouncementDto> announcementDtoList = new ArrayList<AnnouncementDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < announcementList.size(); i++) {
            Announcement announcement = announcementList.get(i);
            AnnouncementDto announcementDto = new AnnouncementDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(announcement,announcementDto);
            announcementDtoList.add(announcementDto);
        }
        pageDto.setList(announcementDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param announcementDto
     */
    public void save(AnnouncementDto announcementDto){

        Announcement announcement= CopyUtil.copy(announcementDto,Announcement.class);
        if (StringUtils.isEmpty(announcementDto.getId())) {
            this.insert(announcement);
        }else {
            this.update(announcement);
        }
    }

    /**
     * 新增
     * @param announcement
     */
    private void insert(Announcement announcement){
        announcement.setId(UuidUtil.getShortUuid());
        announcementMapper.insert(announcement);
    }

    /**
     * 修改
     * @param announcement
     */
    private void update(Announcement announcement){
        announcementMapper.updateByPrimaryKey(announcement);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        announcementMapper.deleteByPrimaryKey(id);
    }
}
