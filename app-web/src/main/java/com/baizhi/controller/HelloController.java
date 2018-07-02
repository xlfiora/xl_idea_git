package com.baizhi.controller;

import com.baizhi.HelloService;

/**
 * Created by xl on 2018/7/1 0001.
 */
public class HelloController {

    public static void main(String[] args) {
        HelloService helloService = new HelloService();

        String say = helloService.sayHelloService("zs");

        System.out.println(say);

    }
}
