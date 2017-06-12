package com.kitcenter.runners.homework.lesson14;

import com.kitcenter.app.homework.lesson14.Bicycle;
import com.kitcenter.app.homework.lesson14.CustomBicycle;

/**
 * Created by denis on 6/12/17.
 */
public class SerGearAndRideRunner {
    // Вызвать методы setGear() и ride() из обьекта класса CustomBicycle через референс класса Bicycle.

    public static void main(String[] args) {
        CustomBicycle gear = new CustomBicycle(120, 23);
        gear.setSpeed();
        CustomBicycle sound = new CustomBicycle(120,34);
        sound.ride();
    }
}
