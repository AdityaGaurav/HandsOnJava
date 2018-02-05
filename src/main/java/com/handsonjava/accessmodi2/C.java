package com.handsonjava.accessmodi2;

import com.handsonjava.accessmodi.A;

public class C extends A {

    public void m4(){
        System.out.println(c);
        super.m1();
    }

    public static void m6(){
    }
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        C c1  = new C();
        System.out.println(c1.c);
        System.out.println(c1.c);
        System.out.println(c1.m1());
    }
}
