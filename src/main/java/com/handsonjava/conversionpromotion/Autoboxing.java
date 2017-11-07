package com.handsonjava.conversionpromotion;

public class Autoboxing {
    public static void main(String[] args){
        float f = 0.02f;
        Float f2 = f;
        float f3 =Float.NaN;
        float f4 = f2;
        float f5 = 1.65020f;
        Integer i2 = (int)f5;
        System.out.println(i2);
    }
}
