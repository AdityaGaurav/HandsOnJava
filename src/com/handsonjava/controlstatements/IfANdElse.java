package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/4/17.
 */
public class IfANdElse {

    public static void implementIfElse(int number) {
        if (number == 0 || number < 0) {
            System.out.println("Illegal input");
        } else {
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }

        }
    }


    public static void main(String[] args) {
        implementIfElse(-1);
    }
}
