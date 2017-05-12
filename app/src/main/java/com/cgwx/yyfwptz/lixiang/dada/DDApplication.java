package com.cgwx.yyfwptz.lixiang.dada;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by yyfwptz on 2017/5/12.
 */

public class DDApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
