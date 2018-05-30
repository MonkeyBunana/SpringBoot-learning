package com.zll.domain;

import java.io.Serializable;

/**
 * Created by zll on 2018/3/25 0025.
 */
public class User implements Serializable {

    private Long id;
    private String name;
    private Integer age;

    public User() {}
    public User(String name) {
        this.name = name;
    }
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

}