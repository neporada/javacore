package com.kitcenter.app.homework.lesson14;

/**
 * Created by denis on 6/12/17.
 */
public class CustomBicycle extends Bicycle {

    public CustomBicycle(int speed, int gear){
        super(speed, gear);
        System.out.println(gear +  " " + speed);
    }

    // В классе CustomBicycle метод ride() должен выводить на экран строку “Wshhhh!”.
    public void ride(){
        System.out.println("Wshhhh!");
    }

    public void setSpeed() {
    }
}
