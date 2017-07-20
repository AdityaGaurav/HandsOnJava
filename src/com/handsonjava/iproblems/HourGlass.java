package com.handsonjava.iproblems;

import java.util.Scanner;

/**
 * Created by adityag on 7/3/2017.
 */
public class HourGlass {

    public static int findMaxHourGlass(int[][] inp) {
        int sum1 = 0, i, j, minSum = Integer.MIN_VALUE;
        for (i = 0; i < inp.length - 2; i++) {
            int sum = inp[i][0] + inp[i][1] + inp[i][2] + inp[i + 1][1] + inp[i + 2][0] + inp[i + 2][1] + inp[i + 2][2];
            if(sum> minSum){
              minSum =sum;
            }
            for (j = 1; j < inp.length - 2; j++) {
                sum1 = inp[i][j] + inp[i][j + 1] + inp[i][j + 2] + inp[i + 1][j + 1] + inp[i + 2][j] + inp[i + 2][j + 1] + inp[i + 2][j + 2];
                if (sum1 > minSum) {
                    minSum = sum1;
                }
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[][] inpArray = {
//                {-1, -2, -3, -4, -5, -6},
//                {-5, -6, -7, -8, -9, -10},
//                {-11, -12, -13, -14, -15, -16},
//                {-17, -18, -19, -20, -21, -22},
//                {-23, -24, -25, -26, -27, -28},
//                {-29, -30, -31, -32, -34, -35, -36}
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int result = findMaxHourGlass(inpArray);
        System.out.println("Result"+result);
    }
}
