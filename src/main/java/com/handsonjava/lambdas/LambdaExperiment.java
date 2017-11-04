package com.handsonjava.lambdas;

public class LambdaExperiment {
    public static void printIT(String[] input, LambdaFunctional lambdaFunctional) {
        lambdaFunctional.main(input);
    }

    public static void main(String[] args) {
        String[] names = {"Aditya", "Gaurav"};
        printIT(names, a ->
        {
            for (String s : a) {
                System.out.println(s);
            }

        });
    }
}
