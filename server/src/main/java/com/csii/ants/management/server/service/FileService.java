package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.File;
import com.csii.ants.management.server.domain.FileExample;
import com.csii.ants.management.server.dto.FileDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.FileMapper;
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
public class FileService {
    @Resource
    private FileMapper fileMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        FileExample fileExample = new FileExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<File> fileList = fileMapper.selectByExample(fileExample);

        PageInfo<File> pageInfo=new PageInfo<>(fileList);
        pageDto.setTotal(pageInfo.getTotal());

        List<FileDto> fileDtoList = new ArrayList<FileDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < fileList.size(); i++) {
            File file = fileList.get(i);
            FileDto fileDto = new FileDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(file,fileDto);
            fileDtoList.add(fileDto);
        }
        pageDto.setList(fileDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param fileDto
     */
    public void save(FileDto fileDto){

        File file= CopyUtil.copy(fileDto,File.class);
        if (StringUtils.isEmpty(fileDto.getId())) {
            this.insert(file);
        }else {
            this.update(file);
        }
    }

    /**
     * 新增
     * @param file
     */
    private void insert(File file){
        Date now = new Date();
        file.setCreatedAt(now);
        file.setId(UuidUtil.getShortUuid());
        fileMapper.insert(file);
    }

    /**
     * 修改
     * @param file
     */
    private void update(File file){
        fileMapper.updateByPrimaryKey(file);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        fileMapper.deleteByPrimaryKey(id);
    }
}
