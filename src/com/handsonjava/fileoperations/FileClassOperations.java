package com.handsonjava.fileoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by adityag on 2/20/17.
 */
public class FileClassOperations {
    static Properties props;
    static String testPropsFile;
    static String username;
    static String defaultUserName;
    static String website;

    public static void loadProperties() throws IOException {
        File file = new File(testPropsFile);
//        FileInputStream fileInput = new FileInputStream(file);
        FileReader reader =new FileReader(testPropsFile);
        props = new Properties();
        props.load(reader);
    }


    public static String getUsername() {
        if (props == null) {
            try {
                loadProperties();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (username == null) {
                defaultUserName = props.getProperty("name");
                username = defaultUserName;
            }
        }
        return username;
    }

    public static String getURL() {

        if (props == null) {
            try {
                loadProperties();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(website==null){
            website = props.getProperty("websiteName");
        }
        switch(website.toLowerCase()){
            case "flipkart":
                  return props.getProperty("FlipKart.url");
            case "amazon":
                return props.getProperty("Amazon.url");
            case "snapdeal":
                return props.getProperty("Snapdeal.url");
            default:
                return props.getProperty("FlipKart.url");

        }
    }

    public static void main(String[] args) {
//        String testPropsFile1 = System.getProperty("props.file");
        testPropsFile = new File(System.getProperty("user.dir")).getAbsolutePath() + File.separator + "test.props";
        System.out.println(testPropsFile);
        System.out.println(getURL());
    }


}
