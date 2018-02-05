package com.practicejava.pattern;

public class Pattern5 {

    public static void printPattern(int row) {
        if (row < 0) {
            throw new IllegalArgumentException("");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPattern(3);
    }
}
