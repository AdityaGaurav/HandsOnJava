package com.handsonjava.iproblems.ctci;

public class FizzBuzzProblem {
    /*

     */
    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            }
            return "fizz";
        } else {
            if (number % 5 == 0) {
                return "buzz";
            }
        }
        return String.valueOf(number);
    }

    static String fizzBuzzS(int number) {
        if (number % 15 == 0) {
            return "fizzBuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
       return String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzzProblem.fizzBuzzS(45));
    }
}
