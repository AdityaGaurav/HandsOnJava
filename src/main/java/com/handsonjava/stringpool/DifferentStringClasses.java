package com.handsonjava.stringpool;

/**
 * Created by adityag on 6/16/2017.
 */
public class DifferentStringClasses {

    // String
    public static void createString(){
        //String literals
        String str ="Aditya";
        //Using String constructor
        String str1 = new String("Aditya");
        char[] str3 = new char[]{'A','d','i','t','y','a'};
        String str4 = new String(str3);
        //using equals
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str4));
        System.out.println(str1.equals(str4));
        //using equality operator
        System.out.println(str == str1);
        System.out.println(str == str4);
        System.out.println(str1==str4);
    }
    public static void main(String[] args){
        createString();
    }
}
