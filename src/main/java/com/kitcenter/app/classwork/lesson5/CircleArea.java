package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by denis on 5/6/17.
 */
public class CircleArea {
    public static void calculate () {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        double circleArea =  Math.sqrt(radius) * 3.14;

        System.out.println("Area is" + circleArea);
    }
    public static final double PI = 3.14d;
    public static void calculateBigger(){
         int area1 = 1;
         int area2 =2;
        if (area1 > area2){
            System.out.println("Area1 is bigger");
        } else {
            System.out.println("Area2 is bigger");
        }
    }
}
