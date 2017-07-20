package com.handsonjava.arraypool;

import java.util.Arrays;

/**
 * Created by adityag on 5/7/2017.
 */
public class ArrayFunctions {
    private int[] intArray;
    private int Length;
    public int[] printArray = new int[]{1,2,    3,4};

    public ArrayFunctions() {
        intArray = new int[]{1, 2};
        Length = intArray.length;
    }

    public void setPrintArray(){
        System.out.println(printArray[0]++);
        for(int a : printArray){
            System.out.println(a+1);
        }
        System.out.println(printArray[0]++);
    }

    public static void main(String[] args) {
        int[] argu = new int[7];
        Arrays.sort(argu);
        ArrayFunctions f = new ArrayFunctions();
        f.setPrintArray();
    }
}
