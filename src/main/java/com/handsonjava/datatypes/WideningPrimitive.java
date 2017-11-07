package com.handsonjava.datatypes;

public class WideningPrimitive {
    public static void main(String[] args){
        int a = 100;
        byte b =10;
        short s = 101;
        long l = 100L;
        char c = 'c';
        char d2 =10;
        float f1 = Float.NaN;
// Widening
        a= b;
        s =b;
        l =a;
        float f = 10.01f;
        double d = 20.02d;
        f = (float)d;
        f = c;
        int i2 = (int) f1;

        System.out.println(0.0f/0.0f);
        System.out.println(0.0d/0.0f);
        System.out.println(1.0f/0.0f);
        System.out.println(-1.0f/0.0f);
        System.out.println(i2);

    }
}
