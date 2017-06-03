package com.kitcenter.app.classwork.lesson10;

/**
 * Created by denis on 5/31/17.
 */
public class Enigma {
    public static String stringEncode (String stringToEncode) {
        String plainText = "012345";
        String cypherText = "qwerty";
        StringBuilder stringBuilder = new StringBuilder(stringToEncode);

        for (int i=0; i<stringBuilder.length(); i++){
            for (int j=0; j<plainText.length(); j++){
                if (stringBuilder.charAt(i) == plainText.charAt(j)){
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
