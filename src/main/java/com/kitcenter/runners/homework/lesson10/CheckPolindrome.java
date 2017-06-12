package com.kitcenter.runners.homework.lesson10;

import java.util.Scanner;

/**
 * Created by denis on 6/5/17.
 */
public class CheckPolindrome {
    public static void main(String[] args) {
        System.out.println("Please type any word for checking is it polindrome or not: ");

        Scanner newWord = new Scanner(System.in);
        
        StringBuilder checker = new StringBuilder();
        checker.reverse();
        if (newWord.equals(checker.toString())) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Not polindrome");
        }
    }
}
