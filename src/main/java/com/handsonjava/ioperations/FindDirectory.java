package com.handsonjava.ioperations;

import java.io.File;

/**
 * Created by adityag on 2/26/17.
 */
public class FindDirectory {

    //    Print name of all the existing files in directory
    public static void printFileIntoDirectory(String filePath) {
        File file = new File(filePath);
        if (file.isDirectory()) {
            String[] files = file.list();
//            File file1 = new File()
            for (String printFileName : files) {
                File file1 = new File(printFileName) ;
                System.out.println(printFileName);
            }
        }
    }

    public static void createNewDirectory(String filePath) {
        File file = new File(filePath);
        file.mkdir();
        if (file.isDirectory()) {
            System.out.println("Directory Created");
        } else {
            System.out.println("Directory is not Created");
        }
    }


    public static void main(String[] args) {
        String userDirectory = System.getProperty("user.dir");
        String filePath = "\\src";
        printFileIntoDirectory(userDirectory + filePath);
        // createNewDirectory("/Users/adityag/Projects1");
    }
}
