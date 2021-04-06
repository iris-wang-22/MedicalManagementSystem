package com.tosit.yl.entity;

/**
 * Created by Chenshufu on 2017/6/29.
 */
public class Administrative {
    private int adId;
    private String adName;
    private String adLocal;

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdLocal() {
        return adLocal;
    }

    public void setAdLocal(String adLocal) {
        this.adLocal = adLocal;
    }

    @Override
    public String toString() {
        return "Administrative{" +
                "adId=" + adId +
                ", adName='" + adName + '\'' +
                ", adLocal='" + adLocal + '\'' +
                '}';
    }
}
