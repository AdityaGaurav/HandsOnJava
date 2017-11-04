package com.handsonjava.staticandnonstatic;

public class StaticChild extends StaticParent {
//    static int a = setValue();
    static byte a1=20;
//    static short a2;
//    static long a3;
//    static float a4;
//    static double a5;
//    static char a6;

    static int setValue() {
        return 1;
    }

    static void prineStatic() {
        System.out.println("StaticChild: Static Method");
    }

    // Static Block
    static {
        System.out.println("StaticChild: Static Block");
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(a1);
    }
}
