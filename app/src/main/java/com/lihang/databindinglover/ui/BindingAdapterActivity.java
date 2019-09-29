package com.lihang.databindinglover.ui;

import android.database.DatabaseUtils;
import android.os.Bundle;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.databinding.ActivityBindAdapterBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/29.
 */
public class BindingAdapterActivity extends AppCompatActivity {
    ActivityBindAdapterBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_adapter);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_bind_adapter);
        binding.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1569760922081&di=77ffc0adbcfa628168b14665604e6efe&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fb215dd271e3367eeddc126d52cd1e5a5afe6e98112450-VIqcMR_fw658");
        binding.setTestStr("美女图啊");
    }
}
