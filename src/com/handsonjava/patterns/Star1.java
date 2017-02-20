package com.handsonjava.patterns;

/**
 * Created by adityag on 2/14/17.
 */
public class Star1 {

    public static void drwPattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void drwPattern2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < i; k++)
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");

                    {

                    }
                }

        }
    }

    public static void main(String[] args) {
        drwPattern1(5);
        System.out.println("=====================");
        drwPattern2(5);
    }
}
