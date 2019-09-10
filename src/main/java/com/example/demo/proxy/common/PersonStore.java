package com.example.demo.proxy.common;

/**
 * Created by Rick on 2019/9/6.
 */
public class PersonStore implements Store {
    @Override
    public void operate() {
        System.out.println("个人商店运营");
    }

    @Override
    public void business() {
        System.out.println("个人商店交易");
    }
}
