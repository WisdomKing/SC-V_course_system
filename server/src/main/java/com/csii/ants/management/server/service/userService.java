package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.project;
import com.csii.ants.management.server.domain.user;
import com.csii.ants.management.server.domain.userExample;
import com.csii.ants.management.server.dto.LoginUserDto;
import com.csii.ants.management.server.dto.userDto;
import com.csii.ants.management.server.dto.PageDto;
import com.csii.ants.management.server.exception.BusinessException;
import com.csii.ants.management.server.exception.BusinessExceptionCode;
import com.csii.ants.management.server.mapper.userMapper;
import com.csii.ants.management.server.util.CopyUtil;
import com.csii.ants.management.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author ZxM
 * @date 2021/2/19
 * @Description:
 */
@Service
public class userService {
    private static final Logger LOG = LoggerFactory.getLogger(userService.class);

    @Resource
    private userMapper userMapper;

    /**
     * 列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto){
        //分页
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());

        userExample userExample = new userExample();
        //如果表里有sort这个字段就感觉sort来排序

        List<user> userList = userMapper.selectByExample(userExample);

        PageInfo<user> pageInfo=new PageInfo<>(userList);
        pageDto.setTotal(pageInfo.getTotal());

        List<userDto> userDtoList = new ArrayList<userDto>();
        /**
         * 因为使用了dto的方法，所以需要将实体类的数据倒腾到dto里
         */
        for (int i = 0; i < userList.size(); i++) {
            user user = userList.get(i);
            userDto userDto = new userDto();
            /*BeanUtils.copyProperties(来源,目标);*/
            BeanUtils.copyProperties(user,userDto);
            userDtoList.add(userDto);
        }
        pageDto.setList(userDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     * @param userDto
     */
    public void save(userDto userDto){
        user user= CopyUtil.copy(userDto,user.class);

        boolean flag=false;
        userExample userExample = new userExample();
        //判断传进来的参数
        user userDb=this.selectByCompanyEmail(user.getCompanyemail());
        //查询
        if (userDb == null){
            this.insert(user);
        }else{
            this.update(user);
        }

//        List<user> userList = userMapper.selectByExample(userExample);
//        //判断查询出的列表是否为空
//        if (CollectionUtils.isEmpty(userList)) {
//            flag = true;
//        } else {
//            flag = false;
//        }
//
//        if (flag) {
//            this.insert(user);
//        }else {
//            this.update(user);
//        }
    }

    /**
     * replace存在就更新,不存在就添加
     */
    public void replace(user user){
        //调用查询
        user userDb=this.selectByCompanyEmail(user.getCompanyemail());
        //如果不为空，不应该插入,返回给前端信息
        if (userDb != null){
            //抛自定义异常
            throw new BusinessException(BusinessExceptionCode.USER_LOGIN_NAME_EXIST);
        }
        userMapper.replaceByPrimaryKey(user);
    }

    /**
     * 新增
     * @param user
     */
    private void insert(user user){
        user.setJobNum(user.getJobNum());
        //调用查询
        user userDb=this.selectByCompanyEmail(user.getCompanyemail());
        //如果不为空，不应该插入,返回给前端信息
        if (userDb != null){
            //抛自定义异常
            throw new BusinessException(BusinessExceptionCode.USER_LOGIN_NAME_EXIST);
        }
        userMapper.insert(user);
    }

    /**
     * 修改
     * @param user
     */
    private void update(user user){
        user.setPassword(null);
        userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(String id) {
        userMapper.deleteByPrimaryKey(id);
    }


    /**
     * 根据登录名查询用户信息
     * @param CompanyEmail
     * @return
     */
    public user selectByCompanyEmail(String CompanyEmail) {
        userExample userExample = new userExample();
        //判断传进来的参数
        userExample.createCriteria().andCompanyemailEqualTo(CompanyEmail);
        //查询
        List<user> userList = userMapper.selectByExample(userExample);
        //判断查询出的列表是否为空
        if (CollectionUtils.isEmpty(userList)) {
            return null;
        } else {
            //loginname是唯一的，所以查出来要么没有记录，要么只有一条记录，所以只需要get(0)
            //我们要的功能是校验用户名是否存在，所以也可以吧返回值改为true或者false，而不是返回user对象，但是这种写法不够通用，所以我们选择返回user
            return userList.get(0);
        }
    }
    /**
     * 重置密码
     * @param userDto
     */
    public void savePassword(userDto userDto) {
        user user = new user();
        user.setJobNum(userDto.getJobNum());
        user.setPassword(userDto.getPassword());
        userMapper.updateByPrimaryKeySelective(user);
    }
    /**
     * 登录
     * @param userDto
     */
    public LoginUserDto login(userDto userDto) {
        user user = selectByCompanyEmail(userDto.getCompanyemail());
        if (user == null) {
            LOG.info("用户名不存在, {}", userDto.getCompanyemail());
            throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
        } else {
            if (user.getPassword().equals(userDto.getPassword())) {
                // 登录成功
                return CopyUtil.copy(user, LoginUserDto.class);
            } else {
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", userDto.getPassword(), user.getPassword());
                throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
            }
        }
    }
}
