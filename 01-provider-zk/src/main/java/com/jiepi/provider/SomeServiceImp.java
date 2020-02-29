package com.jiepi.provider;

import com.jiepi.common.SomeService;

public class SomeServiceImp implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("welcome dubbo world :" + name);
        return name;
    }
}
