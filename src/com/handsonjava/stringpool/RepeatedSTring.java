package com.handsonjava.stringpool;

import java.util.HashMap;

/**
 * Created by adityag on 4/30/2017.
 */
public class RepeatedSTring {

    public static void countRepeatedString(String input) {
        int count = 0;
        String[] inputs = input.split(" ");
        HashMap<String, Integer> countString = new HashMap<String, Integer>();
        for (String str : inputs) {
            Integer frequency = countString.get(str);
            countString.put(str, (frequency == null) ? 1 : frequency + 1);
        }
        for (String roll : countString.keySet()) {
            System.out.println(roll + " : " + countString.get(roll));
//            System.out.print(countString.get(roll) + "\n");
        }
    }

    public static void main(String[] args) {
        String input = "aaaa aaa aa a a a ";
        countRepeatedString(input);
    }
}
