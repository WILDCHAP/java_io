package com.wildchap.object.pojo;

import java.io.Serializable;

/**
 * @program: java_io
 * @description: 学生类，必须实现序列化接口
 * @author: zy wang
 * @create: 2020-11-06 16:20
 */
public class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
