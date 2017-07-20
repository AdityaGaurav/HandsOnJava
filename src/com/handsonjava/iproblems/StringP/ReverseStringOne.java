package com.handsonjava.iproblems.StringP;

/**
 * Created by adityag on 6/11/2017.
 */
public class ReverseStringOne {
    public static String doReverseString(String input) {
        char[] inputCharArray = input.toCharArray();
        char[] reverseCharArray = new char[inputCharArray.length];
        for (int i = 0; i < inputCharArray.length; i++) {
            reverseCharArray[i] = inputCharArray[inputCharArray.length - 1 - i];
        }
//        input = new String(reverseCharArray);
        return (new String(reverseCharArray));
    }

    public static String doReverseStringInPlace(String input) {
//        String input1 = "";
//        String[] inputStringArray = input.split(" ");
//        char[] inputcharArray = input.toCharArray();
//        char[] reverseCharArray = new char[inputcharArray.length];
//        for (int j = 0; j < inputcharArray.length; j++) {
//            reverseCharArray[j] = inputcharArray[inputcharArray.length - 1 - j];
//        }
//        input1 = input1 + " " + new String(reverseCharArray);
//        return input1.trim();
        char[] inputcharArray = input.toCharArray();
        char[] reverseCharArray = new char[inputcharArray.length];
        for (int j = 0; j < inputcharArray.length; j++) {
            reverseCharArray[j] = inputcharArray[inputcharArray.length - 1 - j];
        }
        return (new String(reverseCharArray));
    }
    public static String reverseWords(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {   // when i is a non-space
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') { j++; } // move j to the end of the word
                reverse(ca, i, j);
                i = j;
            }
        }
        return new String(ca);
    }

    private static void reverse(char[] ca, int i, int j) {
        for (; i < j; i++, j--) {
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
        }
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
