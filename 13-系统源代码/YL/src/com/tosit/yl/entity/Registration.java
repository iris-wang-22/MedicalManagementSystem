package com.tosit.yl.entity;

import java.util.Date;

/**
 * Created by LZS on 2017/6/30.
 */
public class Registration {
    private int userId;
    private int adId;
    private Date registrationTime;
    private int registrationStatue;
    private User user;
    private Administrative administrative;

    public int getRegistrationStatue() {
        return registrationStatue;
    }

    public void setRegistrationStatue(int registrationStatue) {
        this.registrationStatue = registrationStatue;
    }

    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}

    public int getAdId() {return adId;}
    public void setAdId(int adId) {this.adId = adId;}

    public Date getRegistrationTime() {return registrationTime;}
    public void setRegistrationTime(Date registrationTime) {this.registrationTime = registrationTime;}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Administrative getAdministrative() {
        return administrative;
    }

    public void setAdministrative(Administrative administrative) {
        this.administrative = administrative;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "userId=" + userId +
                ", adId=" + adId +
                ", registrationTime=" + registrationTime +
                ", registrationStatue=" + registrationStatue +
                ", user=" + user +
                ", administrative=" + administrative +
                '}';
    }
}
