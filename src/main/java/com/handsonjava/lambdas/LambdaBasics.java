package com.handsonjava.lambdas;

import java.util.function.Function;

public class LambdaBasics<T> {
    public <F> F untilExecute(Function<? super T, F> fFunction) {
        T t = null;
        F value = fFunction.apply(t);
        System.out.println(value);
        return value;
    }


    static Function<Integer, Boolean> isEvenNumber(int number) {
        return (ele) -> number % 2 == 0;
    }

    static Function<Integer, String> retroDDOO(int number) {
        return (ele) -> {
            if (ele % 2 == 0) {
                return "Number is EVEN";
            } else {
                return "Number is ODD";
            }
        };
    }

    public static void main(String[] args) {
        LambdaBasics lambdaBasics = new LambdaBasics();
        System.out.println(lambdaBasics.addOnlyEven(4));
        lambdaBasics.untilExecute(retroDDOO(5));


    }

    public class Add {
        public boolean isEven(int number) {
            return number % 2 == 0;
        }

    }

    public int addOnlyEven(int n) {
        int number = 2;
        Add add = new Add();
        if (add.isEven(n))
            return n + number;
        else
            return number;
    }
}
