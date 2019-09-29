package com.lihang.databindinglover.utils;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lihang.databindinglover.R;

import androidx.databinding.BindingAdapter;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * Created by leo
 * on 2019/9/29.
 */
public class DataBindingHelper {
    @BindingAdapter("imageWithGlide")
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView).load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .transition(withCrossFade())
                .centerCrop()
                .into(imageView);
    }

//    @BindingAdapter("android:text")
//    public static void setText(TextView textView, String testStr) {
//        textView.setText(testStr + " - 我是通过方法加的");
//    }
}
