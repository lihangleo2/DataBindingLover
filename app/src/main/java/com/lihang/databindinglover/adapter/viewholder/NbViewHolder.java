package com.lihang.databindinglover.adapter.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class NbViewHolder extends RecyclerView.ViewHolder {
    public ViewDataBinding binding;

    public NbViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
