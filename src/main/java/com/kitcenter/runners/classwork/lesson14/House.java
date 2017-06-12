package com.kitcenter.runners.classwork.lesson14;

/**
 * Created by denis on 6/10/17.
 */
public class House {
    private Flat[] flats;

    public House(Flat[] flats){
        this.flats = flats;
    }

    public House(Flat room) {
    }

    public Flat[] getFlats() {
        return flats;
    }
}
