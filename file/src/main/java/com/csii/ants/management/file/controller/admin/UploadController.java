package com.csii.ants.management.file.controller.admin;

import com.csii.ants.management.server.dto.FileDto;
import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.service.FileService;
import com.csii.ants.management.server.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@RequestMapping("/admin")
@RestController
public class UploadController {

    private static final Logger LOG = LoggerFactory.getLogger(com.csii.ants.management.file.controller.admin.UploadController.class);

    public static final String BUSINESS_NAME = "文件上传";

    @Value("${file.domain}")
    private String FILE_DOMAIN;

    @Value("${file.path}")
    private String FILE_PATH;

    @Resource
    private FileService fileService;

    @RequestMapping("/upload")
    //接收表单的file变量，file是一个富文本文件
    public ResponseDto upload(@RequestParam MultipartFile file) throws IOException {
        //打印整个文件、文件名、文件大小的日志
        LOG.info("上传文件开始：{}", file);
        LOG.info(file.getOriginalFilename());
        LOG.info(String.valueOf(file.getSize()));

        // 保存文件到本地
        String key = UuidUtil.getShortUuid();
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
        String path = "teacher/" + key + "." + suffix;
        String fullPath = FILE_PATH + path;
        //目标位置
        File dest = new File(fullPath);
        //写入目标位置
        file.transferTo(dest);
        //打印目标位置全路径
        LOG.info(dest.getAbsolutePath());

        LOG.info("保存文件记录开始");
        FileDto fileDto = new FileDto();
        fileDto.setPath(path);
        fileDto.setName(fileName);
        //转成int类型
        fileDto.setSize(Math.toIntExact(file.getSize()));
        fileDto.setSuffix(suffix);
        fileService.save(fileDto);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent(FILE_DOMAIN + path);
        return responseDto;
    }

}
