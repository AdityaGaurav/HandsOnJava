package com.handsonjava.arraypool;

/**
 * Created by adityag on 2/12/17.
 */
public class DiagonalSumMatrix {

    public static int findDiagonalSumMatrix(int[][] inputs){
        int sum=0,x=0;
        int length= inputs.length;

            while(x<length) {
                sum += inputs[x][x]+inputs[x][length-1-x];
                x++;
            }

        return sum;
    }


    public static void main(String[] args){
        int[][] ints = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        System.out.println(findDiagonalSumMatrix(ints));
    }
}
