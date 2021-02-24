package com.csii.ants.management.business.controller.admin;

import com.csii.ants.management.server.dto.AnnouncementDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.AnnouncementService;
import com.csii.ants.management.server.util.ValidatorUtil;
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
    public static final String BUSINESS_NAME="公告";

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

        // 保存校验
        ValidatorUtil.require(announcementDto.getAnnouncementtitle(), "公告标题");
        ValidatorUtil.length(announcementDto.getAnnouncementtitle(), "公告标题", 1, 20);
        ValidatorUtil.require(announcementDto.getAnnouncementtype(), "公告类型");
        ValidatorUtil.length(announcementDto.getAnnouncementtype(), "公告类型", 1, 20);
        ValidatorUtil.require(announcementDto.getBegintime(), "开始时间");
        ValidatorUtil.length(announcementDto.getBegintime(), "开始时间", 1, 10);
        ValidatorUtil.require(announcementDto.getEndingtime(), "结束时间");
        ValidatorUtil.length(announcementDto.getEndingtime(), "结束时间", 1, 10);
        ValidatorUtil.require(announcementDto.getDetails(), "详情");
        ValidatorUtil.length(announcementDto.getDetails(), "详情", 1, 50);

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
