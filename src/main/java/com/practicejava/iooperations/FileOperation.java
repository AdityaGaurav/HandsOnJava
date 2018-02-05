package com.practicejava.iooperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    static void fileRead() {
//        String s = "";
//        File file = new File(s);
//        FileInputStream fileInputStream = new FileInputStream(file);
//        while (fileInputStream.read() != -1) {
//
//        }
//        throw new RuntimeException("");

        for (int i = 1; i < 5; i++) {
            System.out.println(4 / i);
        }
        try {
//          for(int i = 0; i < 5; i++){
//              System.out.println(4/i);
//          }
            throw new RuntimeException("Runnnn");
        } catch (ArithmeticException e) {
            System.out.println("Cathc block");
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Cathc block Runtime");
           // e.printStackTrace();
            System.out.println("Aditya");
        }
    }

    public static void main(String[] args) {
        fileRead();
    }
}
