package com.example.demo.enable;

/**
 * Created by Rick on 2019/8/28.
 */
public interface Access {
    /**
     * 初始化配置
     */
    void start();

    /**
     * 销毁配置
     */
    void stop();

    enum Type{
        REST,
        RPC
    }
}
