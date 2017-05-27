package com.kitcenter.runners.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by denis on 5/27/17.
 */
public class StringConvertRunner {
    public static void main(String[] args){
        String stringToDisplay = "";
        char [] charArryToString = {'a', 'b', 'c', 'd'};

        stringToDisplay = Arrays.toString(charArryToString)
                .replace(",", " ")
                .replace("[", " ")
                .replace("]", " ")
                .replace(" ", " ")
                .trim();
        System.out.println(stringToDisplay);

        int interger = 11;

        List<String> listString = new ArrayList<>();
        listString.add(String.valueOf(interger));

        System.out.println(listString);

        int newInter = Integer.valueOf(listString.get(0));

        System.out.println(newInter);


    }
}