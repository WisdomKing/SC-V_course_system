package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.AnnouncementDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.service.AnnouncementService;
import com.csii.ants.management.server.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZxM
 * @date 2021/2/19
 * @Description:公告模块
 */

@RestController
@RequestMapping("/admin/announcement")
public class AnnouncementController {
    private static final Logger Log= LoggerFactory.getLogger(AnnouncementController.class);
    @Resource
    private AnnouncementService announcementService;

    @RequestMapping("/list")
    public PageDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        announcementService.list(pageDto);
        return pageDto;
    }
    @RequestMapping("/save")
    public AnnouncementDto save(@RequestBody AnnouncementDto announcementDto) {
        //暂时用短ID填充开始、结束和详情，后期应该是从前端输入
        announcementDto.setBegintime(UuidUtil.getShortUuid());
        announcementDto.setEndingtime(UuidUtil.getShortUuid());
        announcementDto.setDetails(UuidUtil.getShortUuid());
        Log.info("announcementDto:{}",announcementDto);
        announcementService.save(announcementDto);
        return announcementDto;
    }
}
