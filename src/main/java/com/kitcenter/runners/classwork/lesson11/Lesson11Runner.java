package com.kitcenter.runners.classwork.lesson11;

/**
 * Created by denis on 5/31/17.
 */
public class Lesson11Runner {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i=0; i<100000L; i++) {
            c = c.concat(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        StringBuilder d = new StringBuilder("start");
        String e = "finish";
        for (long i=0; i<100000L; i++) {
            d = d.append(e);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

    }
}
