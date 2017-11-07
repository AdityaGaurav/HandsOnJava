package com.handsonjava.iproblems.interview1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static boolean isPrimeNumber(int number) {
        if(number ==2){
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i - 1 < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> listOfPrimeNumbers(int number) {
        List<Integer> listOfPrime = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i)) {
                listOfPrime.add(i);
            }
        }
        return listOfPrime;
    }


    public static void main(String[] args) {
        List<Integer> list = listOfPrimeNumbers(199);
        System.out.println("Total prime number: "+list.size());
        for(Integer ints: list){
            System.out.print(ints+" ");
        }
    }
}
