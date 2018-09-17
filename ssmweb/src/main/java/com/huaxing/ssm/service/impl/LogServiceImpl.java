package com.huaxing.ssm.service.impl;

import com.huaxing.ssm.mapper.TKUserLogMapper;
import com.huaxing.ssm.mapper.TKUserMapper;
import com.huaxing.ssm.pojo.UserLogPO;
import com.huaxing.ssm.pojo.UserPO;
import com.huaxing.ssm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LogServiceImpl implements LogService{

    @Autowired
    private TKUserMapper userMapper;

    @Autowired
    private TKUserLogMapper userLogMapper;

    /**
     * 登录方法
     * @param user
     */
    public UserPO login(UserPO user) throws Exception {

        if(user == null ){
            throw new Exception("no date！");
        }
        UserPO userLogin = userMapper.selectOne(user);

        if(userLogin == null){
            throw new Exception("请检查账号密码是否正确");
        }

        //write Log
        UserLogPO userLogPO = new UserLogPO();

        userLogPO.setUserId(userLogin.getUserId());
        userLogPO.setUserLogLoginTime(
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
                        .format(new Date()));

        userLogMapper.insert(userLogPO);

        return user;
    }

    public List<UserLogPO> getLogs(Integer userId) {
        return userLogMapper.select(new UserLogPO(userId));
    }
}
