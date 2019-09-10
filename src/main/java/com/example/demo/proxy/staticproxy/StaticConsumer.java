package com.example.demo.proxy.staticproxy;

/**
 * Created by Rick on 2019/9/6.
 */
public class StaticConsumer {

    public static void main(String[] args) {
        ProxyStroe store = new ProxyStroe();
        store.operate();
        store.business();
    }
}
