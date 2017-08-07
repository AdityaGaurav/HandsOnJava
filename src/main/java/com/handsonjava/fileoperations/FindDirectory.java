package com.handsonjava.fileoperations;

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
            for (String printFileName : files) {
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
        String filePath = "/Users/adityag/Projects";
        printFileIntoDirectory(filePath);
        createNewDirectory("/Users/adityag/Projects1");
    }
}
