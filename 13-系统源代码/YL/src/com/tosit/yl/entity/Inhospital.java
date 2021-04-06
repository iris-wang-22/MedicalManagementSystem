package com.tosit.yl.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Inhospital {
    private int userId;
    private int bedId;
    private int inStatue;
    private Date inStarttime;
    private Date inEndtime;
    private User user;
    private Ward ward;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    public int getInStatue() {
        return inStatue;
    }

    public void setInStatue(int inStatue) {
        this.inStatue = inStatue;
    }

    public Date getInStarttime() {
        return inStarttime;
    }

    public void setInStarttime(Date inStarttime) {
        this.inStarttime = inStarttime;
    }

    public Date getInEndtime() {
        return inEndtime;
    }

    public void setInEndtime(Date inEndtime) {
        this.inEndtime = inEndtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    @Override
    public String toString() {
        return "Inhospital{" +
                "userId=" + userId +
                ", bedId=" + bedId +
                ", inStatue=" + inStatue +
                ", inStarttime=" + inStarttime +
                ", inEndtime=" + inEndtime +
                '}';
    }
}
