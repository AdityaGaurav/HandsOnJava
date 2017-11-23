package com.handsonjava.stringpool;

public class StringEquality {
    public static void main(String[] args){
        String s1 = "Aditya";
        String s2 = "Adi"+"tya";
        System.out.println(s1 == s2);
        String s3 = new String("Aditya");
        System.out.println(s1 == s3);
    }
}
