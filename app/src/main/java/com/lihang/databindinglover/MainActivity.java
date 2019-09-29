package com.lihang.databindinglover;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.lihang.databindinglover.ui.BaseObservableActivity;
import com.lihang.databindinglover.ui.BindingAdapterActivity;
import com.lihang.databindinglover.ui.DataBindActivity;
import com.lihang.databindinglover.ui.IncludeActivity;
import com.lihang.databindinglover.ui.ObservableCollectionActivity;
import com.lihang.databindinglover.ui.ObservableFieldActivity;
import com.lihang.databindinglover.ui.RecyclerViewActivity;
import com.lihang.databindinglover.ui.ViewStubActivity;
import com.lihang.databindinglover.utils.ActivityUtils;
import com.lihang.databindinglover.databinding.ActivityMainBinding;
import com.lihang.databindinglover.ui.AlisActivity;
import com.lihang.databindinglover.ui.BaseUseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_base:
                ActivityUtils.transfer(this, BaseUseActivity.class);
                break;
            case R.id.btn_alis:
                ActivityUtils.transfer(this, AlisActivity.class);
                break;
            case R.id.btn_recyclerView:
                ActivityUtils.transfer(this, RecyclerViewActivity.class);
                break;

            case R.id.btn_baseobservable:
                ActivityUtils.transfer(this, BaseObservableActivity.class);
                break;

            case R.id.btn_observableField:
                ActivityUtils.transfer(this, ObservableFieldActivity.class);
                break;

            case R.id.btn_observableCollection:
                ActivityUtils.transfer(this, ObservableCollectionActivity.class);
                break;

            case R.id.btn_data:
                ActivityUtils.transfer(this, DataBindActivity.class);
                break;
            case R.id.btn_include:
                ActivityUtils.transfer(this, IncludeActivity.class);
                break;

            case R.id.btn_viewstub:
                ActivityUtils.transfer(this, ViewStubActivity.class);
                break;

            case R.id.btn_bind_adapter:
                ActivityUtils.transfer(this, BindingAdapterActivity.class);
                break;

        }
    }
}
