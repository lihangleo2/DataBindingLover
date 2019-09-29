package com.lihang.databindinglover.bean;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

/**
 * Created by leo
 * on 2019/9/26.
 */
public class Human {
    //这里必须是常量,ObservableField<参数类型>
    //其实写上了下面一句，就是BaseObservable，set，get, @Bindable,刷新都封装了。直接看构造方法
    public final ObservableField<String> name = new ObservableField<>();
    //其中也封装了基本数据类型:ObservableInt等
    public final ObservableInt age = new ObservableInt();

    public Human(String name,int age){
        this.name.set(name);
        this.age.set(age);
    }

}
