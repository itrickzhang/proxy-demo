package com.example.demo.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * Created by Rick on 2019/9/9.
 */
public class JDKStoreHandler implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object targetObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("operate".equals(method.getName())){
            System.out.println("收取管理费用100元");
        }
        return method.invoke(targetObject, args);
    }

    /**
     *
     * @param targetObject
     * @return
     */
    public Object newProxyInstanse(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }
}
