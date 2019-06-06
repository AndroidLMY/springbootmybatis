package com.example.springbootmybatis.entity;

/**
 * 功能:
 * 实体类
 * @author :limingyang
 * @create ：
 * @created by IDEA
 */

public class Student {
    public String name;
    public String phone;
    public String id;

    public Student(String name, String phone, String id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
