package com.handsonjava.premitivedatatype;

public class Test {
    public static void main(String[] args) {
        int i =9;
        char c  = (char)i;
        i =c;
        byte b = 120;
        b = (byte)c ;
        System.out.println(b);
        char c2 =(char) b;
        System.out.println(c2);

        short s =234;
        char v = (char)s;
        s = (short)v;

        char n = 97;
        System.out.println(n);
        System.out.println((char)i);

    }
}
