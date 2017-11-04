package com.handsonjava.lambdas;

import java.util.function.BiConsumer;

public class ExceptionalHandlingLambda {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int key = 2;
        processData(input, key, wrapperLambda((v, k) -> System
                .out.println(v / k)));
    }

    private static void processData(int[] inp, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : inp) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception ocurred in Wrapper Method");
                e.printStackTrace();
            }
        };
    }
}
