package com.lantw.demo.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
    private Long id;

    private String name;

    private String password;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}