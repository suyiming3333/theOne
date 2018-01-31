package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Package: com.test
 * @fileName: TestBeas
 * @Description: spring 注解性配置文件
 * @Author Suyiming3333@gmail.com
 * @Created in 17:31 2018/1/30 0030
 */

@Configuration
@ComponentScan(basePackages = "com.test")
public class TestConfiguration {
    public TestConfiguration(){
        System.out.println("TestConfiguration 加载~~~");
    }


//    @Bean //bean 注解 同时可以指定加载bean的方法
    @Bean(name="testBean",initMethod="start",destroyMethod="cleanup")
    @Scope("prototype")
    public TestBean testBean(){
        return new TestBean();
    }

}
