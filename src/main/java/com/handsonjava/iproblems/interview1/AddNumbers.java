package com.handsonjava.iproblems.interview1;

public class AddNumbers {
    public static void main(String[] args){
        int a =10;
        int b = 9;
        System.out.println("Before swapping value of a: "+a);
        System.out.println("Before swapping value of b: "+b);
        a = a+b;
        b = a-b;
        a = a- b;
        System.out.println("After swapping value of a: "+a);
        System.out.println("After swapping value of b: "+b);
    }
}
