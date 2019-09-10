package com.example.demo.proxy.dynamicproxy.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Rick on 2019/9/9.
 */
public class CglibProxy implements MethodInterceptor{

    /**
     * CGlib需要代理的目标对象
     */
    private Object targetObject;

    public Object createProxyObject(Object targetObject){
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return proxyObj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if("operate".equals(method.getName())){
            System.out.println("收取管理费用100元");
        }
        return method.invoke(targetObject, objects);
    }
}
