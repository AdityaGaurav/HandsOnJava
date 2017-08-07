package com.handsonjava.iproblems.StringP;

/**
 * Created by adityag on 6/16/2017.
 */
public class Palindrome {

    public static boolean isStringPalindrome(String input) {
        final String tmpInput = input.toLowerCase();
        System.out.println(tmpInput.length());
        char[] inputChar = tmpInput.toCharArray();
        System.out.println(inputChar.length);
        int i = 0;
        int j = inputChar.length - 1;
        for (int k = 0; k < inputChar.length; k++) {
            if (inputChar[i] == inputChar[j]) {
                ++i;
                --j;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("Dot saw I was Tod"));
    }
}
