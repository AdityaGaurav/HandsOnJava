package com.handsonjava.conversionpromotion;

public class PrimitiveToString {
    public static void main(String[] args){
        int i = 100;
        boolean b = false;
        String int1 = Integer.toString(i);
        String bools = Boolean.toString(b);
        System.out.println(int1);
        System.out.println(bools);
    }
}
