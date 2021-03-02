package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Askforleave;
import com.csii.ants.management.server.domain.AskforleaveExample;
import com.csii.ants.management.server.dto.AskforleaveDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.mapper.AskforleaveMapper;
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
public class AskforleaveService {
    @Resource
    private AskforleaveMapper askforleaveMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        AskforleaveExample askforleaveExample = new AskforleaveExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<Askforleave> askforleaveList = askforleaveMapper.selectByExample(askforleaveExample);

        PageInfo<Askforleave> pageInfo=new PageInfo<>(askforleaveList);
        pageDto.setTotal(pageInfo.getTotal());

        List<AskforleaveDto> askforleaveDtoList = new ArrayList<AskforleaveDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < askforleaveList.size(); i++) {
            Askforleave askforleave = askforleaveList.get(i);
            AskforleaveDto askforleaveDto = new AskforleaveDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(askforleave,askforleaveDto);
            askforleaveDtoList.add(askforleaveDto);
        }
        pageDto.setList(askforleaveDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param askforleaveDto
     */
    public void save(AskforleaveDto askforleaveDto){

        Askforleave askforleave= CopyUtil.copy(askforleaveDto,Askforleave.class);
        if (StringUtils.isEmpty(askforleaveDto.getId())) {
            this.insert(askforleave);
        }else {
            this.update(askforleave);
        }
    }

    /**
     * 新增
     * @param askforleave
     */
    private void insert(Askforleave askforleave){
        Date now = new Date();
        askforleave.setId(UuidUtil.getShortUuid());
        askforleaveMapper.insert(askforleave);
    }

    /**
     * 修改
     * @param askforleave
     */
    private void update(Askforleave askforleave){
        askforleaveMapper.updateByPrimaryKey(askforleave);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        askforleaveMapper.deleteByPrimaryKey(id);
    }
}
