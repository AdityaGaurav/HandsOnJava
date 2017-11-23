package com.handsonjava.recursion;

public class MultiplyNumbers {
    public static void multiplyNumber(int range, int factor) {
        if (range == 1) {
            System.out.println(factor);
        } else {
            int num = range * factor;
            System.out.println(num);
            multiplyNumber(range - 1, factor);
        }
    }

    public static void main(String[] args) {
//        System.out.println(multiplyNumber(10, 5));
        multiplyNumber(10, 5);
    }
}
