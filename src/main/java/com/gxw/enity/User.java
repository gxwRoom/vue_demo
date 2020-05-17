package com.gxw.enity;

import java.io.Serializable;

/**
 * 用户实体类
 * @author GXW工作室
 * @date 2020/5/17 0017 - 11:45
 */
public class User implements Serializable{
    private Integer uid;
    private String username;
    private String password;
    private String email;
    private String sex;

    public User() {

    }

    public User(Integer uid, String username, String password, String email, String sex) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.sex = sex;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
