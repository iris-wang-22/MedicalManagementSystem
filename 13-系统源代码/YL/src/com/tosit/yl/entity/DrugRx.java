package com.tosit.yl.entity;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public class DrugRx {
    private int diId;
    private int mrId;
    private int opId;
    private int drugRxAmount;
    private Date drugRxTime;
    private MedicalRecord medicalRecord;
    private DrugInstrument drugInstrument;
    private Operation operation;

    public int getDrugRxAmount() {
        return drugRxAmount;
    }

    public void setDrugRxAmount(int drugRxAmount) {
        this.drugRxAmount = drugRxAmount;
    }

    public int getDiId() {
        return diId;
    }

    public void setDiId(int diId) {
        this.diId = diId;
    }

    public int getMrId() {
        return mrId;
    }

    public void setMrId(int mrId) {
        this.mrId = mrId;
    }

    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public Date getDrugRxTime() {
        return drugRxTime;
    }

    public void setDrugRxTime(Date drugRxTime) {
        this.drugRxTime = drugRxTime;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public DrugInstrument getDrugInstrument() {
        return drugInstrument;
    }

    public void setDrugInstrument(DrugInstrument drugInstrument) {
        this.drugInstrument = drugInstrument;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "DrugRx{" +
                "diId=" + diId +
                ", mrId=" + mrId +
                ", opId=" + opId +
                ", drugRx=" + drugRxAmount +
                ", drugRxTime=" + drugRxTime +
                ", medicalRecord=" + medicalRecord +
                ", drugInstrument=" + drugInstrument +
                ", operation=" + operation +
                '}';
    }
}
