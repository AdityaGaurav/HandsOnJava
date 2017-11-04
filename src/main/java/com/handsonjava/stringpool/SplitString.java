package com.handsonjava.stringpool;

public class SplitString {
    public static void main(String[] args){
        String date = "2017/10/13";
        String[] splitS = date.split("/");
        for (String str: splitS) {
            System.out.println(str);
        }
        String date2 ="17\\10\\2017";
        String[] fromDate = date2.split( "\\\\");
    }
}
