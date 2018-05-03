package com.huaxing.ssm.service.impl;

import com.huaxing.ssm.dto.UserLogDto;
import com.huaxing.ssm.dto.UserDto;
import com.huaxing.ssm.mapper.UserMapper;
import com.huaxing.ssm.service.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LogServiceImpl implements LogService{

    @Resource
    private UserMapper userMapper;

    /**
     * 登录方法
     * @param userDto
     */
    public UserDto login(UserDto userDto) throws Exception {

        if(userDto == null ){
            throw new Exception("no date！");
        }

        UserDto user = userMapper.findUser(userDto);


        //write Log
        UserLogDto userLogDto = new UserLogDto();

        userLogDto.setUserId(user.getUserId());
        userLogDto.setUserLogLoginTime(
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
                        .format(new Date()));

        userMapper.insertUserLog(userLogDto);

        return user;
    }

    public List<UserLogDto> getLogs(Integer userId) {

        return userMapper.getLogs(userId);
    }
}
