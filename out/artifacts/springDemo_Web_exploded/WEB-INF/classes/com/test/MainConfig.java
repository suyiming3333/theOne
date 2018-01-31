package com.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @Package: com.test
 * @fileName: MainConfig
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 18:28 2018/1/30 0030
 */

@Configuration
@ImportResource("classpath:spring.xml")
@Import(TestConfiguration.class)
public class MainConfig {
    public MainConfig(){
        System.out.println("main config 加载");
    }
}
