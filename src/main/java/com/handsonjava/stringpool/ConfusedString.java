package com.handsonjava.stringpool;

/**
 * Created by adityag on 2/7/17.
 */
public class ConfusedString {
    final char[] ch;

    public ConfusedString(char[] ch) {
        this.ch = ch;
    }

    public static void main(String[] args){
        String s ="Aditya";
        String s2 ="Aditya";
        System.out.println(s ==s2);
        String s3 = new String("Aditya");
        System.out.println(s2.equals(s3));
        String s5 = "Gaurav";
        String s6 = "Adi"+"tya";
        s3 = s5;
        System.out.println(s3 == s5);
        System.out.println(s6 == s);

//        StringBuilder str = new StringBuilder();
//        str.append('a');
//        System.out.println(str);
//        str.append('a');
//        System.out.println(str);
//
//
//        String name = "Aditya";
//        char[] ch = name.toCharArray();


    }

}
