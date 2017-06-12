package com.kitcenter.app.homework.lesson13;

import java.util.Scanner;

/**
 * Created by denis on 6/10/17.
 */
public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
        if (age < 1 && age >120){
            System.out.println("“New age setted");
        }else{
            System.out.println("“Age invalid”");
        }
    }
}
