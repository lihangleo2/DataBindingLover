package com.lihang.databindinglover.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.lihang.databindinglover.R;
import com.lihang.databindinglover.adapter.viewholder.NbViewHolder;
import com.lihang.databindinglover.databinding.ItemTestBinding;
import com.lihang.nbadapter.BaseAdapter;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class SimpleAdapter extends BaseAdapter<String> {
    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int viewType) {
        ItemTestBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_test, viewGroup, false);
        return new NbViewHolder(binding);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        NbViewHolder nbViewHolder = (NbViewHolder) viewHolder;
        ItemTestBinding binding = (ItemTestBinding) nbViewHolder.binding;
        binding.txt.setText("就是这么使用 ==> " + i);
    }
}
