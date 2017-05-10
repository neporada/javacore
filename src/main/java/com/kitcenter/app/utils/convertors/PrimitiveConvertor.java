package com.kitcenter.app.utils.convertors;


/**
 * Created by denis on 5/6/17.
 */
public class PrimitiveConvertor {
    float floatOne = 0.0f;
    char charOne = 'a';
    int intOne = 0;

    public void floatToChar() {
        floatOne =  (float) charOne;
        System.out.println("Input float value is " + floatOne + ". Output char value is " + charOne);

    }

    public void intToChar() {
        charOne = (char) intOne;
        System.out.println("Input int value is " + intOne + ". Output char value is " + charOne);
    }

    public void charToInt() {
        intOne = (int) charOne;
        System.out.println("Input int value is " + charOne + ". Output char value is " + intOne);
    }
}
