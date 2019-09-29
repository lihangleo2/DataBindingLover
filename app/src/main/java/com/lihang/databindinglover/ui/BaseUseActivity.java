package com.lihang.databindinglover.ui;

import android.os.Bundle;
import android.view.View;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.databinding.MyBinding;
import com.lihang.databindinglover.utils.OnClickUtil;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/24.
 */
public class BaseUseActivity extends AppCompatActivity implements View.OnClickListener {
    private MyBinding baseuseBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseuse);
        baseuseBinding = DataBindingUtil.setContentView(this, R.layout.activity_baseuse);
        baseuseBinding.setTextStr("这里就能设置数据");
        baseuseBinding.setOnClickListener(this);
        baseuseBinding.setOnClickUtil(new OnClickUtil());
    }

    @Override
    public void onClick(View v) {
        baseuseBinding.txt.setText("点击设置的数据");
    }
}
