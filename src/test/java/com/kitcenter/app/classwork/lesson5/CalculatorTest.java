package com.kitcenter.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denis on 5/3/17.
 */
public class CalculatorTest {
    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(10,40);
        int expectedResult = 50;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.divideOne(30, 60);
    }
}
