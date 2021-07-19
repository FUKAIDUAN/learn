package com.github.main.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author dfk
 * @Description TODO
 * @create 2021/7/4 20:13
 */
public class GuiceTest {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BindModule());
        BeautifulGirl instance = injector.getInstance(BeautifulGirl.class);
        instance.say();
    }
}
