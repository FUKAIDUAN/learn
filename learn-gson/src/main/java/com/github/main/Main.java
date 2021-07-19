package com.github.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpRequest;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String url = "https://www.ssxzxl1.com//sise/sise_online/luanlun_SAn5hANw/luanlun_SAn5hANw.mp4";
        ;

        FileUtil.writeBytes(HttpRequest.get(url).execute().bodyBytes(), new File("a.mp4"));
        Object obj = new Object();
        System.out.println("Test");
    }
}
