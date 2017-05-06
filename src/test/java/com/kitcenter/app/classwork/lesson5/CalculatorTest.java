package com.kitcenter.app.classwork.lesson5;

import org.junit.*;

/**
 * Created by denis on 5/3/17.
 */
public class CalculatorTest {
    int numberOne, numberTwo

    /*
    Initialize test data for Claculator functionallity
    */
    @BeforeClass
    public static void setBeforeClassSetUp(){

    }

    @Before
    public void setUp(){
        numberOne = 10;
        numberTwo = 40;
    }

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne, numberTwo);
        int expectedResult = 50;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @AfterClass
    public void tearDown (){
        System.out.println("Postcondition for every test");
    }

    @AfterClass
    public void tearDownForClass () {
        System.out.println("Postcondition for every class");
    }
}
