package com.test;

import org.springframework.stereotype.Component;

/**
 * @Package: com.test
 * @fileName: TestBean
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 17:56 2018/1/30 0030
 */

//@Component("TestComponentBean")//不指定默认驼峰名加载？？
public class TestComponentBean {

    public void start(){
        System.out.println("test Component bean start");
    }

    public void hello(){
        System.out.println("test Component bean hello");
    }

    public void cleanup(){
        System.out.println("test Component bean cleanup");
    }
}
