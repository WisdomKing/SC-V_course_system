package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Announcement;
import com.csii.ants.management.server.domain.AnnouncementExample;
import com.csii.ants.management.server.dto.AnnouncementDto;
import com.csii.ants.management.server.mapper.AnnouncementMapper;
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

    public List<AnnouncementDto> list(){
        AnnouncementExample announcementExample = new AnnouncementExample();
        List<Announcement> announcementList = announcementMapper.selectByExample(announcementExample);
        List<AnnouncementDto> announcementDtoList = new ArrayList<AnnouncementDto>();
        for (int i = 0; i < announcementList.size(); i++) {
            Announcement announcement = announcementList.get(i);
            AnnouncementDto announcementDto = new AnnouncementDto();
            //BeanUtils.copyProperties(来源,目标);
            BeanUtils.copyProperties(announcement,announcementDto);
            announcementDtoList.add(announcementDto);
        }
        return announcementDtoList;
    }
}
