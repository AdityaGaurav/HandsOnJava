package com.handsonjava.iproblems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by adityag on 6/9/2017.
 */
public class PrimeNumber {
    public static boolean isPrimeNumber(int n) throws Exception {
        if (n < 1) {
            throw new Exception("should be greater than 1");
        }
        boolean isPrime = true;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }

    public static Set<Integer> getListOfIntegers(int... numbers) throws Exception {
        Set<Integer> integers = new HashSet<>();
        for(int n : numbers){
            if(isPrimeNumber(n)){
                integers.add(n);
            }
        }
        return integers;
    }

    public static void main(String[] args) throws Exception {
        getListOfIntegers();
    }
}
