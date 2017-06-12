package com.kitcenter.app.classwork.lesson14;

/**
 * Created by denis on 6/10/17.
 */
public class Cars {
    protected String name;
    protected int speed;

    public Cars(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public void showCarName(){
        System.out.println(name);
    }
    public void showCarNameAndSpeed(){
        System.out.println(name + " "+ speed);
    }

    public void carDrives(){
        System.out.println("Cars class");
    }
}


