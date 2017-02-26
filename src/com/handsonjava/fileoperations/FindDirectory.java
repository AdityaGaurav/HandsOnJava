package com.handsonjava.fileoperations;

import java.io.File;

/**
 * Created by adityag on 2/26/17.
 */
public class FindDirectory {

    public static void printFileIntoDirectory() {
        String filePath = "/Users/adityag/Projects";
        File file = new File(filePath);
        if (file.isDirectory()) {
            String[] files = file.list();
            for (String printFileName : files) {
                System.out.println(printFileName);
            }
        }
    }

    public static void main(String[] args) {
        printFileIntoDirectory();
    }
}
