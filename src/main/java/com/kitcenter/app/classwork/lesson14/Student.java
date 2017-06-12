package com.kitcenter.app.classwork.lesson14;

/**
 * Created by denis on 6/10/17.
 */
public class Student extends Person { //class name

    public Student(String name){
        super(name);
    }

    public Student(String name, int age){
        super(name,age);
    }
    public void showName(){
        System.out.println(name +" "+ age);
    }
    public void showNameAndAge(){
        System.out.println(name +""+ age);
    }
}
