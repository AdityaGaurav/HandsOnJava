package com.handsonjava.lambdaexpression;

import java.util.function.Predicate;

public class EvenOddLambda {
    public static void main(String[] args){
        Predicate<Integer> booleanPredicate = (a)->{
            if(a % 2 == 0){
                return true;
            }
            return false;
        } ;

        boolean b = booleanPredicate.test(5);
        System.out.println(b);

    }

}
