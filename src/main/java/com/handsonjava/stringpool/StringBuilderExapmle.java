package com.handsonjava.stringpool;

public class StringBuilderExapmle {

    public static void main(String[] args){
        String[] strings = new String[4];
        strings[0] ="Aditya";
        strings[1] ="Aditya";
        strings[2] ="Aditya";
        strings[3] ="Aditya";
        StringBuilder stringBuilder = new StringBuilder();
        for(String str: strings){
            stringBuilder.append(str+" ");
        }
        System.out.print(stringBuilder.toString().trim());
    }
}
