package com.handsonjava.recursion;

public class SumOfTable {
    public static int findTotalOfTable(int number, int factor){
        if(number ==1){
            return  factor;
        } else {
            return number * factor + findTotalOfTable(number -1, factor);
        }
    }

    public static void main(String[] args){
        System.out.println(findTotalOfTable(5,2));
    }
}
