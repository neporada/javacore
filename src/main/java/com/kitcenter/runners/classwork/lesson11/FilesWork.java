package com.kitcenter.runners.classwork.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by denis on 5/31/17.
 */
public class FilesWork {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/denis/kit.center/javacore/src/main/java/com/kitcenter/runners/classwork/lesson11/input.txt"));
            String line;

            while ((line = reader.readLine()) != null){
            System.out.println(line);
            }
            reader.close();
    } catch (FileNotFoundException e){
        e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
    } finally {
            System.out.println("Regardless about exeption you will see this text");
        }
    }
//                                Second instance:
//    public static void main(String[] args) {
//        String line;
//        FileReader fileReader = new FileReader("/Users/denis/kit.center/javacore/src/main/java/com/kitcenter/runners/classwork/lesson11/input.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        while ((line = bufferedReader()) != null){
//            System.out.println(line);
//        }
//        bufferedReader.close();
//    }
}
