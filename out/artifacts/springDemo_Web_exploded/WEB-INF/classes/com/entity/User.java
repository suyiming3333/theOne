package com.entity;

/**
 * @Package: com.entity
 * @fileName: User
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 20:36 2018/1/30 0030
 */


public class User {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String username;

    private String password;

    private int age;
}
