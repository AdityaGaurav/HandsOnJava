package com.handsonjava.iproblems;

/**
 * Created by adityag on 7/2/2017.
 */
public class ReverseArray {
    public static int[] doReverseArray(int[] inp) {
        int length = inp.length;
        int[] reverse = new int[length];
        for (int i = 0; i < length; ++i) {
            reverse[i] = inp[length - i - 1];
        }
        return reverse;
    }

    public static void printReverseArray(int[] inp) {
        for (int i = inp.length - 1; i >= 0; --i) {
            System.out.println(inp[i]);
        }
    }

    public static void main(String[] a) {
        int[] inp = new int[]{1, 2, 3, 4};
        int[] result = doReverseArray(inp);
        printReverseArray(inp);
        for (int roll : result) {
            System.out.print(roll + " ");
        }
    }
}
