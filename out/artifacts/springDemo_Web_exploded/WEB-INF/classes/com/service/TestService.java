package com.service;

import com.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: com.service
 * @fileName: TestService
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 20:28 2018/1/30 0030
 */

@Service("testService")
public class TestService {

    @Autowired
    private TestDao testDao;

    public String sayHello(){
        return testDao.sayHello();
    }
}
