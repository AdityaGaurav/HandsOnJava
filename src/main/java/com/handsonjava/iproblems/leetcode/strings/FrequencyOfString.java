package com.handsonjava.iproblems.leetcode.strings;

import java.util.*;

public class FrequencyOfString {
    public static void findFrequencyOfString(String[] input, String match){
        if(match.trim().length()==0 || match == null){
            return;
        }
        if(input.length == 0|| input == null){
            return;
        }
        Map<String, Integer> frequency = new HashMap<>();
        for(String itr : input){
            if(frequency.containsKey(itr)){
                frequency.put(itr, frequency.get(itr)+1);
            } else{
                frequency.put(itr,1);
            }
        }
        Integer reult =frequency.get(match);
        if(reult == null){
            System.out.println(match+" is not present in the given list of String");
        }else {
            System.out.println("Occurance of "+ match+" :"+reult);
        }
//        frequency.get(match);

    }
    public static void findFrequencyOfString(List<String> input, String match){
        if(input != null) {
            System.out.println(Collections.frequency(input, match));
        } else {
            System.out.println(match+" is not present in the given list of String");
        }
    }

    public static void main(String[] args){
        String[] input ={"abc", "abc","bcd","abc"};
        List<String> inp = Arrays.asList(input);
        findFrequencyOfString(inp,"abc");
    }
}
