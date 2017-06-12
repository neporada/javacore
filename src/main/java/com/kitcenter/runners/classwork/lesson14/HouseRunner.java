package com.kitcenter.runners.classwork.lesson14;

import java.sql.Array;

/**
 * Created by denis on 6/10/17.
 */
public class HouseRunner {
    public static void main(String[] args) {
        Flat[] flats = new Flat[3];
        Flat flat187 = new Flat();
        Flat flat186 = new Flat();
        Flat flat185 = new Flat();

        flats[0] = flat185;
        flats[1] = flat186;
        flats[2] = flat187;
// Composition
        House house = new House(flats);
        Flat[] houseFlat = house.getFlats();
        for(Flat flat : houseFlat){
            flat.setItem("standart doors");
        }
// Aggregation
        Flat houseFlat187 = houseFlat[2];
        houseFlat187.setItem("New door");

        for (Flat flat : houseFlat){
            System.out.println(flat.getItem());
        }
// my instance
        Flat[] roomsInFlat = new Flat[3];
        Flat room = new Flat();
        Flat room1 = new Flat();
        Flat room3 = new Flat();

        House houseRoom = new House(room);

    }


}
