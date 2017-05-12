package com.cgwx.yyfwptz.lixiang.dada.entities;

import com.baidu.mapapi.model.LatLng;

/**
 * Created by yyfwptz on 2017/3/30.
 */

public class Icon {
    double langitude;
    double latitude;
    LatLng latLng;

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    String distance;

    public double getLangitude() {
        return langitude;
    }

    public void setLangitude(double langitude) {
        this.langitude = langitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
