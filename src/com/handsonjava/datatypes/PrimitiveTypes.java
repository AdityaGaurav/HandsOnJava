package com.handsonjava.datatypes;

/**
 * Created by adityag on 2/10/17.
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        String str = "Aditya";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            sum += str.charAt(i);

        }

        System.out.println(sum);

    }

}
