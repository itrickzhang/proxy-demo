package com.example.demo.enable;

/**
 * Created by Rick on 2019/8/28.
 */
public class RestAccess implements Access{
    @Override
    public void start() {
        System.out.println("rest接入配置");
    }

    @Override
    public void stop() {
        System.out.println("rest接入销毁配置");
    }
}
