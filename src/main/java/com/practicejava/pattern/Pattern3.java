package com.practicejava.pattern;

public class Pattern3 {

    public static void printPattern(int row) {
        if (row < 0) {
            throw new IllegalArgumentException("");
        }
        int count = 1;
        for (int i = 0; i < row; i++){

            for(int j =0 ; j < i ; j++){
                System.out.print("#");
            }
            for(int k=0 ; k < 2; k++){
                System.out.print(count);
                count++;
            }
            for(int l =0 ; l < 2; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(7);
    }
}
