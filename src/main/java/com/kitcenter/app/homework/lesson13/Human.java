package com.kitcenter.app.homework.lesson13;

import java.util.Scanner;

/**
 * Created by denis on 6/10/17.
 */
public class Human {

    // Написать класс Human который имеет только один конструктор (конструктор должен быть с параметрами,
    // принимающий на входе возраст и имя человека). Поля возраст и имя должны быть приватными,
    // а в классе должны быть реализованы геттеры getName(), getAge() и сеттер setAge (int age)
    // который проверяет что возраст человека находится в диапазоне 1..120 лет, и в зависимости от этого
    // выводит сообщение “New age setted” и сохраняет значение в поле возраста, или выводит сообщение “Age invalid”
    // (если возраст не входит в диапазон).

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
        // return ? how I can realize returning of newAge variable;
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}
