package com.dao;

import org.springframework.stereotype.Repository;

/**
 * @Package: com.dao
 * @fileName: TestDao
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 20:28 2018/1/30 0030
 */

@Repository("testDao")
public class TestDao {

    public String sayHello(){
        return "hello spring spring spring";
    }
}
