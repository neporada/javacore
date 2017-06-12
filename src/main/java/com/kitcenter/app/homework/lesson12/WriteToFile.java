package com.kitcenter.app.homework.lesson12;

import java.io.*;

/**
 * Created by denis on 6/10/17.
 */
public class WriteToFile {
    String currentDir = System.getProperty("user.dir");

    public void writeFile(String pathToWrite) throws IOException {
        String absolutePath = createAbsoulteWritePath(currentDir, pathToWrite);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(absolutePath)));
//        writer.append(firstLine);
//        writer.newLine();
//        writer.append(secondLine);
        writer.close();
    }

    public String createAbsoulteWritePath(String project, String relativeToProject) {
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }
}
