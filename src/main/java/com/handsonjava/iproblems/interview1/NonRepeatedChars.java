package com.handsonjava.iproblems.interview1;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatedChars {
    public static void findFirstNonRepeatedChars(String input){
        Set<Character> unique = new HashSet<>();
        int i=0;
        while(i< input.length()){
            if(!unique.contains(input.charAt(i))){
               unique.add(input.charAt(i));
            } else {
                break;
            }
            i++;
        }
        for(Character c :unique){
            System.out.println(c);
        }
    }

//    public void
    public static void main(String[] args) {
        findFirstNonRepeatedChars("GeeksForGeeks");
    }
}
