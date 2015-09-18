package com.coder.dream;

/**
 * Created by Administrator on 2015/9/18.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println("param:"+name);
        return "hello,world !!!!!!";
    }
}