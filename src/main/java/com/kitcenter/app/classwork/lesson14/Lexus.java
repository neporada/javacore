package com.kitcenter.app.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.Cars;

/**
 * Created by denis on 6/10/17.
 */
public class Lexus extends Cars {
    public Lexus (String name, int speed) {
        super(name, speed);
    }

    public void carDrives(){
        System.out.println("Lexus class");
    }
}
