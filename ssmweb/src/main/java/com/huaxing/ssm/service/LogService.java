package com.huaxing.ssm.service;

import com.huaxing.ssm.pojo.UserLogPO;
import com.huaxing.ssm.pojo.UserPO;

import java.util.List;

public interface LogService {


    UserPO login(UserPO user) throws Exception;

    List<UserLogPO> getLogs(Integer user);
}
