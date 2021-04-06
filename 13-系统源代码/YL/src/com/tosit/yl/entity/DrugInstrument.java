package com.tosit.yl.entity;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * Created by Chenshufu on 2017/6/28.
 */
public class DrugInstrument {
    private int diId;
    @NotEmpty
    private String diName;
    private String diType;
    private int diAmount;
    private String diExplain;
    private double diSoldPrice;
    private double diInPrice;
    private Date diInTime;
    private Date diOutTime;

    public Date getDiInTime() {
        return diInTime;
    }

    public void setDiInTime(Date diInTime) {
        this.diInTime = diInTime;
    }



    public Date getDiOutTime() {
        return diOutTime;
    }

    public void setDiOutTime(Date diOutTime) {
        this.diOutTime = diOutTime;
    }

    public int getDiId() {
        return diId;
    }

    public void setDiId(int diId) {
        this.diId = diId;
    }

    public String getDiName() {
        return diName;
    }

    public void setDiName(String diName) {
        this.diName = diName;
    }

    public String getDiType() {
        return diType;
    }

    public void setDiType(String diType) {
        this.diType = diType;
    }

    public int getDiAmount() {
        return diAmount;
    }

    public void setDiAmount(int diAmount) {
        this.diAmount = diAmount;
    }

    public String getDiExplain() {
        return diExplain;
    }

    public void setDiExplain(String diExplain) {
        this.diExplain = diExplain;
    }

    public double getDiSoldPrice() {
        return diSoldPrice;
    }

    public void setDiSoldPrice(double diSoldPrice) {
        this.diSoldPrice = diSoldPrice;
    }

    public double getDiInPrice() {
        return diInPrice;
    }

    public void setDiInPrice(double diInPrice) {
        this.diInPrice = diInPrice;
    }

    @Override
    public String toString() {
        return "DrugInstrument{" +
                "diId=" + diId +
                ", diName='" + diName + '\'' +
                ", diType='" + diType + '\'' +
                ", diAmount=" + diAmount +
                ", diExplain='" + diExplain + '\'' +
                ", diSoldPrice=" + diSoldPrice +
                ", diInPrice=" + diInPrice +
                '}';
    }
}
