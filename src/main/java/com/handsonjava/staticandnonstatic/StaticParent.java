package com.handsonjava.staticandnonstatic;

public class StaticParent {
    static int a = setValue();
    static byte a1;
    static short a2;
    static long a3;
    static float a4;
    static double a5;
    static char a6;

    static int  setValue(){
        return 10;
    }
    static void prineStatic() {
        System.out.println("StaticParent: Static Method");
        System.out.println(a);
    }

    // Static Block
    static {
        System.out.println("ParentPrac: Static Block");
        System.out.println(a);
        System.out.println(StaticChild.a1);
    }
    public static void main(String[] args){

    }
}
