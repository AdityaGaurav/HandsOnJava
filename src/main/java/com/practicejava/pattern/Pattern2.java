package com.practicejava.pattern;

public class Pattern2 {
    /*
                    *****
                     ***
                      *
     */
    public static void printPattern(int row) {
        if (row < 0) {
            throw new IllegalArgumentException("Should be GT 0");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2* row-1 - 2*i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPattern(9);
    }
}
