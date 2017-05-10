package com.kitcenter.app.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by denis on 5/10/17.
 */
public class EvenOrOdd {
    public void parity (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt() % 2;

        if (result == 0 ){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
