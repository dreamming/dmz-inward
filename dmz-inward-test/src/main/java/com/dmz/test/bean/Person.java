package com.dmz.test.bean;

/**
 * Created by dmz on 2016/12/2.
 */
public class Person implements IPerson {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("I am "+name);
    }
}
