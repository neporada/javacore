package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson12.ReadFile;
import com.kitcenter.app.classwork.lesson12.WriteFile;

import java.io.IOException;

/**
 * Created by denis on 6/3/17.
 */
public class ReadWritePolindromeRunner {
    public static void main(String[] args) throws IOException {
        // Read File

        String input;
        ReadFile readFile = new ReadFile();
        input = readFile.readFile("src/main/resources/input.txt");


        // Check Polindrome & write to file

        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        if (input.equals(builder.toString())){
            WriteFile writer = new WriteFile();
            writer.writeFile("src/main/resources/output.txt");
        } else {
            System.out.println("Not palindrome");
        }
    }

}