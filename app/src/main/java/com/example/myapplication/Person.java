package com.example.myapplication;

import java.util.List;

/**
 * Created by paul on 16/8/8.
 */
public class Person {
    private String name;
    private String desc;
    private List<String>  test;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }
}
