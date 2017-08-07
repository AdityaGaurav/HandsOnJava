package com.handsonjava.operators;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by adityag on 2/25/17.
 */
public class BitwiseOperator {

    public static void main(String[] args){
        System.out.println(false & true);
        System.out.println(false | true);
        System.out.println(false & true);

    System.out.println(5>4 || 6>7);
    System.out.println(5>4 | 6>7);


        System.out.println(5 | 6);
//
        System.out.println(5 & 6);
        System.out.println(5 ^ 6);

        System.out.println(4 | 5);
        System.out.println(4 & 5);
        System.out.println(4 ^ 5);

        System.out.println(~2);

    }
}
