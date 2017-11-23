package com.handsonjava.iproblems.interview1;

import java.util.*;

public class DuplicateString {
    public static List<String> findDuplicatesWordsInString(String input) {
        if (input == null || input.length() < 0) {
            throw new IllegalArgumentException(input + " not a valid input");
        }
        Set<String> uniqueString = new HashSet<>();
        List<String> duplicatesString = new ArrayList<>();
        String[] inputs = input.split(" ");
        for (String str : inputs) {
            if (uniqueString.contains(str)) {
                duplicatesString.add(str);
            } else {
                uniqueString.add(str);
            }
        }
        return duplicatesString;
    }

    public static Map<String, Integer> findFrequencyOfWords(String inputString) {
        Map<String, Integer> frequencyOfWords = new HashMap<>();
        String[] inputs = inputString.split(" ");
        int count = 1;
        for (String str : inputs) {
            if (frequencyOfWords.containsKey(str)) {
                frequencyOfWords.put(str, frequencyOfWords.get(str) + 1);
            } else {
                frequencyOfWords.put(str, count);
            }
        }
        return frequencyOfWords;
    }

    public static void getHighestOccurringWord(String inputs){
        Map<String,Integer> word = new TreeMap<>(findFrequencyOfWords(inputs));
        int rank =0;
        String keyValue ="";
           for(String str: word.keySet()){
                int custom = word.get(str);
                if(rank < custom){
                    rank =custom;
                    keyValue = str;
                }
           }
           System.out.println(keyValue + " " +rank);
    }

    public static void main(String[] args) {
        System.out.println(findFrequencyOfWords("Aditya ga h h n k Aditya h h h h"));
       // getHighestOccurringWord("Aditya ga h h n k Aditya h h h h");
        getHighestOccurringWord("Aditya ga h h n k Aditya h h h h Aditya ga h h n k Aditya h h h h");

    }
}
