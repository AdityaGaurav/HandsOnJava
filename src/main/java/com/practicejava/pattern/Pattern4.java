package com.practicejava.pattern;

public class Pattern4 {
    public static void printPattern(int row) {
        if (row < 0) {
            throw new IllegalArgumentException("");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 0 || i == row - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPattern(100);
    }
}
