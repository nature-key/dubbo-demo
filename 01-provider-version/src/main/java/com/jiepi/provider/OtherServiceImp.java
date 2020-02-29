package com.jiepi.provider;

import com.jiepi.common.SomeService;

public class OtherServiceImp implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("OtherServiceImp:" + name);
        return name;
    }
}
