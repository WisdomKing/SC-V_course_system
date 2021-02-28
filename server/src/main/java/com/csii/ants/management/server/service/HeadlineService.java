package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Headline;
import com.csii.ants.management.server.domain.HeadlineExample;
import com.csii.ants.management.server.dto.HeadlineDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.HeadlineMapper;
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
public class HeadlineService {
    @Resource
    private HeadlineMapper headlineMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        HeadlineExample headlineExample = new HeadlineExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Headline> headlineList = headlineMapper.selectByExample(headlineExample);

        PageInfo<Headline> pageInfo=new PageInfo<>(headlineList);
        pageDto.setTotal(pageInfo.getTotal());

        List<HeadlineDto> headlineDtoList = new ArrayList<HeadlineDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < headlineList.size(); i++) {
            Headline headline = headlineList.get(i);
            HeadlineDto headlineDto = new HeadlineDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(headline,headlineDto);
            headlineDtoList.add(headlineDto);
        }
        pageDto.setList(headlineDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param headlineDto
     */
    public void save(HeadlineDto headlineDto){

        Headline headline= CopyUtil.copy(headlineDto,Headline.class);
        if (StringUtils.isEmpty(headlineDto.getId())) {
            this.insert(headline);
        }else {
            this.update(headline);
        }
    }

    /**
     * 新增
     * @param headline
     */
    private void insert(Headline headline){
        //这里没有给出id！！！
        headline.setId(UuidUtil.getShortUuid());
        Date now = new Date();
        headline.setCreatedtime(now);
        headlineMapper.insert(headline);
    }

    /**
     * 修改
     * @param headline
     */
    private void update(Headline headline){
        Date now = new Date();
        headline.setUpdatedtime(now);
        headlineMapper.updateByPrimaryKey(headline);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        headlineMapper.deleteByPrimaryKey(id);
    }
}
