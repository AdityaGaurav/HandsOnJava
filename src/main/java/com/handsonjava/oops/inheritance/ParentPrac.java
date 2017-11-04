package com.handsonjava.oops.inheritance;

public class ParentPrac {
    // List of Static Variable or Class level Variable
    static int a;
    static byte a1;
    static short a2;
    static long a3;
    static float a4;
    static double a5;
    static char a6;

    static ParentPrac parentPrac;
    ParentPrac parentPrac2;

    // List of Instance Variable
    int b;
    byte b1;
    short b2;
    long b3;
    float b4;
    double b5;
    char b6;

    // Static Block
    static {
        System.out.println("ParentPrac: Static Block");
//        parentPrac = new ParentPrac();
    }

    // Non-Static Block
    {
        System.out.println("ParentPrac: NonStatic Block");
//        parentPrac = new ParentPrac();

    }

    public ParentPrac() {
        this(0, (byte) 0, (short) 0, 0);
        System.out.println("ParentPrac: Constructor Block");
    }

    ParentPrac(int b, byte b1, short b2, long b3) {
        System.out.println("ParentPrac: Constructor Block2");
    }

    public static void printStaticMethod() {
        System.out.println("ParentPrac: printStaticMethod");
    }

    public void printNonStaticMethod() {
        System.out.println("ParentPrac: printNonStaticMethod");
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
//        System.out.println(parentPrac);
//        System.out.println(parentPrac.b);
//        System.out.println(parentPrac.b1);
//        System.out.println(parentPrac.b2);
//        System.out.println(parentPrac.b3);
//        System.out.println(parentPrac.b4);
//        System.out.println(parentPrac.b5);
//        System.out.println(parentPrac.b6);
    }
}
