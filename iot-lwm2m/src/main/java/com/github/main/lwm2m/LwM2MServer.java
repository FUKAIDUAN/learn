package com.github.main.lwm2m;


import org.eclipse.leshan.server.californium.LeshanServer;
import org.eclipse.leshan.server.californium.LeshanServerBuilder;

/**
 * @author dfk
 * @Description TODO
 * @create 2021/7/17 0:49
 */
public class LwM2MServer {

    public static void main(String[] args) {
        LeshanServerBuilder builder = new LeshanServerBuilder();
// add this line if you are using leshan 1.0.0-M4 because of
// https://github.com/eclipse/leshan/issues/392
// builder.setSecurityStore(new InMemorySecurityStore()); （这就是当你使用版1.0.0-M4版须要取消这行注释）
        LeshanServer server = builder.build();
        server.start();
    }
}
