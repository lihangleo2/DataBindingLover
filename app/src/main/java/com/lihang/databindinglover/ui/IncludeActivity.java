package com.lihang.databindinglover.ui;

import android.database.DatabaseUtils;
import android.os.Bundle;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.bean.User;
import com.lihang.databindinglover.databinding.ActivityIncludeBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/29.
 */
public class IncludeActivity extends AppCompatActivity {
    ActivityIncludeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_include);
        User user = new User("我爱学习", 18);
        binding.setUser(user);
    }
}
