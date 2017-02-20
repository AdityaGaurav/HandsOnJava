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

        StringBuilder str = new StringBuilder();
        str.append('a');
        System.out.println(str);
        str.append('a');
        System.out.println(str);


        String name = "Aditya";
        char[] ch = name.toCharArray();


    }

}
