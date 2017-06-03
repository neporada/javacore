package com.kitcenter.runners.classwork.lesson11;

/**
 * Created by denis on 5/31/17.
 */
public class PalindromeLesson11 {
    public static void main(String[] args) {
        String palidrome = "moom";
        StringBuilder builder = new StringBuilder(palidrome);
        builder.reverse();
        if (palidrome.equals(builder.toString())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
