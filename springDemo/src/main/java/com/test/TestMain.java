package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package: com.test
 * @fileName: TestMain
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 17:34 2018/1/30 0030
 */
public class TestMain {
    public static void main(String[] args){
        //spring容器注解方式的加载
        //ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfiguration.class);

        //spring通过xml加载进行容器加载
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        System.out.println(ac);
        //TestComponentBean tb = (TestComponentBean) ac.getBean("TestComponentBean");
        //TestBean tb2 = (TestBean) ac.getBean("testBean");
        //tb2.cleanup();
        //tb.hello();
    }
}
