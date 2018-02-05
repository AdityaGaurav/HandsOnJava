package com.practicejava.listp;

import java.util.*;

public class ArrayListTest {


    public static void main(String[] args) {
        final List<Integer> input = new ArrayList<>();
        System.out.println(input.add(1));
        System.out.println(input.add(4));
        System.out.println(input.add(2));
        System.out.println(input.add(2));
        System.out.println(input.add(2));
        System.out.println(input.add(3));
        for(int i :input){
            System.out.println(i);
        }

        Set<Integer> s = new HashSet(input);
        for(int i : s){
            System.out.println("Set "+ i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>(input);
        for(int i : linkedList){
            System.out.println("LinkedList"+ i );
        }
//        Integer[] intArray = new Integer[input.size()];
//        Integer[] i2 = input.toArray(intArray);
//        Map<String, String> mapIn = new HashMap<>();
//        mapIn.put("firstName", "Aditya");
//        mapIn.put("lasttName", "Aditya");
//        mapIn.put("middleName", "Aditya");
//
//        List<Map<String, String>> listIn = new ArrayList<>();
//        listIn.add(mapIn);

//        for (Map<String, String> m : listIn) {
//            for (String value : m.values()) {
//                System.out.println(value);
//            }
//        }

//        Map<Map<String, String>, List<Map<String, String>>> mapList = new HashMap<>();
//        mapList.put(mapIn, listIn);
//        mapList.put(mapIn, listIn);
//        mapList.put(mapIn, listIn);
//        for (Map<String, String> m : mapList.keySet()) {
//            for (String s : m.keySet()) {
//                System.out.println(s);
//            }
//        }

//        for (Map.Entry<Map<String, String>, List<Map<String, String>>> entry : mapList.entrySet()) {
//            for (String s : entry.getKey().keySet()) {
//                System.out.println(s + " " + entry.getKey().get(s));
//            }
//
//
//        }

//        for(){
//        List<String> inputString = new ArrayList<>();
//        inputString.add("a");
//        for(String s: inputString){
//
//        }
//        Iterator<String> itr = inputString.iterator();
//        while(itr.hasNext()){
//            itr.next();
//        }
    }
}
