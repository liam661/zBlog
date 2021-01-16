package cn.liamcoding.springboot.entity;

import java.io.Serializable;

/**
 * @Description
 * @Author zhuchangli
 * @Date 2021/1/2 18:39
 **/
public class User implements Serializable {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
