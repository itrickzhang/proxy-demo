package com.example.demo.proxy.staticproxy;

import com.example.demo.proxy.common.PersonStore;
import com.example.demo.proxy.common.Store;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Rick on 2019/9/6.
 */
public class ProxyStroe implements Store{

    private Store personStore = new PersonStore();

    @Override
    public void operate() {
        System.out.println("收取管理费用100元");
        personStore.operate();
    }

    @Override
    public void business() {
        personStore.business();
    }
}
