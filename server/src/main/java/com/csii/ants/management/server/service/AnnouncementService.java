package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Announcement;
import com.csii.ants.management.server.domain.AnnouncementExample;
import com.csii.ants.management.server.mapper.AnnouncementMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    public List<Announcement> list(){
        AnnouncementExample announcementExample = new AnnouncementExample();
        announcementExample.createCriteria().andAnnouncementtypeEqualTo("公共公告");
        return announcementMapper.selectByExample(announcementExample);
    }
}
