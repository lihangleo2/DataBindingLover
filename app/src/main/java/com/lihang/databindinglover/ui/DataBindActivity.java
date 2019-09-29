package com.lihang.databindinglover.ui;

import android.os.Bundle;
import android.view.View;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.bean.Human;
import com.lihang.databindinglover.databinding.ActivityDatabindBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class DataBindActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityDatabindBinding binding;
    private Human human;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_databind);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databind);
        human = new Human("老李", 18);
        binding.setHuman(human);
        binding.btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        binding.btnSearch.setText(human.name.get());
    }
}
