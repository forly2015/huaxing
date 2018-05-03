package com.huaxing.ssm.dto;

public class UserLogDto {

    private Integer userLogId;

    private Integer userId;

    private String userName;

    private String userLogLoginTime;

    public Integer getUserLogId() {
        return userLogId;
    }

    public void setUserLogId(Integer userLogId) {
        this.userLogId = userLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLogLoginTime() {
        return userLogLoginTime;
    }

    public void setUserLogLoginTime(String userLogLoginTime) {
        this.userLogLoginTime = userLogLoginTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
