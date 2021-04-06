package com.tosit.yl.entity;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Order {
    private int orderId;
    @NotEmpty
    private int diId;
    private Date orderDate;
    private int orderStatue;
    private String userName;
    private DrugInstrument drugInstrument;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getDiId() {
        return diId;
    }

    public void setDiId(int diId) {
        this.diId = diId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderStatue() {
        return orderStatue;
    }

    public void setOrderStatue(int orderStatue) {
        this.orderStatue = orderStatue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DrugInstrument getDrugInstrument() {
        return drugInstrument;
    }

    public void setDrugInstrument(DrugInstrument drugInstrument) {
        this.drugInstrument = drugInstrument;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", diId=" + diId +
                ", orderDate=" + orderDate +
                '}';
    }
}
