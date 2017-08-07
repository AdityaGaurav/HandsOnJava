package com.handsonjava.operators;

/**
 * Created by adityag on 7/18/2017.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean result = true;
        boolean result1 = false;
        if (result == false && result1 == false) {
            System.out.println("AND logical operator");
        }
        if (result1 == false && result == false) {
            System.out.println("AND logical operator");
        }

        if (result == false || result1 == false) {
            System.out.println("OR logical operator");
        }
        if (result == false || result1 == false) {
            System.out.println("OR logical operator");
        }
    }
}
