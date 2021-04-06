package com.tosit.yl.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by Chenshufu on 2017/6/28.
 */
public class Operation {
    private int opId;
    private int mrId;
    private String opType;
    private Date opTime;
    private String opPlace;
    private int opStatue;
    private MedicalRecord medicalRecord;

    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public int getMrId() {
        return mrId;
    }

    public void setMrId(int mrId) {
        this.mrId = mrId;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public String getOpPlace() {
        return opPlace;
    }

    public void setOpPlace(String opPlace) {
        this.opPlace = opPlace;
    }

    public int getOpStatue() {
        return opStatue;
    }

    public void setOpStatue(int opStatue) {
        this.opStatue = opStatue;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "opId=" + opId +
                ", mrId=" + mrId +
                ", opType='" + opType + '\'' +
                ", opTime=" + opTime +
                ", opPlace='" + opPlace + '\'' +
                ", opStatue=" + opStatue +
                '}';
    }
}
