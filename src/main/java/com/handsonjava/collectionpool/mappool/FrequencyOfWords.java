package com.handsonjava.collectionpool.mappool;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by adityag on 2/9/17.
 */
public class FrequencyOfWords {

    public static void findFrequencyOfWordsUsingHashMap(String input) {
        String[] tempInput = input.split(" ");

        Map<String, Integer> pool = new HashMap<String, Integer>();
//        System.out.println(pool.get)

        for (String s : tempInput) {
            Integer frequency = pool.get(s);
            pool.put(s, (frequency == null) ? 1 : frequency + 1);
        }

        System.out.println(pool.size());
        System.out.println(pool);
    }


    public static void findFrequencyOfWodsUsingTreeMap(String inputs) {
        String[] tempInputs = inputs.split(" ");

        Map<String, Integer> pool = new TreeMap<String, Integer>();

        for (String str : tempInputs) {
            Integer frequency = pool.get(str);
            pool.put(str, (frequency == null) ? 1 : frequency + 1);
        }

        System.out.println(pool.size());
        System.out.println(pool);
    }

    public static void findFrequencyOfWodsUsingLinkedHashMap(String inputs) {
        String[] tempInput = inputs.split(" ");

        Map<String, Integer> pool = new LinkedHashMap<String, Integer>();

        for (String str : tempInput) {
            Integer frequency = pool.get(str);
            pool.put(str, (frequency == null) ? 1 : frequency + 1);
        }

        System.out.println(pool.size());
        System.out.println(pool);
    }

    public static void findFrequencyOfCharacters(String inputs) {
        char[] ch = inputs.toCharArray();
        Map<Character, Integer> pool = new LinkedHashMap<Character, Integer>();

        for (char c : ch) {
            Integer i = pool.get(c);
            pool.put(c, (i == null) ? 1 : i + 1);
        }
        pool.remove(' ');
        System.out.println(pool.size());
        System.out.println(pool);
    }


    public static void main(String[] args) {
        findFrequencyOfCharacters("aditya ade aa aa aaa a ae is is is is is j j java ar ar");
    }
}
