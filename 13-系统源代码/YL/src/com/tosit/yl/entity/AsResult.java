package com.tosit.yl.entity;

import java.util.Date;

/**
 * Created by Chenshufu on 2017/6/30.
 */
public class AsResult {
    private int mrId;
    private int userId;
    private int asItemId;
    private Date asResultTime;
    private String asResultReport;
    private MedicalRecord medicalRecord;
    private AsItem asItem;
    private User user;

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

    public int getAsItemId() {
        return asItemId;
    }

    public void setAsItemId(int asItemId) {
        this.asItemId = asItemId;
    }

    public Date getAsResultTime() {
        return asResultTime;
    }

    public void setAsResultTime(Date asResultTime) {
        this.asResultTime = asResultTime;
    }

    public String getAsResultReport() {
        return asResultReport;
    }

    public void setAsResultReport(String asResultReport) {
        this.asResultReport = asResultReport;
    }

    @Override
    public String toString() {
        return "AsResult{" +
                "mrId=" + mrId +
                ", userId=" + userId +
                ", asItemId=" + asItemId +
                ", asResultTime=" + asResultTime +
                ", asResultReport='" + asResultReport + '\'' +
                '}';
    }
}
