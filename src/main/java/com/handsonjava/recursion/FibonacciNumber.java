package com.handsonjava.recursion;

public class FibonacciNumber {
    static int c = 0;
    static int a = 0, b = 1;

    public static void printFibonacciSeries(int range) {

        if (range == 0) {
            System.out.println(range);
        } else {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            printFibonacciSeries(range - 1);
        }
    }

    public static int fibonacciNumbers(int range){
        if(range ==0 ){
            return 0;
        } else if(range ==1) {
            return 1;
        } else {
            return fibonacciNumbers(range -1) + fibonacciNumbers( range -2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNumbers(8));
    }
}
