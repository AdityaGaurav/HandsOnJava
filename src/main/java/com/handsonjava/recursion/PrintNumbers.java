package com.handsonjava.recursion;

public class PrintNumbers {
    public static void printNumbers(int range){
        if(range ==0 ){
            System.out.println(range);
        }else {
            System.out.println(range);
            printNumbers(range-1);
        }
    }
    public static void main(String[] args){
        printNumbers(7);
    }
}
