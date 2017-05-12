package com.cgwx.yyfwptz.lixiang.dada.utils;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;

import com.cgwx.yyfwptz.lixiang.dada.main.MainActivity;

/**
 * Created by yyfwptz on 2017/4/14.
 */

public class Utils {

//    public static FragmentManager fragmentManager;

    public static void checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (MainActivity.mainActivity.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
                MainActivity.mainActivity.requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, Constants.PERMISSION_REQUEST_COARSE_LOCATION);
            if (MainActivity.mainActivity.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
                MainActivity.mainActivity.requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, Constants.PERMISSION_REQUEST_COARSE_LOCATION);
            if (MainActivity.mainActivity.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
                MainActivity.mainActivity.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, Constants.PERMISSION_REQUEST_COARSE_LOCATION);
        }
    }

    public static Bitmap icon_format(Bitmap bitmap,int newWidth, int newHeight){
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;
        Matrix matrix = new Matrix();
        matrix.postScale(scaleWidth, scaleHeight);
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        return bitmap;
    }

//    public static void changeFragment(Fragment fragment1, Fragment fragment2){
//        fragmentManager = MainActivity.mainActivity.getFragmentManager();
//        FragmentTransaction fTransaction = fragmentManager.beginTransaction();
//        if (fragment1 != null)
//            fTransaction.hide(fragment1);
//        if (fragment2 == null) {
//            fragment2 = new HomeFragmentWithMap();
//            fTransaction.add(R.id.ly_content, fragment2);
//        } else
//            fTransaction.show(fragment2);
//        fTransaction.commit();
//    }
}
