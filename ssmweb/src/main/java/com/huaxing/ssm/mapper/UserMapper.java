package com.huaxing.ssm.mapper;

import com.huaxing.ssm.dto.UserLogDto;
import com.huaxing.ssm.dto.UserDto;

import java.util.List;

public interface UserMapper {

    public UserDto findUser(UserDto user);

    void insertUserLog(UserLogDto userLogDto);

    List<UserLogDto> getLogs(Integer userId);
}
