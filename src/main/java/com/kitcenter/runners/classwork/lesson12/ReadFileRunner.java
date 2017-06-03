package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson12.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by denis on 6/3/17.
 */
public class ReadFileRunner {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readFile("src/main/resources/input.txt");
    }
}
