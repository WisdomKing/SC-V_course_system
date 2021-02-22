package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.AnnouncementDto;
import com.csii.ants.management.server.service.AnnouncementService;
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

    @Resource
    private AnnouncementService announcementService;

    @RequestMapping("/list")
    public List<AnnouncementDto> list() {
        return announcementService.list();
    }
}
