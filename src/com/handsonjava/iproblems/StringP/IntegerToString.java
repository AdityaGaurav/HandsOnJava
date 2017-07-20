package com.handsonjava.iproblems.StringP;

import java.util.HashMap;

/**
 * Created by adityag on 6/11/2017.
 */
public class IntegerToString {
    private static HashMap<Integer,String> collectionOfInteger(){
        HashMap<Integer,String> map;
        map = new HashMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        return map;
    }
    public static void convertIntegerToString(int input){
        HashMap<Integer,String> map = collectionOfInteger();
        String str = Integer.toString(input);
        int[] inputArray  = new int[str.length()];
        for(int i=0; i<inputArray.length; i++){
            inputArray[i] =str.charAt(i)-'0';
            System.out.print(map.get(inputArray[i])+" ");
        }
    }
    public static void main(String[] args){
        convertIntegerToString(123123110);
    }
}
