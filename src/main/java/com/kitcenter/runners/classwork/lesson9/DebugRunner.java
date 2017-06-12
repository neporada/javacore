package com.kitcenter.runners.classwork.lesson9;

import java.util.Random;

/**
 * Created by denis on 6/3/17.
 */
public class DebugRunner {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt();
        }
    }
}
