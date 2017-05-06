package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.Car;

/**
 * Created by denis on 5/6/17.
 */
public class CarRunner {
    static int counter = 10;

    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.name = "BMW";
        System.out.println(carOne.name);

        Car carTwo = new Car();
        carTwo.name = "BMW";
        System.out.println(carTwo.name);

        System.out.println(Car.speed);
        Car speed =15;
        Car.showSpeed();
        System.out.println(counter);
        }
    }

