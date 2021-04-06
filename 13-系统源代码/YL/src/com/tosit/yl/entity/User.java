package com.tosit.yl.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Chenshufu on 2017/6/28.
 */
public class User {

    private int userId;
    @NotEmpty
    @Size(min=1,max=15,message = "用户名长度在1~15之间")
    private String userName;

    private int userAge;

    private char userSex;
    @NotEmpty
    private int userAuth;

    private String userPhone;

    @NotEmpty
    @Size(min=3,max=24,message = "账号应为3~24位")
    private String userAccount;

    @NotEmpty
    @Size(min=8,max=24,message = "密码应为8~24位")
    private String userPassword;

    private Date userBrithday;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public char getUserSex() {
        return userSex;
    }

    public void setUserSex(char userSex) {
        this.userSex = userSex;
    }

    public int getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(int auth) {
        this.userAuth = auth;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserBrithday() {
        return userBrithday;
    }

    public void setUserBrithday(Date userBrithday) {
        this.userBrithday = userBrithday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", auth=" + userAuth +
                ", userPhone='" + userPhone + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBrithday=" + userBrithday +
                '}';
    }
}
