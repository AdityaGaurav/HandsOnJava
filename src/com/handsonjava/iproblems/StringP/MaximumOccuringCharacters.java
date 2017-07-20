package com.handsonjava.iproblems.StringP;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adityag on 6/16/2017.
 */
public class MaximumOccuringCharacters {

    public static void findMaximumOccuringCharacters(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] tmp = input.replaceAll("\\s+","").toCharArray();
        for (char c : tmp) {
            Integer fre = map.get(c);
            map.put(c, (fre == null ? 1 : fre + 1));
        }
        System.out.println(input);
        System.out.println(map.size());
        System.out.println(map);
    }

    public static void main(String[] args) {
        findMaximumOccuringCharacters("Aaditya  Gau  ");
    }

}

