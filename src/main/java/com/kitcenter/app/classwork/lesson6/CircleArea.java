package com.kitcenter.app.classwork.lesson6;

/**
 * Created by denis on 5/10/17.
 */
public class CircleArea {
    public static final double PI =3.14d;
    public static void calculateBigger(){
        int r1 = 0;
        int r2 = 0;
        String area1 = "1";
        String area2 = "2";

        if ((r1 > r2) || (area1 != area2)){
            System.out.print("Area1 is bigger");
            System.out.println("Area2 is smaller");
        } else {
            System.out.println("Area2 is bigger");
            System.out.println("Area1 is smaller");
        }
    }
}

