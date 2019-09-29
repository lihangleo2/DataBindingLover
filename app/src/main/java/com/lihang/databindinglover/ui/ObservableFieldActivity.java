package com.lihang.databindinglover.ui;

import android.os.Bundle;
import android.view.View;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.bean.Human;
import com.lihang.databindinglover.databinding.ActivityObservablefieldBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class ObservableFieldActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityObservablefieldBinding binding;
    private Human human;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observablefield);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_observablefield);
        binding.setOnClickListener(this);
        human = new Human("小新", 3);
        binding.setHuman(human);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_name:
                human.name.set("玉玑子");
                break;
            case R.id.btn_age:
                human.age.set(15);
                break;
        }
    }
}
