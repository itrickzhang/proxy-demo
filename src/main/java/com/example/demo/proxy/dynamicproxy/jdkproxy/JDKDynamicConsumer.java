package com.example.demo.proxy.dynamicproxy.jdkproxy;

import com.example.demo.proxy.common.PersonStore;
import com.example.demo.proxy.common.Store;

/**
 * Created by Rick on 2019/9/6.
 */
public class JDKDynamicConsumer {

    public static void main(String[] args) {
        Store store = (Store)new JDKStoreHandler().newProxyInstanse(new PersonStore());
        store.operate();
        store.business();
    }
}
