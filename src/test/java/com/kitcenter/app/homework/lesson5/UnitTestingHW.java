package com.kitcenter.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denis on 5/27/17.
 */
public class UnitTestingHW {
    @Test
    public void TestFirst (){
        int a = 2, b = 8, expRes = 16;
        Assert.assertEquals(expRes, Math.multiplyExact (a, b));

    }

    @Test
    public void TestSecond (){
        double a = 43.34, b = 56.98, expRes = 71.589636121438; // 	Возвращает длину гипотенузы (sqrt(x2 +y2)).
        Assert.assertEquals(expRes, Math.hypot(a, b), 12);
    }

    @Test
    public void TestThird (){
        double a = 5.5, expsRes = 6.0;
        Assert.assertEquals(expsRes, Math.rint(a), 0.1);

    }

    @Test
    public void TestFouth (){
        double d1 = 5.0, d2 = 3.0, expsRes = 5.0;
        Assert.assertEquals(expsRes, Math.max(d1, d2), 0.1);
    }

//    @Test
//    public void TestFifth (){
//
//    }
}

