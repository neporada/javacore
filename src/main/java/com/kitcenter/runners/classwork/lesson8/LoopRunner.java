package com.kitcenter.runners.classwork.lesson8;

import java.util.Scanner;

/**
 * Created by denis on 6/1/17.
 */
public class LoopRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 11 ; i++){
            System.out.println(i);
        }
        int a = 5;
        int b = 10;
        if (a < b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        System.out.println(a < b ? b : a); // checking true or false in

        //How to set default browser

        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        String chrome = "Chrome";
        String firefox = "Firefox";
        String browserLauncher = chrome.equals(browser) ? chrome : firefox;
    }
}
