package com.kitcenter.app.utils.runners;

import com.kitcenter.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by denis on 5/6/17.
 */
public class Lesson3Runner {
    public void main (String args[]){
        PrimitiveConvertor myFloat = new PrimitiveConvertor();
        myFloat.floatToChar();

        PrimitiveConvertor myChar = new PrimitiveConvertor();
        myChar.charToInt();

        PrimitiveConvertor myInt = new PrimitiveConvertor();
        myInt.intToChar();

    }
}
