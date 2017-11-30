package com.handsonjava.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaBasics {
    public static void do_Calculation(LambdaInterface l, int a, int b) {
        int result = l.doCalculation(a, b);
        System.out.println(result);
    }

    public static void printMyMessage(){
        System.out.println("Hello Lambda");
    }

    public static void main(String[] args) {
        //do_Calculation((a, b) -> a + b, 4, 5);
        do_Calculation(Integer::sum, 4, 5);
        //do_Calculation((a, b) -> a * b, 4, 5);
        do_Calculation(Integer::max, 4, 5);
        do_Calculation((a, b) -> {
            if (a % 2 == 0) {
                return a + 1;
            } else {
                return a + b;

            }
        }, 4, 5);
//        Thread td = new Thread(()->printMyMessage());
        Thread td = new Thread(LambdaBasics::printMyMessage);
        td.start();

    }
}
