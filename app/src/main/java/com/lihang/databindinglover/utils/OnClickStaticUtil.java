package com.lihang.databindinglover.utils;

import android.view.View;
import android.widget.Toast;

/**
 * Created by leo
 * on 2019/9/17.
 */
public class OnClickStaticUtil {

    public static void onClickWithMe(View view) {
        Toast.makeText(view.getContext(), "直接调用静态方法", Toast.LENGTH_SHORT).show();
    }
}
