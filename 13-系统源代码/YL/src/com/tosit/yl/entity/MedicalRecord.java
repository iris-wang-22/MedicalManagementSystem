package com.tosit.yl.entity;

import java.util.Date;

/**
 * Created by Chenshufu on 2017/6/29.
 */
public class MedicalRecord {
    private int mrId;
    private int userId;
    private int useUserId;
    private String mrTime;
    private String mrChiefComplaint;
    private String mrPl;    //现病史
    private String mrPh;    //既往史
    private String mrFh;    //家庭史
    private String mrDx;
    private User user;
    private User doctor;

    public int getUseUserId() {
        return useUserId;
    }

    public void setUseUserId(int useUserId) {
        this.useUserId = useUserId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public int getMrId() {
        return mrId;
    }

    public void setMrId(int mrId) {
        this.mrId = mrId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserUserId() {
        return useUserId;
    }

    public void setUserUserId(int userUserId) {
        this.useUserId = userUserId;
    }

    public String getMrTime() {
        return mrTime;
    }

    public void setMrTime(String mrTime) {
        this.mrTime = mrTime;
    }

    public String getMrChiefComplaint() {
        return mrChiefComplaint;
    }

    public void setMrChiefComplaint(String mrChiefComplaint) {
        this.mrChiefComplaint = mrChiefComplaint;
    }

    public String getMrPl() {
        return mrPl;
    }

    public void setMrPl(String mrPl) {
        this.mrPl = mrPl;
    }

    public String getMrPh() {
        return mrPh;
    }

    public void setMrPh(String mrPh) {
        this.mrPh = mrPh;
    }

    public String getMrFh() {
        return mrFh;
    }

    public void setMrFh(String mrFh) {
        this.mrFh = mrFh;
    }

    public String getMrDx() {
        return mrDx;
    }

    public void setMrDx(String mrDx) {
        this.mrDx = mrDx;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "mrId=" + mrId +
                ", userId=" + userId +
                ", useUserId=" + useUserId +
                ", mrTime=" + mrTime +
                ", mrChiefComplaint='" + mrChiefComplaint + '\'' +
                ", mrPl='" + mrPl + '\'' +
                ", mrPh='" + mrPh + '\'' +
                ", mrFh='" + mrFh + '\'' +
                ", mrDx='" + mrDx + '\'' +
                ", user=" + user +
                ", doctor=" + doctor +
                '}';
    }
}
