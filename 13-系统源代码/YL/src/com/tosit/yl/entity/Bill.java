package com.tosit.yl.entity;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Bill {
    private int billId;
    @NotEmpty
    private int asItemId;
    private int diId;
    private int mrId;
    private Date billTime;
    private int billAs;

    @NotEmpty
    private double billSum;

    private DrugInstrument drugInstrument;
    private MedicalRecord medicalRecord;


    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getAsItemId() {
        return asItemId;
    }

    public void setAsItemId(int asItemId) {
        this.asItemId = asItemId;
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

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public int getBillAs() {
        return billAs;
    }

    public void setBillAs(int billAs) {
        this.billAs = billAs;
    }

    public double getBillSum() {
        return billSum;
    }

    public void setBillSum(double billSum) {
        this.billSum = billSum;
    }

    public DrugInstrument getDrugInstrument() {
        return drugInstrument;
    }

    public void setDrugInstrument(DrugInstrument drugInstrument) {
        this.drugInstrument = drugInstrument;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", asItemId=" + asItemId +
                ", diId=" + diId +
                ", mrId=" + mrId +
                ", billTime=" + billTime +
                ", billAs=" + billAs +
                ", billSum=" + billSum +
                '}';
    }
}
