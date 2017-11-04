package com.handsonjava.finalkeyword;

public class FinalProperty {
    final static int i = 10;

    public static final void simplePrint(){

    }
    public static void main(String[] args) {
        final int i = 11;
        //i++;  Error: java: cannot assign a value to final variable i
//        i = 10+5; Error: java: cannot assign a value to final variable i
        System.out.println(FinalProperty.i);
    }
}
