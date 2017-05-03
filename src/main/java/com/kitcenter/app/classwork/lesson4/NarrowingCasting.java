package com.kitcenter.app.classwork.lesson4;

/**
 * Created by denis on 5/3/17.
 */
public class NarrowingCasting {
    int int1 = 127;
    float float1 = 0.0f;

    public void narrowing(){
        float1 = int1;
        System.out.println(float1);
    }

    public void narrowingTwo(){
        int1 = (int) float1;
        System.out.println(int1);
    }

    public void narrowingCastingTWO(){
        double double2 = 3.14159d;;
        float float2 = 0.0f;

        float2 = (float) double2;
        System.out.println(float2);
    }
}
