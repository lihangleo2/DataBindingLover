package com.lihang.databindinglover.ui;

import android.os.Bundle;
import android.view.View;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.databinding.ActivityCollectionBinding;

import java.util.Random;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class ObservableCollectionActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityCollectionBinding binding;
    private ObservableList<String> list = new ObservableArrayList<>();
    private ObservableMap<String,String> map = new ObservableArrayMap<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_collection);
        binding.setOnClickListener(this);
        list.add("list的值");
        map.put("name", "map的值");
        binding.setList(list);
        binding.setMap(map);
        binding.setIndex(0);
        binding.setKey("name");
    }

    @Override
    public void onClick(View v) {
        int randowInt = new Random().nextInt(100);
        switch (v.getId()){
            case R.id.btn_index:
                //改变list的第一项
                list.add(0,"list的值" + randowInt);
                break;
            case R.id.btn_key:
                map.put("name","map的值" + randowInt);
                break;
        }
    }
}
