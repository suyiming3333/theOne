package com.controller;

import com.entity.User;
import com.service.TestService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Package: com.controller
 * @fileName: TestController
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 19:57 2018/1/30 0030
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping(value = "test.do")
    public String sayHello(){
        System.out.println("hello spring mvc");
        User user1 = userService.getUser();
        return user1.getUsername();
    }
}
