package com.lihang.databindinglover.ui;

import android.os.Bundle;
import android.view.View;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.bean.User;
import com.lihang.databindinglover.databinding.ActivityAlisBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/24.
 */
public class AlisActivity extends AppCompatActivity {
    private ActivityAlisBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alis);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_alis);
        User user = new User("user", 18);
        com.lihang.databindinglover.User userOther = new com.lihang.databindinglover.User("别名user", 30);

        binding.setUser(user);
        binding.setUserSecond(userOther);
    }
}
