package com.practicejava.stringp;

import java.util.Objects;

public class ReverseString {
    public static String reverseString(String input) {
        Objects.requireNonNull(input);
        if (input.trim().length() == 0) {
            throw new IllegalArgumentException("");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            stringBuilder.append(input.charAt(input.length() - i - 1));
        }
        return stringBuilder.toString();
    }

    public static String inPlaceReverse(String input) {
        Objects.requireNonNull(input);
        if (input.trim().length() == 0) {
            throw new IllegalArgumentException("");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        String restOfTheString = getSubString(input," ",0);
        for (int i=0; i< restOfTheString.length(); i++){
            stringBuilder.append(restOfTheString.charAt(restOfTheString.length()-i-1));
        }
        return stringBuilder.toString();
    }

    private static String getSubString(String input, String pattern, int startingIndex){
        Objects.requireNonNull(input);
        Objects.requireNonNull(pattern);
        return input.substring(startingIndex, input.indexOf(pattern));
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Ad Fg OO"));
    }
}
