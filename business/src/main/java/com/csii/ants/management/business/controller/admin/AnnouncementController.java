package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.AnnouncementDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.AnnouncementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    /**
     *
     * @param pageDto
     * @return responseDto
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        Log.info("pageDto:{}",pageDto);
        ResponseDto responseDto=new ResponseDto();
        announcementService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     *
     * @param announcementDto
     * @return responseDto
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody AnnouncementDto announcementDto) {
        Log.info("announcementDto:{}",announcementDto);
        ResponseDto responseDto=new ResponseDto();
        announcementService.save(announcementDto);
        responseDto.setContent(announcementDto);
        return responseDto;
    }

    /**
     *
     * @param id
     * @return responseDto
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable String id) {
        Log.info("id:{}",id);
        ResponseDto responseDto=new ResponseDto();
        announcementService.delete(id);
        return responseDto;
    }
}
