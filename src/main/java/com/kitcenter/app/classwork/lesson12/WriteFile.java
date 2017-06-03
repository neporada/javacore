package com.kitcenter.app.classwork.lesson12;

import java.io.*;

/**
 * Created by denis on 6/3/17.
 */
public class WriteFile {
    String currentDir = System.getProperty("user.dir");
    public void writeFile(String pathToWrite) throws IOException {
        String absolutePath = createAbsoulteWritePath(currentDir, pathToWrite);
        String firstLine = "The first line";
        String secondLine = "The second string";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(absolutePath)));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
    }
    public  String createAbsoulteWritePath (String project, String relativeToProject){
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }
}
