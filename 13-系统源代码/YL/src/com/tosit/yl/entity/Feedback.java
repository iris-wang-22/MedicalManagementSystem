package com.tosit.yl.entity;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Feedback {
    private int feedbackId;
    private int userId;
    private int adId;
    private String detail;
    private User user;
    private Administrative administrative;

    public int getFeedbackId() {return feedbackId;}
    public void setFeedbackId(int feedbackId) {this.feedbackId = feedbackId;}

    public String getDetail() {return detail;}
    public void setDetail(String detail) {this.detail = detail;}

    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}

    public  int getAdId() {return adId;}
    public void setAdId(int adId) {this.adId = adId;}

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

}
