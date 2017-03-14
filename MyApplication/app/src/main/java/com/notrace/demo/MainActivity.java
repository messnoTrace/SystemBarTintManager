package com.notrace.demo;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.notrace.systembar.StatusBarCompat;

public class MainActivity extends Activity {
//    protected SystemBarTintManager mTintManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        StatusBarCompat.translucentStatusBar(this,true);
//
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
//            setTranslucentStatus(true);
//        }
//        mTintManager=new SystemBarTintManager(this);
//        mTintManager.setStatusBarTintEnabled(true);
//        mTintManager.setStatusBarTintResource(R.color.navigation_color);



    }

    @TargetApi(19)
    protected  void setTranslucentStatus(boolean on){
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }


}
