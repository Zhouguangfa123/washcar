package com.hope.washcar.bean;

/**
 * UserInfoBean
 *
 * @author zhougf
 * @date 2019/05/29
 */
public class UserInfoBean {
    private Integer userId;

    private String userName;

    public UserInfoBean(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
