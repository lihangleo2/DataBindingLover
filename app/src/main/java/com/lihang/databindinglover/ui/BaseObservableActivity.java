package com.lihang.databindinglover.ui;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.lihang.databindinglover.BR;
import com.lihang.databindinglover.R;
import com.lihang.databindinglover.bean.Dog;
import com.lihang.databindinglover.databinding.ActivityBaseobservableBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class BaseObservableActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityBaseobservableBinding binding;
    private Dog dog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseobservable);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_baseobservable);
        binding.setOnClickListener(this);
        dog = new Dog("默认名字", "默认颜色");
        binding.setDog(dog);
        addListener();
    }

    private void addListener() {
        dog.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == com.lihang.databindinglover.BR.name) {
                    Log.e("看看刷新了哪", "刷新了name");
                } else if (propertyId == com.lihang.databindinglover.BR._all) {
                    Log.e("看看刷新了哪", "全部全部");
                } else {
                    Log.e("看看刷新了哪", "未知错误~");
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_name:
                dog.setDataOnlyName("二哈", "黑白相间");
                break;

            case R.id.btn_all:
                dog.setDataAll("金毛", "金黄色");
                break;
        }
    }
}
