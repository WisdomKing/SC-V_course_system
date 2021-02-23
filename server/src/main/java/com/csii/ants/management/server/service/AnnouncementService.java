package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Announcement;
import com.csii.ants.management.server.domain.AnnouncementExample;
import com.csii.ants.management.server.dto.AnnouncementDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.AnnouncementMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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

    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        AnnouncementExample announcementExample = new AnnouncementExample();
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
            //BeanUtils.copyProperties(来源,目标);
            BeanUtils.copyProperties(announcement,announcementDto);
            announcementDtoList.add(announcementDto);
        }
        pageDto.setList(announcementDtoList);
    }
}
