package com.lihang.databindinglover.ui;

import android.os.Bundle;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.adapter.SimpleAdapter;
import com.lihang.databindinglover.databinding.ActivityRecyclerviewBinding;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class RecyclerViewActivity extends AppCompatActivity {
    private ActivityRecyclerviewBinding binding;
    private SimpleAdapter adapter;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recyclerview);
        for (int i = 0; i < 10; i++) {
            arrayList.add("");
        }
        adapter = new SimpleAdapter();
        adapter.setDataList(arrayList);
        binding.recyclerView.setAdapter(adapter);
    }
}
