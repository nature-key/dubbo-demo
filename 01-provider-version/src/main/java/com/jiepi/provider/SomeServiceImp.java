package com.jiepi.provider;

import com.jiepi.common.SomeService;

public class SomeServiceImp implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("someserverImp:" + name);
        return name;
    }
}
