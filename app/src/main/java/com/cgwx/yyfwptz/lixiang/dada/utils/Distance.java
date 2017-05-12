package com.cgwx.yyfwptz.lixiang.dada.utils;

/**
 * Created by yyfwptz on 2017/3/31.
 */

/**
 * 通过经纬度来计算两点之间的距离  km
 */
public class Distance {
    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    public static double getDistance(double lat1, double lng1, double lat2,
                                     double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000d) / 10000d;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(44,125.41,44.03,125.44));

    }
}
