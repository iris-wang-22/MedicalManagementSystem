package com.tosit.yl.entity;

import java.util.Date;

/**
 * Created by Chenshufu on 2017/6/28.
 */
public class DiPc {
    private int diPcId;
    private int diId;
    private Date diPcOt;
    private int diPcNumber;
    private DrugInstrument drugInstrument;

    public int getDiPcId() {
        return diPcId;
    }

    public void setDiPcId(int diPcId) {
        this.diPcId = diPcId;
    }

    public int getDiId() {
        return diId;
    }

    public void setDiId(int diId) {
        this.diId = diId;
    }

    public Date getDiPcOt() {
        return diPcOt;
    }

    public void setDiPcOt(Date diPcOt) {
        this.diPcOt = diPcOt;
    }

    public int getDiPcNumber() {
        return diPcNumber;
    }

    public void setDiPcNumber(int diPcNumber) {
        this.diPcNumber = diPcNumber;
    }

    public DrugInstrument getDruginstrument() {
        return drugInstrument;
    }

    public void setDrugInstrument(DrugInstrument drugInstrument) {
        this.drugInstrument = drugInstrument;
    }
}
