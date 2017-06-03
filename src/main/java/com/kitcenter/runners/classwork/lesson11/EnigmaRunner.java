package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson10.Enigma;

/**
 * Created by denis on 5/31/17.
 */
public class EnigmaRunner {

    public static void main(String[] args) {
        Enigma enigmaRun = new Enigma();
        String encoded = enigmaRun.stringEncode("22135");
        System.out.println(encoded);
    }
}
