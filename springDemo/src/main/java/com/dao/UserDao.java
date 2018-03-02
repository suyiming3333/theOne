package com.dao;

import com.entity.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @Package: com.dao
 * @fileName: UserDao
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 10:04 2018/2/28 0028
 */

public interface UserDao {

    public User getUser();
}
