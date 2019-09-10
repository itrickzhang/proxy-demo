package com.example.demo.proxy.dynamicproxy.cglibproxy;

import com.example.demo.proxy.common.PersonStore;
import com.example.demo.proxy.common.Store;
import com.example.demo.proxy.dynamicproxy.jdkproxy.JDKStoreHandler;

/**
 * Created by Rick on 2019/9/6.
 */
public class CglibDynamicConsumer {

    public static void main(String[] args) {
        Store store = (Store)new CglibProxy().createProxyObject(new PersonStore());
        store.operate();
        store.business();
    }
}
