package com.handsonjava.practice.exceptionhandling;

import java.io.*;

public class ExceptionHandling {
    public static void tryException() {
        try {
            throw new Exception("");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }

    public static void tryException2() throws Exception {
        try {
            throw new Exception("");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }

    public static void throwMe() {
        try {
            throw new Exception("");
        } catch (Exception e) {
            try {
                throw new FileNotFoundException("");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void readFile(String path) {
        File file = new File(path);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
