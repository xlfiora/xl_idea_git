package com.baizhi;

import com.baizhi.dao.HelloDao;

/**
 * Created by xl on 2018/7/1 0001.
 */
public class HelloService {

    public String sayHelloService(String name){

        HelloDao helloDao = new HelloDao();

        return helloDao.sayHello(name);
    }

}
