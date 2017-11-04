package com.handsonjava.keeppracticing;

public class MethodParameters {
    private static void printData(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    private static int[] returnIntAray(int[] inp) {
        return inp;
    }

    public static void main(String[] args) {
        int[] inp = {1, 2, 3, 4};
        printData(returnIntAray(inp));
    }
}
