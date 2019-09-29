package com.lihang.databindinglover;

import android.app.Application;
import android.content.Context;

/**
 * Created by leo
 * on 2019/9/27.
 */
public class MyApplication extends Application {
    private static MyApplication context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }

    public static MyApplication getInstance() {
        if (context == null) {
            context = new MyApplication();
        }
        return context;
    }
}
