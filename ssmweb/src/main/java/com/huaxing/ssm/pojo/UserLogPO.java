package com.huaxing.ssm.pojo;

import javax.persistence.*;

@Table(name="t_userlog")
public class UserLogPO {
    public UserLogPO() {
    }

    public UserLogPO(Integer userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "userlog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userLogId;

    @Column(name = "user_id")
    private Integer userId;

    @Transient
    private String userName;

    @Column(name = "userlog_logintime")
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
