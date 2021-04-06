package com.tosit.yl.entity;

/**
 * Created by Chenshufu on 2017/6/30.
 */
public class AsItem {
    private int asItemId;
    private String asItemName;
    private double asPrice;

    public int getAsItemId() {
        return asItemId;
    }

    public void setAsItemId(int asItemId) {
        this.asItemId = asItemId;
    }

    public String getAsItemName() {
        return asItemName;
    }

    public void setAsItemName(String asItemName) {
        this.asItemName = asItemName;
    }

    public double getAsPrice() {
        return asPrice;
    }

    public void setAsPrice(double asPrvice) {
        this.asPrice = asPrvice;
    }

    @Override
    public String toString() {
        return "AsItem{" +
                "asItemId=" + asItemId +
                ", asItemName='" + asItemName + '\'' +
                ", asPrivce=" + asPrice +
                '}';
    }
}
