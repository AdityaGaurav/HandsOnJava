package com.practicejava.mapp;

import java.util.HashMap;
import java.util.Map;

public class HashMapP {
    public static void main(String[] args) {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("1","Aditya");
        stringStringMap.put("2","ditya");
        stringStringMap.put("3","itya");
        stringStringMap.put("4","tya");

        //foreach keySet
        for(String s : stringStringMap.keySet()){
            System.out.println(s);
        }

        //foreach entrySet
        for(Map.Entry<String, String> stringStringEntry : stringStringMap.entrySet()){
            System.out.print(stringStringEntry.getKey()+" : ");
            System.out.println(stringStringEntry.getValue());
        }

        //foreach value
        for(String s : stringStringMap.values()){
            System.out.println(s);
        }
    }
}
