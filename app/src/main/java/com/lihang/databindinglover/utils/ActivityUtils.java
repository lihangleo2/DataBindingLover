package com.lihang.databindinglover.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Created by leo
 * on 2019/9/24.
 */
public class ActivityUtils {
    //简单跳转
    public static void transfer(Context context, Class<?> clazz) {
        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);
    }
}
