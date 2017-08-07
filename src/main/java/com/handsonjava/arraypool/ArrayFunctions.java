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
    public static void defaultArray(){
        int[] inp = new int[10];
        double[] inp1 = new double[10];
        float[] inp2 = new float[10];
        char[] inp3 = new char[10];
        boolean[] inp4 = new boolean[10];
        String[] inp5 = new String[3];
        boolean re;
        int a;
        String adi;
        System.out.println(inp);
        System.out.println(inp2);
        System.out.println(inp3);
        System.out.println(inp4);
        System.out.println(inp1);
        System.out.println(inp5);
    }

    public static void main(String[] args) {
//        int[] argu = new int[7];
//        Arrays.sort(argu);
//        ArrayFunctions f = new ArrayFunctions();
//        f.setPrintArray();
        defaultArray();
    }
}
