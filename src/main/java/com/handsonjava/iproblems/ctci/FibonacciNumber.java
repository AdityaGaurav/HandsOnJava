package com.handsonjava.iproblems.ctci;

public class FibonacciNumber {
    static int[] getFibonacciNumber(int limit) {
        int a = 0, b = 1;
        if (limit <= 0) {
            throw new IllegalArgumentException(limit + " is not a valid input. " + limit + "should be < 0");
        }
//        if (limit == 1) {
//            return new int[]{a};
//        }
//        if (limit == 2) {
//            return new int[]{a, b};
//        }
        int[] ints = new int[limit];
        ints[0] = a;
        ints[1] = ints[0] + b;
        for (int i = 2; i < limit; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];

        }
        return ints;
    }

    public static void main(String[] args) {
        int[] result = getFibonacciNumber(15);
    for(int i : result ){
        System.out.println(i);
    }
    }
}
