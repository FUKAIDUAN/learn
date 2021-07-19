package com.github.main.lwm2m;

import org.eclipse.leshan.client.californium.LeshanClient;
import org.eclipse.leshan.client.californium.LeshanClientBuilder;

/**
 * @author dfk
 * @Description TODO
 * @create 2021/7/19 19:18
 */
public class LwM2MClient {
    public static void main(String[] args) {
        String endpoint = "coap://0.0.0.0/0.0.0.0:5683 " ; // 选择一个端点名称
        LeshanClientBuilder builder = new LeshanClientBuilder(endpoint);
        LeshanClient client = builder.build();
        client.start();
    }
}
