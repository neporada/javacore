package com.kitcenter.app.homework.lesson14;

/**
 * Created by denis on 6/12/17.
 */
public class BicycleWithRing extends CustomBicycle {

    public BicycleWithRing(int speed, int gear) {
        super(speed, gear);

//    Вызвать метод ring() из обьекта класса BicycleWithRing через референс типа BicycleWithRingInterface.
        BicycleWithRingInterface bicycle = new BicycleWithRingInterface();
        bicycle.ring();
    }
}
