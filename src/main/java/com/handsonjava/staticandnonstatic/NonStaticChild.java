package com.handsonjava.staticandnonstatic;

public class NonStaticChild extends NonStaticParent {
    int y = 10;

    {
        System.out.println("NonStaticChild: Non-Static Block");
        System.out.println(x);
        System.out.println(y);
    }

    NonStaticChild() {
        super();
        System.out.println("NonStaticChild: Constructor");
        y = 10;
    }
    public static void main(String[] args){
        NonStaticChild nonStaticChild =new NonStaticChild();
        System.out.println(nonStaticChild.x);
        System.out.println(nonStaticChild.y);
    }
}
