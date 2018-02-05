package com.handsonjava.arraypool;

public class TwoDArray {
    public static void main(String[] args){
        int[] twoD[] = new int[4][];
        twoD[0] = new int[]{1};
        twoD[1] = new int[]{2};
        twoD[2] = new int[]{3};
        twoD[3] = new int[]{4};
        for(int[] ints: twoD){
            System.out.println(ints.length);
            for(int inp : ints){
                System.out.println(inp);
            }
        }
    }
}
