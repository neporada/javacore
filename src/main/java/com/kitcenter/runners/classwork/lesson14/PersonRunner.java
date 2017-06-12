package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.Student;

/**
 * Created by denis on 6/10/17.
 */
public class PersonRunner {
    public static void main(String[] args) {
        Student den = new Student("Den");
        den.showName();

        Student ser = new Student("Sergii", 14);
        ser.showNameAndAge();
    }
}
