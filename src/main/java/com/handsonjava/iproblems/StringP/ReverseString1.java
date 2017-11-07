package com.handsonjava.iproblems.StringP;

public class ReverseString1 {
    public static String reverseString(String input) throws Exception {
        if (input == null || input.trim().length() == 0) {
            throw new Exception("Not a valid string");
        }
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }

    public static String reverseInPlace(String input) throws Exception {
        if (input == null || input.trim().length() == 0) {
            throw new Exception("Not a valid string");
        }
        String[] inputs = input.split(" ");
        String inplace = "";
        for (String str : inputs) {
            inplace += reverseString(str) + " ";
        }
        return inplace.trim();
    }

    public static String inPlaceReverse(final String input) {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++) {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }
        return builder.toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(inPlaceReverse(" Aditya gaurav"));
    }
}
