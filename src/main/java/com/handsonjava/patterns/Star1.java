package com.handsonjava.patterns;

/**
 * Created by adityag on 2/14/17.
 */
public class Star1 {

    public static void drawPattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void drawPattern2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void drawPattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }

    public static void drawPattern4(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }else{
                for(int k =0 ; k<1; k++){
                    System.out.print("*");
                }
                for(int l =1; l<n-1; l++ ){
                    System.out.print(" ");
                }
                for(int m =n-1; m<n; m++){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }



    public static void main(String[] args) {
        drawPattern1(5);
        System.out.println("=====================");
        drawPattern4(12);
    }
}
