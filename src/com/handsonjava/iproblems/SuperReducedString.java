package com.handsonjava.iproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by adityag on 7/6/2017.
 */
public class SuperReducedString {

    protected SuperReducedString(){
        super();
    }
    public static String reduceString(String inp) {
        char[] ary = inp.trim().toCharArray();
        StringBuilder newStr;
        int len = ary.length;
        if (len == 0) {
            return "Empty String";
        }
        if (len == 2) {
            if (ary[0] == ary[1]) {
                return "Empty String";
            } else {
                return inp;
            }
        } else {
            newStr = new StringBuilder();
            for (int i = 0; i < len - 1; i++) {
                if (ary[i] != ary[i + 1]) {
                    newStr.append(ary[i]);
                    if (i + 1 == len - 1) {
                        newStr.append(ary[i + 1]);
                    }
                } else {
                    if (i + 1 == len - 1) {
                        return "Empty String";
                    }
                    i = i + 1;
                }
            }
        }
        return new String(newStr);
    }

    public static String performReduceString(String inp) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < inp.length(); i++) {
            Character c = inp.charAt(i);
            Integer frequency = map.get(c);
            map.put(c, (frequency == null) ? 1 : frequency + 1);
        }
        StringBuilder newReducedString = new StringBuilder();
        for (char c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                newReducedString.append(c);
            }
        }
        if (newReducedString.length() == 0) {
            return "Empty String";
        }
        return new String(newReducedString);
    }

    public static void main(String[] args) {
        String result = performReduceString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh");
        System.out.println(result);
    }
}
