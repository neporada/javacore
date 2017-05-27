package com.kitcenter.runners.classwork.lesson7;

/**
 * Created by denis on 5/27/17.
 */
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
        System.out.println("i = " + i);

        int a = 1;
        System.out.println("Original value a " + a);
        System.out.println("Pos-incremet a " + a++);
        System.out.println("After post-increment a " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment a " + a);

        int counter = 0;
        for (int i = 0; i <= 20; i++) {
            if (i%2==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
    }

