package com.tosit.yl.entity;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Ward {
    private int bedId;
    private int adId;
    private String bedLocal;
    private Administrative administrative;

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getBedLocal() {
        return bedLocal;
    }

    public void setBedLocal(String bedLocal) {
        this.bedLocal = bedLocal;
    }

    public Administrative getAdministrative() {
        return administrative;
    }

    public void setAdministrative(Administrative administrative) {
        this.administrative = administrative;
    }

    @Override
    public String toString() {
        return "Ward{" +
                "bedId=" + bedId +
                ", adId=" + adId +
                ", bedLocal='" + bedLocal + '\'' +
                '}';
    }
}
