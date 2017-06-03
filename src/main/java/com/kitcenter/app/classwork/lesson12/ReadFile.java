package com.kitcenter.app.classwork.lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by denis on 6/3/17.
 */
public class ReadFile {
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

        public String getPath(String fileName){
            String path = null;
            URL url = ReadFile.class.getClassLoader().getResource(fileName);
            if (url != null){
                path = url.getPath();
            } else {
                System.out.println("Resource not found");
            }

            return path;
        }
}

