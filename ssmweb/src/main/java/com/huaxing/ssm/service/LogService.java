package com.huaxing.ssm.service;

import com.huaxing.ssm.dto.UserLogDto;
import com.huaxing.ssm.dto.UserDto;

import java.util.List;

public interface LogService {


    UserDto login(UserDto user) throws Exception;

    List<UserLogDto> getLogs(Integer user);
}
