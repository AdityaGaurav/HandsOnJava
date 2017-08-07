package com.handsonjava.sorting;

import java.util.Scanner;

/**
 * Created by adityag on 7/10/2017.
 */
public class StringSort {
    static String name;
    public StringSort(){
           Scanner scn =null;
    }
    public StringSort(String name){
        this.name = name;
    }
    public static String getName(){
        return name;
    }
    public static void main(String[] args) {
        StringSort alice = new StringSort("Alice");
        StringSort bob = new StringSort("Bob");
        System.out.println("name: " + StringSort.getName());
    }
}
