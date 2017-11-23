package com.handsonjava.recursion;

public class FactorialNumber {
    public static int findFactorial(int number){
        if(number == 0){
            return 1;
        } else if(number ==1){
            return 1;
        } else {
            return number * findFactorial(number -1);
        }
    }
    public static void main(String[] args){
        System.out.println(findFactorial(5));
    }
}
