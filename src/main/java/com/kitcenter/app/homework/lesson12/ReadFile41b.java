package com.kitcenter.app.homework.lesson12;

import com.kitcenter.app.classwork.lesson12.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by denis on 6/7/17.
 */
public class ReadFile41b {
    String currentDir = System.getProperty("user.dir");

    public String readFile(String relativeToProject) throws IOException {
        String line;
        String absolutePath = createAbsoultePath(currentDir, relativeToProject);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath));
        line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }

    public String readFileFromResources(String resourcesFileName) throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(resourcesFileName));
        line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }

    public  String createAbsoultePath (String project, String relativeToProject){
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }

    public static String[] splitWords(String input){
        input = input.replaceAll("\n"," ");
        String[] words = input.split(String.valueOf(""));
        return words;

    }
}
