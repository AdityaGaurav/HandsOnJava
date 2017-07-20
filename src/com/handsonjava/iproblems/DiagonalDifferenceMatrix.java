package com.handsonjava.iproblems;

/**
 * Created by adityag on 6/30/2017.
 */
public class DiagonalDifferenceMatrix {
    public static int doDiagonalDifferenceMatrix(int[][] in){
        int sum = 0, sum1=0;
        for( int i =0; i< in.length; i++){
            sum += in[i][i];
            sum1 += in[in.length-i-1][i];
        }
        int result;
        return Math.abs(result= sum - sum1);
    }
    public static void main(String[] args) {
        int[][] inp = new int[][]{
                {11, 2, 4},
                {4, 5, 6,},
                {10, 8, -12}
        };
        System.out.print(doDiagonalDifferenceMatrix(inp));
    }
}
