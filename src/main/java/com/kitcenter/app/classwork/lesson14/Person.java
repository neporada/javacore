package com.kitcenter.app.classwork.lesson14;

/**
 * Created by denis on 6/10/17.
 */
public class Person {
    protected String name;
    protected int age;

    public Person (String name){
        this.name = name;
    }

    public Person (String name, int age){
        this(name);
        this.age = age;
    }
}
