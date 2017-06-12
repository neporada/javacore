package com.kitcenter.runners.classwork.lesson13_encapsulaion;

import com.kitcenter.app.classwork.lesson13.Bicycle13;

/**
 * Created by denis on 6/7/17.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle13 bicycle = new Bicycle13();
        System.out.println(bicycle.color);

        String name = "Commandor";
        Bicycle13 bicycle1 = new Bicycle13(name);
        bicycle1.setName("C2");
        System.out.println(bicycle1.getName());


        String color = "Red";
        Bicycle13 bicycle2 = new Bicycle13(name, color);
        System.out.println(bicycle2.getName() + " " + bicycle2.color);

        String getframe = "";
        Bicycle13 typeFrame = new Bicycle13(getframe);
        typeFrame.setFrame("Giant");
        System.out.println(typeFrame.getFrame());
    }

}

