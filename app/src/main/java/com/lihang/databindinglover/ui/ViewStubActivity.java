package com.lihang.databindinglover.ui;

import android.os.Bundle;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.bean.User;
import com.lihang.databindinglover.databinding.ActivityViewstubBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/29.
 */
public class ViewStubActivity extends AppCompatActivity {
    ActivityViewstubBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewstub);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_viewstub);
        User user = new User("我爱学习", 18);
        binding.viewStub.getViewStub().inflate();
        binding.setUser(user);
    }
}
