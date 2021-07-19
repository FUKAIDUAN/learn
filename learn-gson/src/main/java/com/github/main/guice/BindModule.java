package com.github.main.guice;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * @author dfk
 * @Description TODO
 * @create 2021/7/4 20:15
 */
public class BindModule implements Module {

    @Override
    public void configure(Binder binder) {

        // 在注入的时候，遇到Service接口类型，全部注入成DefaultService实例
        binder.bind(Service.class).to(DefaultService.class);
    }
}
