package com.handsonjava.iproblems.interview1;

import java.util.HashMap;
import java.util.HashSet;

public class Anagram {
    public static boolean isAnagram(String input, String toMatch) {
        if (input == null || input.length() == 0) {
            throw new RuntimeException("Not a valid string");
        }
        if (input.length() != toMatch.length()) {
            return false;
        }
        HashSet<Character> inpts = new HashSet<>();
        char[] in = input.toCharArray();
        for (char c : in) {
            inpts.add(c);
        }
        for (char c : toMatch.toCharArray()) {
            if (inpts.contains(c)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("asssdfg", "fdsgssa"));
    }
}
