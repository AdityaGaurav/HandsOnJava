package com.handsonjava.staticandnonstatic;

public class NonStaticParent {
    int x = 10;

    {
        System.out.println("NonStaticParent: Non-Static Block");
        System.out.println(x);
    }

    NonStaticParent() {
        System.out.println("NonStaticParent: Constructor");
//        x = 10;
    }
}
