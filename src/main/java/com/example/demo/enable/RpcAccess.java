package com.example.demo.enable;

/**
 * Created by Rick on 2019/8/28.
 */
public class RpcAccess implements Access{
    @Override
    public void start() {
        System.out.println("rpc接入配置");
    }

    @Override
    public void stop() {
        System.out.println("rpc接入销毁配置");
    }
}
