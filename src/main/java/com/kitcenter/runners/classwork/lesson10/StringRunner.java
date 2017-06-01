package com.kitcenter.runners.classwork.lesson10;

/**
 * Created by denis on 5/27/17.
 */
public class StringRunner {
    public static void main(String[] args) {
        String center = new String("KT");
        String center2 = new String("KT");
        System.out.println(center == center2);
        System.out.println(center.equals(center2));

        String centerIntern = center.intern();
        String center3 = "KT";
        System.out.println(centerIntern == center3);

        System.out.println(center.contains("K"));

        String text = "3, 4, 5, 6, 7, 8";
        String[] split = text.split(",");
        System.out.println(split[3]);

        String palindrome = "moom";
        boolean isPalindrome = true;

        for (int i=0; i<palindrome.length()/2; i++){
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i)==palindrome.charAt(palindrome.length()-i-1));
        }
        if (isPalindrome)
            System.out.println("Palindrome");
            else
            System.out.println("Not palinrome");

        int counter = 5;
        Integer autoBoxingLiteral = counter;
        Integer autoBoxing = new Integer(counter);
        int unboxingLiteral = autoBoxingLiteral;
        int unboxing = autoBoxing;

    }
}

