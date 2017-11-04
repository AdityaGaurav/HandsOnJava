package com.handsonjava.oops.inheritance;

public class ChildPrac extends ParentPrac {
    ChildPrac(){
        System.out.println("ChildPrac: Constructor Block");
    }

    // Static Block
    static {
        System.out.println("ChildPrac: Static Block");
    }

    // Non-Static Block
    {
        System.out.println("ChildPrac: NonStatic Block");
    }

//    public static void main(String[] args) {
//        ParentPrac parentPrac = new ChildPrac();
//        System.out.println(a);
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);
//        System.out.println(a5);
//        System.out.println(a6);
//        System.out.println(parentPrac);
//        System.out.println(parentPrac.b);
//        System.out.println(parentPrac.b1);
//        System.out.println(parentPrac.b2);
//        System.out.println(parentPrac.b3);
//        System.out.println(parentPrac.b4);
//        System.out.println(parentPrac.b5);
//        System.out.println(parentPrac.b6);
//        printStaticMethod();
//    }
}
