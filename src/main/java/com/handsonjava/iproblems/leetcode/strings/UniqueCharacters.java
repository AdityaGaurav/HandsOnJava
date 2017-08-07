package com.handsonjava.iproblems.leetcode.strings;

public class UniqueCharacters {
    public static boolean isUniqueCharacter(String input){
        if(input.length()> 128){
            return false;
        }
        boolean[] charSet = new boolean[128];
        for(int i =0; i< input.length(); i++){
            int val = input.charAt(i);
            if(charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isUniqueCharacter("Aditya"));
    }
}
