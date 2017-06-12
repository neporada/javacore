package com.kitcenter.app.homework.lesson14;

/**
 * Created by denis on 6/10/17.
 */
public class Bicycle {
    protected int speed;
    protected int gear;

    public void ride(){
        System.out.println("Wroom!");
    }

    public Bicycle(int speed, int gear){
        this.gear = gear;
        this.speed = speed;
    }
    public Bicycle(int speed2){
        this.speed = speed2;
    }
}
