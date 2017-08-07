package com.handsonjava.iproblems;

/**
 * Created by adityag on 6/30/2017.
 */
public class StairCase {
//    int n;
//
//    public StairCase() {
//        n = 0;
//    }

    public static void printStairCase(int n) {
        if (n < 0) {
            throw new RuntimeException("Input should be greater than 0");
        }
        int i = 0, j, k;
        for (; i < n; ++i) {
            for (j = 0; j < n - i - 1; ++j) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; ++k) {
                System.out.print("#");
            }
            System.out.println("");
        }
//
    }

    public static void main(String[] args){
        printStairCase(-1);
    }

}
