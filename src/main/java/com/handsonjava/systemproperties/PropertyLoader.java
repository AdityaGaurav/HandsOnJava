package com.handsonjava.systemproperties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private static Properties properties;
    private static String pathOfPropertyFile;

    private PropertyLoader() {
    }

    private static void setInstance() {
        properties = new Properties();
    }

    private static void setPathOfFile(String pathOfFile) {
        if (pathOfFile == null) {
            throw new NullPointerException("Path can not be null");
        }
        if (pathOfFile.equals("")) {
            throw new IllegalArgumentException("Path can't be empty");
        }
        pathOfPropertyFile = pathOfFile;
    }

    /*
     * Checks for the valid file.
     * @return It return false if it finds that specified file is not a valid file else returns true;
     */
    private static boolean isFileAvailable() {
        File filename = new File(pathOfPropertyFile);
        return filename.isFile();
    }

    /*
      * load the property file specified in the given path
      * @param path of property file
      * @return instance of properties object
     */
    public static Properties loadProperties(String pathOfFile) {
        setPathOfFile(pathOfFile);
        FileReader fileReader = null;
        try {
            if (isFileAvailable()) {
                fileReader = new FileReader(pathOfPropertyFile);
                if (properties == null) {
                    setInstance();
                    properties.load(fileReader);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }

}
