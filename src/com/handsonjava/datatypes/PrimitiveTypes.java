package com.handsonjava.datatypes;

/**
 * Created by adityag on 2/10/17.
 */
public class PrimitiveTypes {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bo;

    public static void main(String[] args) {
//        byte b;
//        short s;
//        int i;
//        long l;
//        float f;
//        double d;
//        char c;
//        boolean bo;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bo);
        String str = "Aditya";
        int sum = 0;
        char s;
        for (int i = 0; i < str.length(); i++) {
            s=str.charAt(i);
            System.out.println(s);
            sum += s;
        }
        System.out.println(sum);
    }
}
