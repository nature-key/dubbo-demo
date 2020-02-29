package com.jiepi.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunProvider {
    public static void main(String[] args) throws Exception {
        // 创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        // 启动Spring容器
        ((ClassPathXmlApplicationContext) ac).start();
        // 将当前主线程阻塞
        System.in.read();
    }
}
