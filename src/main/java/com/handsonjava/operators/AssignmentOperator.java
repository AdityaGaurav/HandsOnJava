package com.handsonjava.operators;

/**
 * Created by adityag on 7/19/2017.
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 11;
        int c = a++;
        System.out.println(c);
        System.out.println(a);
        int d = --a;
        System.out.println(d);
        System.out.println(a);
    }
}
