package com.kitcenter.runners.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.NarrowingCasting;
import com.kitcenter.app.classwork.lesson4.WideningCasting;

/**
 * Created by denis on 5/3/17.
 */
public class CastingRunner {
    public static void main(String[] args) {
    WideningCasting myCasting = new WideningCasting();
    myCasting.widening();

    NarrowingCasting myNarrowing = new NarrowingCasting();
    myNarrowing.narrowing();

    NarrowingCasting myNarrowingTwo = new NarrowingCasting();
    myNarrowingTwo.narrowingTwo();

    NarrowingCasting myNarrowingOne = new NarrowingCasting();
    myNarrowingOne.narrowingCastingTWO();
    }

}
