package com.github.main.guice;

import com.google.inject.Inject;

/**
 * @author dfk
 * @Description TODO
 * @create 2021/7/4 20:14
 */
public class BeautifulGirl {

    @Inject // 告诉Guice，这里要注入东西，具体的注入规则从Module里找吧
    public Service service;

    public void say(){
        service.print();
    }
}
