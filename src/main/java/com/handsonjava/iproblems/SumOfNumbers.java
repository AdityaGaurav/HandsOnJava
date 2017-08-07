package com.handsonjava.iproblems;

/**
 * Created by adityag on 6/30/2017.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfNumbers {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int a = 0, b = 0;
        for (int i = 1; i < 4; ++i) {
            switch (i) {
                case 1:
                    if (a0 > b0) {
                        ++a;
                    } else if (a0 == b0) {
                    } else {
                        ++b;
                    }
                    break;
                case 2:
                    if (a1 > b1) {
                        ++a;
                    } else if (a1 == b1) {
                    } else {
                        ++b;
                    }
                    break;
                case 3:
                    if (a2 > b2) {
                        ++a;
                    } else if (a2 == b2) {
                    } else {
                        ++b;
                    }
                    break;
            }
        }
        int r[] = new int[]{a, b};
        return r;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a0 = in.nextInt();
//        int a1 = in.nextInt();
//        int a2 = in.nextInt();
//        int b0 = in.nextInt();
//        int b1 = in.nextInt();
//        int b2 = in.nextInt();
        int[] result = solve(1, 2, 3, 3, 2, 1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}

