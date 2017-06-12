package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.BMW;
import com.kitcenter.app.classwork.lesson14.Cars;
import com.kitcenter.app.classwork.lesson14.Lexus;

/**
 * Created by denis on 6/10/17.
 */
public class CarsRunner {
    public static void main(String[] args) {
        BMW bmw = new BMW("e60", 260);
        Lexus lexus = new Lexus("W350", 300);

        bmw.carDrives();
        lexus.carDrives();
    }

}
